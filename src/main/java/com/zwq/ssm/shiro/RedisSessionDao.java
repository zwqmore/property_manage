package com.zwq.ssm.shiro;

import com.zwq.ssm.comm.Cons;
import com.zwq.ssm.dt.UserDT;
import com.zwq.ssm.util.JedisManager;
import com.zwq.ssm.util.SerializerUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.AbstractSessionDAO;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * description: 将session存入redis的类
 * @author zwq
 * @date 2021/12/15 10:23
 */
public class RedisSessionDao extends AbstractSessionDAO {
	
	private static final String SESSION_PREFIX = Cons.SESSION_PREFIX;
	private static final long AGE_OTH = 1800l;
	private JedisManager jedisManager;

	public JedisManager getJedisManager() {
		return jedisManager;
	}

	public void setJedisManager(JedisManager jedisManager) {
		this.jedisManager = jedisManager;
	}

	@Override
	public void update(Session session) throws UnknownSessionException {
		saveSession(session);
	}
	
	private void saveSession(Session session) {
		System.out.println(session);
		if(null == session || null == session.getId()) {
			return;
		}
		Object target = session.getAttribute(Cons.USER_SESSION_ID);
		if(null == target) {
			jedisManager.putObject(SESSION_PREFIX + session.getId(), session, session.getTimeout() / 1000);
			return;
		}
		if(target instanceof UserDT) {
			UserDT UserDT = ((UserDT) target);
			jedisManager.putObject(SESSION_PREFIX + session.getId(), session, AGE_OTH);

		} else {
			jedisManager.putObject(SESSION_PREFIX + session.getId(), session, AGE_OTH);
		}
	}

	@Override
	public void delete(Session session) {
		jedisManager.del(SESSION_PREFIX + session.getId());
	}

	@Override
	public Collection<Session> getActiveSessions() {
		Set<byte[]> keys = jedisManager.keys(SESSION_PREFIX + "*");
		Set<Session> sessions = new HashSet<Session>();
		if(null != keys && !keys.isEmpty()) {
			for(byte[] key : keys) {
				Session session = SerializerUtils.objectDeserialize(key);
				if(null != session) {
					sessions.add(session);
				}
			}
		}
		return sessions;
	}

	@Override
	protected Serializable doCreate(Session session) {
		Serializable sessionId = generateSessionId(session);    
        assignSessionId(session, sessionId);  
        saveSession(session);  
        return sessionId;
	}

	@Override
	protected Session doReadSession(Serializable sessionId) {
		if(sessionId == null){  
		    return null;  
		}
		return jedisManager.getObject(SESSION_PREFIX + sessionId, Session.class);
	}

}
