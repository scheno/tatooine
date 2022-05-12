package com.schening.tatooine.order.service;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/2 4:59 下午
 */
public interface IEmailService {

    /**
     * 延时消息发送
     *
     * @param message   延时消息体
     * @param delayLevel 延时级别 1~18 (1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h 【 1=1s 2=5s 3=10s】)
     * @param msgTag 消费者TAG标识 通过TAG区分消费对象
     * @param msgKey  消息key 可以通过该字段再次区分
     * @return
     *
     */
    void sendEmail(String message, String delayLevel, String msgTag, String msgKey);

}
