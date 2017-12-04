package com.edu.control.dto.mapper;

import com.edu.control.dto.OrderDTO;
import com.edu.entity.Order;
import com.edu.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-04T10:42:06+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_152 (Oracle Corporation)"
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
        List<Product> list = order.getProducts();
        if ( list != null ) {
            orderDTO.setProducts( new ArrayList<Product>( list ) );
        }
        else {
            orderDTO.setProducts( null );
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
        List<Product> list = orderDTO.getProducts();
        if ( list != null ) {
            order.setProducts( new ArrayList<Product>( list ) );
        }
        else {
            order.setProducts( null );
        }

        return order;
    }
}
