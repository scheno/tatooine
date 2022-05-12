package com.schening.tatooine.order.service.impl;

import com.schening.tatooine.order.service.IEmailService;
import com.schening.tatooine.order.service.ISmsService;
import com.schening.tatooine.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/6 11:40 上午
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ISmsService smsService;

    private final IEmailService emailService;

    @Override
    public String createOrder() {
        smsService.sendSms("创建订单：" + System.currentTimeMillis());
        emailService.sendEmail("创建订单：" + System.currentTimeMillis(), "5", "EMAIL_SEND", null);
        return "订单创建成功";
    }

}
