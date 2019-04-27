package com.faculty.interadmin.entity;


import com.faculty.interadmin.Another.Rt_sign;

public class ResultUtil {

    /**

     * 请求成功返回     * @param object     * @return

     */

    public static com.faculty.interadmin.Another.Msg<Rt_sign> success(Object object) {
        Msg msg = new Msg();

        msg.setCode(200);

        msg.setMsg("请求成功");

        msg.setData(object);

        return msg;


    }



    //  public static Msg success() {

    //      return success(null);

    //  }



    public static Msg error(Integer code, String resultmsg) {

        Msg msg = new Msg();

        msg.setCode(code);

        msg.setMsg(resultmsg);

        return msg;

    }

}