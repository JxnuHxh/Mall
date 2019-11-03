package com.hxh.jdsun.model;
/*
* 200 成功
* 201 不成功
* */
public class ResultEntity {

    int code;
    String message;
    //构造器
    public ResultEntity(int code,String message){
        this.code=code;
        this.message=message;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
