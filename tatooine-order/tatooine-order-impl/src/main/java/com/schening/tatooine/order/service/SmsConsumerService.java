package com.schening.tatooine.order.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/2 5:20 下午
 */
@Slf4j
@Service
public class SmsConsumerService {

    @Bean
    public Consumer<String> sms() {
        return message -> {
            log.info("接收的短信消息为：{}", message);
        };
    }

}
