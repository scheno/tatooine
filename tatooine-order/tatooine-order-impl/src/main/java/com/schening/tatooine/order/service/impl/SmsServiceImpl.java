package com.schening.tatooine.order.service.impl;

import com.schening.tatooine.order.service.ISmsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageConst;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/2 5:00 下午
 */
@Slf4j
@Service
@AllArgsConstructor
public class SmsServiceImpl implements ISmsService {

    private final StreamBridge streamBridge;

    @Override
    public void sendSms(String message) {
        MessageBuilder.withPayload(message)
                .setHeader(MessageConst.PROPERTY_TAGS, "SMS_SEND")
                .setHeader(MessageConst.PROPERTY_DELAY_TIME_LEVEL, 10).build();
        streamBridge.send("sms-out-0", message);
    }

}
