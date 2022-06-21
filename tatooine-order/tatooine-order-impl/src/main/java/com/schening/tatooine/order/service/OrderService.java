package com.schening.tatooine.order.service;

import com.schening.tatooine.order.bean.Order;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/4/6 11:40 上午
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    long createOrder(Order order);

    /**
     * 删除订单
     *
     * @param id
     * @return
     */
    Boolean deleteOrder(long id);

    /**
     * 更新订单
     *
     * @param order
     * @return
     */
    Boolean updateOrder(Order order);

    /**
     * 查询订单
     *
     * @param id
     * @return
     */
    String queryOrder(long id);

}
