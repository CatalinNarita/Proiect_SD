package com.edu.control.dto.mapper;

import com.edu.control.dto.CartDTO;
import com.edu.entity.Cart;
import com.edu.entity.Item;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-04T14:34:35+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class CartDTOMapperImpl implements CartDTOMapper {

    @Override
    public CartDTO mapToDto(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        CartDTO cartDTO = new CartDTO();

        cartDTO.setId( cart.getId() );
        List<Item> list = cart.getItems();
        if ( list != null ) {
            cartDTO.setItems( new ArrayList<Item>( list ) );
        }
        else {
            cartDTO.setItems( null );
        }
        cartDTO.setUser( cart.getUser() );

        return cartDTO;
    }

    @Override
    public Cart mapToEntity(CartDTO cartDTO) {
        if ( cartDTO == null ) {
            return null;
        }

        Cart cart = new Cart();

        cart.setId( cartDTO.getId() );
        List<Item> list = cartDTO.getItems();
        if ( list != null ) {
            cart.setItems( new ArrayList<Item>( list ) );
        }
        else {
            cart.setItems( null );
        }
        cart.setUser( cartDTO.getUser() );

        return cart;
    }
}
