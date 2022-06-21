package com.schening.tatooine.order;

import com.schening.tatooine.order.bean.Order;
import com.schening.tatooine.order.web.OrderController;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/5/13 16:01
 */
@SpringBootTest
public class OrderControllerTest {

    @Autowired
    private OrderController orderController;

    @Test
    public void testAdd() {
        Order order = new Order();
        order.setId(1L);
        order.setName("光明乳业");
        order.setDate(new Date());
        orderController.createOrder(order);
    }

    @Test
    public void testDelete() {
        orderController.deleteOrder(1);
    }

    @Test
    public void testUpdate() {
        Order order = new Order();
        orderController.updateOrder(order);
    }

    @Test
    public void testSelect() {
        orderController.queryOrder(1);
    }

}
