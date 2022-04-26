package com.zwq.ssm.constant;

import java.util.List;

/**
 * description: 数据返回规范
 *
 * @author zwq
 * @date 2021/7/11 9:42
 */
public class PropertyMsg {


    private int code;

    private int count;

    private Object data;

    private String msg;

    /**
     * description: 无数据成功返回
     * @author zwq
     * @date 2021/9/8 20:45
     * @param
     * @return com.zwq.websocket2.constants.Sms
     */
    public static PropertyMsg ok(){
        return new PropertyMsg(0, 1000, null, "操作成功");
    }

    /**
     * description: 一般数据成功返回
     * @author zwq
     * @date 2021/7/11 10:06
     * @param data 返回数据
     * @return com.zwq.websocket2.constants.Sms
     */
    public static PropertyMsg ok(Object data){
        return new PropertyMsg(0, 1000, data, "操作成功");
    }


    /**
     * description: 自定义消息成功返回
     * @author zwq
     * @date 2021/9/8 20:58
     * @param obj
     * @param msg
     * @return com.zwq.websocket2.constants.Sms
     */
    public static PropertyMsg okMsg(Object obj,String msg){
        return new PropertyMsg(0, 1000, obj, msg);
    }



    /**
     * description: 无数据失败返回
     * @author zwq
     * @date 2021/9/8 21:33
     * @param msg 信息
     * @return com.zwq.websocket2.constants.Sms
     */
    public static PropertyMsg wrong(String msg){
        return new PropertyMsg(1, 1000, null, msg);
    }




    /**
     * description: 一般数据失败返回
     * @author zwq
     * @date 2021/9/8 21:34
     * @param obj 数据
     * @param msg 信息
     * @return com.zwq.websocket2.constants.Sms
     */
    public static PropertyMsg wrong(Object obj,String msg){
        return new PropertyMsg(1, 1000, obj, msg);
    }


    public PropertyMsg() {
    }

    public PropertyMsg(int code, int count, Object data, String msg) {
        this.code = code;
        this.count = count;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PropertyMsg{" +
                "code=" + code +
                ", count=" + count +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }



}
