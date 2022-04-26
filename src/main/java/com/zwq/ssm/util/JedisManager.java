package com.zwq.ssm.util;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.io.Serializable;
import java.util.Set;

/**
 * description: redis工具
 * @author zwq
 * @date 2021/12/15 10:24
 */
@SuppressWarnings("unchecked")
public class JedisManager {
	
	private RedisTemplate<Serializable, Serializable> redisTemplate;

	
	public boolean setnx(final String key) {
		return redisTemplate.execute(new RedisCallback<Boolean>() {

			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				long now = System.currentTimeMillis();
				RedisSerializer<Long> ds = (RedisSerializer<Long>) redisTemplate.getDefaultSerializer();
				return connection.setNX(redisTemplate.getStringSerializer().serialize(key), ds.serialize(now));
			}
			
		});
	}

	public long getset(final String key) {
		return redisTemplate.execute(new RedisCallback<Long>() {

			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				long now = System.currentTimeMillis();
				RedisSerializer<Long> ds = (RedisSerializer<Long>) redisTemplate.getDefaultSerializer();
				byte[] ret = connection.getSet(redisTemplate.getStringSerializer().serialize(key), ds.serialize(now));
				return ds.deserialize(ret);
			}
			
		});
	}
	public int dbSize() {
		return redisTemplate.execute(new RedisCallback<Integer>() {

			@Override
			public Integer doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.dbSize().intValue();
			}
			
		});
	}

	public void flushAll() {
		redisTemplate.execute(new RedisCallback<Object>() {

			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.flushAll();
				return null;
			}
			
		});
	}
	
	public void flushDb() {
		redisTemplate.execute(new RedisCallback<Object>() {

			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.flushDb();
				return null;
			}
			
		});
	}
	
	public Set<byte[]> keys(final String partten) {
		 return redisTemplate.execute(new RedisCallback<Set<byte[]>>() {

			@Override
			public Set<byte[]> doInRedis(RedisConnection connection) throws DataAccessException {
				//connection.keys(pattern)//"shirosid_"
				byte[] p = redisTemplate.getStringSerializer().serialize(partten);
				Set<byte[]> keys = connection.keys(p);
				return keys;
			}
			
		});
	}

	public void del(final String ... keys) {
		redisTemplate.execute(new RedisCallback<Object>() {
			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				if(null != keys && keys.length > 0) {
					byte[][] ks = new byte[keys.length][1];
					int i = 0;
					for(String key : keys ) {
						byte[] k = redisTemplate.getStringSerializer().serialize(key);
						ks[i ++] = k;
					}
					connection.del(ks);
				}
				return null;
			}
		});
	}
	
	public <T> T getObject(final String key, final Class<T> t) {
		try {
			return redisTemplate.execute(new RedisCallback<T>() {
				@Override
				public T doInRedis(RedisConnection connection) throws DataAccessException {
					byte[] k = redisTemplate.getStringSerializer().serialize(key);
					return (T) redisTemplate.getDefaultSerializer().deserialize(connection.get(k));
//					Jackson2JsonRedisSerializer<T> ser = new Jackson2JsonRedisSerializer<T>(t);
//					return ser.deserialize(connection.get(k));
				}
			});
		} catch(Exception ex) {
			//ex.printStackTrace();
			return null;
		}
	}
	
	public <T> T getObject(final String key) {
		try {
			return redisTemplate.execute(new RedisCallback<T>() {
				@Override
				public T doInRedis(RedisConnection connection) throws DataAccessException {
					byte[] k = redisTemplate.getStringSerializer().serialize(key);
					return (T) redisTemplate.getDefaultSerializer().deserialize(connection.get(k));
//					Jackson2JsonRedisSerializer<T> ser = new Jackson2JsonRedisSerializer<T>(t);
//					return ser.deserialize(connection.get(k));
				}
			});
		} catch(Exception ex) {
			//ex.printStackTrace();
			return null;
		}
	}

	public <T> T putObject(final String key, final T t) {
		return redisTemplate.execute(new RedisCallback<T>() {
			@Override
			public T doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] k = redisTemplate.getStringSerializer().serialize(key);
				RedisSerializer<T> ds = (RedisSerializer<T>) redisTemplate.getDefaultSerializer();
				connection.set(k, ds.serialize(t));
				//Jackson2JsonRedisSerializer<T> ser = new Jackson2JsonRedisSerializer<T>((Class<T>) t.getClass());
				//connection.set(k, ser.serialize(t));
				return null;
			}
		});
	}
	
	public <T> void putObject(final String key, final T t, final long sec) {
		if(sec <= 0) {
		//	del(key);
		} else {
			redisTemplate.execute(new RedisCallback<T>() {
				@Override
				public T doInRedis(RedisConnection connection) throws DataAccessException {
					byte[] k = redisTemplate.getStringSerializer().serialize(key);
					RedisSerializer<T> ds = (RedisSerializer<T>) redisTemplate.getDefaultSerializer();
					connection.setEx(k, sec, ds.serialize(t));
					//Jackson2JsonRedisSerializer<T> ser = new Jackson2JsonRedisSerializer<T>((Class<T>) t.getClass());
					//connection.setEx(k, sec, ser.serialize(t));
					//connection.del(keys)
					return null;
				}
			});
		}
	}
	
	public String get(final String key) {
		try {
			return redisTemplate.execute(new RedisCallback<String>() {

				@Override
				public String doInRedis(RedisConnection connection) throws DataAccessException {
					byte[] k = redisTemplate.getStringSerializer().serialize(key);
					return redisTemplate.getStringSerializer().deserialize(connection.get(k));
				}
			});
		} catch(Exception ex) {
			//ex.printStackTrace();
			return null;
		}
	}

	public void put(final String key, final String value, final long sec) {
		redisTemplate.execute(new RedisCallback<String>() {

			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] k = redisTemplate.getStringSerializer().serialize( key);
				byte[] val = redisTemplate.getStringSerializer().serialize(value);
				connection.setEx(k, sec, val);
				return null;
			}
		});
	}
	public void put(final String key, final String value) {
		redisTemplate.execute(new RedisCallback<String>() {

			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] k = redisTemplate.getStringSerializer().serialize( key);
				byte[] val = redisTemplate.getStringSerializer().serialize(value);
				connection.set(k, val);
				return null;
			}
		});
	}

	public RedisTemplate<Serializable, Serializable> getRedisTemplate() {
		return redisTemplate;
	}

	public void setRedisTemplate(RedisTemplate<Serializable, Serializable> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

}
