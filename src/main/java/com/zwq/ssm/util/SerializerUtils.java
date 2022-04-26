package com.zwq.ssm.util;

import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author luoyh
 * @date Jan 19, 2016
 */
public abstract class SerializerUtils {
	private static StringRedisSerializer string = new StringRedisSerializer();
	private static JdkSerializationRedisSerializer jdk = new JdkSerializationRedisSerializer();
	
	public static String stringDeserialize(byte[] bytes) {
		return string.deserialize(bytes);
	}
	public static byte[] stringSerialize(String str) {
		return string.serialize(str);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T objectDeserialize(byte[] bytes) {
		return (T) jdk.deserialize(bytes);
	}

	public static <T> byte[] objectSerialize(T t) {
		return jdk.serialize(t);
	}
	
	
}
