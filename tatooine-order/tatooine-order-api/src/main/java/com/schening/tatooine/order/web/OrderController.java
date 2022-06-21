package com.schening.tatooine.order.web;

import com.schening.tatooine.order.bean.Order;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/6 11:25 上午
 */
public interface OrderController {

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    @PostMapping("/v1/order")
    long createOrder(Order order);

    /**
     * 删除订单
     *
     * @param id
     * @return
     */
    @DeleteMapping("/v1/order/{id}")
    Boolean deleteOrder(long id);

    /**
     * 更新订单
     *
     * @return
     */
    @PutMapping("/v1/order")
    Boolean updateOrder(Order order);

    /**
     * 查询订单
     *
     * @return
     */
    @GetMapping("/v1/order")
    String queryOrder(@RequestParam long id);

}
