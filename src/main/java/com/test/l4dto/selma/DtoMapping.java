package com.test.l4dto.selma;

import com.test.l4dto.dto.OrderDto;
import com.test.l4dto.model.Order;
import fr.xebia.extras.selma.Selma;

import java.util.Date;

/**
 * Created by Ryan on 2017/4/26.
 */
public class DtoMapping {

    public static void main(String[] args) {
        OrderSelmaMapper mapper = Selma.builder(OrderSelmaMapper.class).build();

        Order order = new Order(1, "abc", new Date(), null);
        OrderDto orderDto = mapper.asOrderDto(order);
        System.out.println(orderDto);
    }
}
