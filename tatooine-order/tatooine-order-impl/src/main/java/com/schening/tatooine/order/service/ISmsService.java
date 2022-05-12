package com.schening.tatooine.order.service;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/2 4:59 下午
 */
public interface ISmsService {

    /**
     * 发送SMS
     *
     * @param message
     */
    void sendSms(String message);

}
