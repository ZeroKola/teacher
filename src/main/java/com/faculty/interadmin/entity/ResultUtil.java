package com.faculty.interadmin.entity;


<<<<<<< HEAD
=======

>>>>>>> dev-pjy
public class ResultUtil {

    /**

     * 请求成功返回     * @param object     * @return

     */

<<<<<<< HEAD
    public static Msg success(Object object) {
=======
>>>>>>> dev-pjy
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