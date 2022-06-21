package com.schening.tatooine.common;

import com.schening.tatooine.common.constant.AppCode;
import com.schening.tatooine.common.constant.ResultCode;
import lombok.Getter;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/6/21 16:24
 */
@Getter
public class ApiException extends RuntimeException {
    private int code;
    private String msg;

    /**
     * 手动设置异常
     *
     * @param resultCode ResultCode
     * @param message String
     */
    public ApiException(ResultCode resultCode, String message) {
        // message用于用户设置抛出错误详情，例如：当前价格-5，小于0
        super(message);
        // 状态码
        this.code = resultCode.getCode();
        // 状态码配套的msg
        this.msg = resultCode.getMsg();
    }

    /**
     * 默认异常使用APP_ERROR状态码
     *
     * @param message String
     */
    public ApiException(String message) {
        super(message);
        this.code = AppCode.APP_ERROR.getCode();
        this.msg = AppCode.APP_ERROR.getMsg();
    }

}
