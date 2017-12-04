package com.edu.control.dto.mapper;

import com.edu.control.dto.OrderDTO;
import com.edu.entity.Order;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-04T17:37:04+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class OrderDTOMapperImpl implements OrderDTOMapper {

    @Override
    public OrderDTO mapToDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId( order.getId() );
        orderDTO.setAddress( order.getAddress() );
        orderDTO.setOrderDate( order.getOrderDate() );
        orderDTO.setTotalPrice( order.getTotalPrice() );
        orderDTO.setUser( order.getUser() );

        return orderDTO;
    }

    @Override
    public Order mapToEntity(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderDTO.getId() );
        order.setAddress( orderDTO.getAddress() );
        order.setOrderDate( orderDTO.getOrderDate() );
        order.setTotalPrice( orderDTO.getTotalPrice() );
        order.setUser( orderDTO.getUser() );

        return order;
    }
}
