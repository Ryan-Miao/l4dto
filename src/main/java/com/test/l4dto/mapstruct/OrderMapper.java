package com.test.l4dto.mapstruct;

import com.test.l4dto.dto.OrderDto;
import com.test.l4dto.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by Ryan on 2017/4/26.
 */
@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

//    @Mapping()
    OrderDto orderToOrderDto(Order order);
}
