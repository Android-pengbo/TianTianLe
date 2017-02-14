package com.tiantianle.utils;

/**
 * Created by Administrator on 2017/2/8.
 * <p>
 * 所有api接口
 */

public interface HttpApi {

    String API = "http://192.168.1.192:8022"; //主地址

//    String API = "http://192.168.1.192:24528/";  //测试地址

    String MY_MESSAGE = API + "/api/message"; //我的消息

    String MY_MESSAGE_DELETE_ALL = API + "/api/deletemessagebyaccount"; //删除全部消息接口

    String MY_MESSAGE_DELETE = API + "/api/delmessage"; //删除一个消息接口

    String CHANGE_PASSWORD = API + "/appaccount/updatepwd"; //修改登录密码

    String MODIFY_trading_PASSWORD = API + "/appaccount/drawpwd"; //修改交易密码

    String GET_CODE = API + "/appaccount/sendsms";//发送短信





}
