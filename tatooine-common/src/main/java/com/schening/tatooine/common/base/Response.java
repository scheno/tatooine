package com.schening.tatooine.common.base;

import com.schening.tatooine.common.constant.ResultCode;
import lombok.Data;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/6/21 16:08
 */
@Data
public class Response<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态信息
     */
    private String msg;

    /**
     * 返回结果
     */
    private T data;

    public Response() {

    }

    public Response(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Response<T> ok(T data) {
        Response<T> response = new Response<>();
        response.setCode(ResultCode.SUCCESS.getCode());
        response.setMsg(ResultCode.SUCCESS.getMsg());
        response.setData(data);
        return response;
    }

}
