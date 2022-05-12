package com.schening.tatooine.order.web;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/6 11:25 上午
 */
public interface OrderController {

    /**
     * 创建订单
     *
     * @return
     */
    @PostMapping("/v1/order")
    String createOrder();

}
