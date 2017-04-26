package com.test.l4dto.mapstruct;

import com.test.l4dto.dto.OrderDto;
import com.test.l4dto.model.Order;

import java.util.Date;

/**
 * Created by Ryan on 2017/4/26.
 */
public class DtoMapTools {

    public static void main(String[] args) {
        Order order = new Order(1, "abc", new Date(), null);
        OrderDto orderDto = OrderMapper.INSTANCE.orderToOrderDto(order);
        System.out.println(orderDto);
    }
}
