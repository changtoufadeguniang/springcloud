package com.shiwen.entity;

/**
 * @author wangjie
 * @Title: Result
 * @Description: 返回数据的统一封装类
 * @company: 西安石文软件有限公司
 * @date 2020/9/289:45
 */
public class CommonResult<T> {

    private Integer code; //状态码

    private String  message;// 返回信息

    private  T  data;  //返回的数据

    public CommonResult() {
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
