package com.schening.tatooine.order.web;

import com.schening.tatooine.order.bean.Order;
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
    public long createOrder(Order order) {
        return orderService.createOrder(order);
    }

    @Override
    public Boolean deleteOrder(long id) {
        return orderService.deleteOrder(id);
    }

    @Override
    public Boolean updateOrder(Order order) {
        return orderService.updateOrder(order);
    }

    @Override
    public String queryOrder(long id) {
        return orderService.queryOrder(id);
    }
}
