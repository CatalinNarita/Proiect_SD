package com.edu.control.dto.mapper;

import com.edu.control.dto.OrderDTO;
import com.edu.entity.Item;
import com.edu.entity.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-04T14:34:35+0200",
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
        List<Item> list = order.getItems();
        if ( list != null ) {
            orderDTO.setItems( new ArrayList<Item>( list ) );
        }
        else {
            orderDTO.setItems( null );
        }
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
        List<Item> list = orderDTO.getItems();
        if ( list != null ) {
            order.setItems( new ArrayList<Item>( list ) );
        }
        else {
            order.setItems( null );
        }

        return order;
    }
}
