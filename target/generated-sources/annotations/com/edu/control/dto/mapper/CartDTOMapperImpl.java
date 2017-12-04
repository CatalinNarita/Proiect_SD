package com.edu.control.dto.mapper;

import com.edu.control.dto.CartDTO;
import com.edu.entity.Cart;
import com.edu.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-04T10:41:31+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_152 (Oracle Corporation)"
)
public class CartDTOMapperImpl implements CartDTOMapper {

    @Override
    public CartDTO mapToDto(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        CartDTO cartDTO = new CartDTO();

        cartDTO.setId( cart.getId() );
        List<Product> list = cart.getProducts();
        if ( list != null ) {
            cartDTO.setProducts( new ArrayList<Product>( list ) );
        }
        else {
            cartDTO.setProducts( null );
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
        List<Product> list = cartDTO.getProducts();
        if ( list != null ) {
            cart.setProducts( new ArrayList<Product>( list ) );
        }
        else {
            cart.setProducts( null );
        }
        cart.setUser( cartDTO.getUser() );

        return cart;
    }
}
