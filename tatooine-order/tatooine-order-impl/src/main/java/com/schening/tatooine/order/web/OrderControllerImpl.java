package com.schening.tatooine.order.web;

import com.schening.tatooine.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/6 11:26 上午
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class OrderControllerImpl implements OrderController {

    private final OrderService orderService;

    @Override
    public String createOrder() {
        return orderService.createOrder();
    }

}
