package com.test.l4dto.selma;

import com.test.l4dto.dto.OrderDto;
import com.test.l4dto.model.Order;

/**
 * Created by Ryan on 2017/4/26.
 */
//@Mapper(
//        withCustomFields = {
//                @Field({"customer.fullName", "customerFullName"}),
//                @Field({"reference", "ref"})
//        },
//        withIgnoredFields = "id"
//)
public interface OrderSelmaMapper {
    // This will build a fresh new OrderDto
    OrderDto asOrderDto(Order in);

    // This will update the given order
    Order asOrder(OrderDto in, Order out);
}
