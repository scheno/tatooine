package com.schening.tatooine.order.bean;

import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/5/13 16:23
 */
@Data
public class Order {

    private Long id;

    @NotNull(message = "订单名称不允许为空")
    private String name;

    private Date date;

}
