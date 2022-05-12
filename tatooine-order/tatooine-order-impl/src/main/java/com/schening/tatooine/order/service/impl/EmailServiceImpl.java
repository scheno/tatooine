package com.schening.tatooine.order.service.impl;

import com.schening.tatooine.order.service.IEmailService;
import com.schening.tatooine.order.service.ISmsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
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
public class EmailServiceImpl implements IEmailService {

    private final StreamBridge streamBridge;

    @Override
    public void sendEmail(String message, String delayLevel, String msgTag, String msgKey) {
        Message<String> messageBuild = MessageBuilder.withPayload(message)
                .setHeader(MessageConst.PROPERTY_DELAY_TIME_LEVEL, delayLevel) // 设置延迟级别为 3，10 秒后消费。
                .build();
        streamBridge.send("email-out-0", messageBuild);
    }

}
