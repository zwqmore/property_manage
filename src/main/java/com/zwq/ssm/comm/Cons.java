package com.zwq.ssm.comm;

/**
 * description: 静态常量
 * @author zwq
 * @date 2021/12/15 9:51
 */
public class Cons {

	public static final int USER_ADMIN = -1;

	/** 登录用户的session ID */
	public static final String USER_SESSION_ID = "TENEMENT_USER";

	/** 当前系统的所有权限 */
	public static final String SYSTEM_PERMISSION = "SYSTEM_PERMISSION";

	public final static String AUTH_NORMAL = "normal";
	public final static String AUTH_ALL = "SUPER_MAN";

	public final static String SESSION_PREFIX = "property_manage";

	public final static String DEFAULT_PASS = "000000";

	public final static byte MANAGER = 1;

	public final static byte PROPERTY = 0;

}
