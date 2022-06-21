package com.schening.tatooine.common.constant;

import lombok.Getter;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/6/21 16:04
 */
@Getter
public enum ResultCode {

    /**
     *
     */
    SUCCESS(1000, "请求成功"),

    /**
     *
     */
    FAILED(1001, "请求失败"),

    /**
     *
     */
    VALIDATE_ERROR(1002, "参数校验失败"),

    /**
     *
     */
    RESPONSE_PACK_ERROR(1003, "返回转化失败");

    private Integer code;

    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
