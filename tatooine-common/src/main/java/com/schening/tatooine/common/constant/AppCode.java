package com.schening.tatooine.common.constant;

import lombok.Getter;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/6/21 16:30
 */
@Getter
public enum  AppCode {

    APP_ERROR(2000, "业务异常"),
    PRICE_ERROR(2001, "价格异常");

    private int code;
    private String msg;

    AppCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
