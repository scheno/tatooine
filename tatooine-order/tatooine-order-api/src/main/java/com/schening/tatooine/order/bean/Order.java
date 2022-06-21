package com.schening.tatooine.order.bean;

import java.util.Date;
import lombok.Data;

/**
 * @author shenchen
 * @version 1.0
 * @date 2022/5/13 16:23
 */
@Data
public class Order {

    private Long id;

    private String name;

    private Date date;

}
