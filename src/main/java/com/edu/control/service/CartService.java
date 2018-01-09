package com.edu.control.service;

import com.edu.control.dao.CartDAO;
import com.edu.control.dto.CartDTO;
import com.edu.control.dto.ProductDTO;
import com.edu.control.dto.mapper.CartDTOMapper;
import com.edu.entity.Cart;
import com.edu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CartService {

    @Autowired
    private CartDAO cartDAO;

    private CartDTOMapper mapper = CartDTOMapper.INSTANCE;

    public CartDTO getCartById(Long id) {
        return mapper.mapToDto(cartDAO.findOne(id));
    }

    public void updateCart(Long id, CartDTO cartDTO) {
        Cart cart = cartDAO.findOne(id);

        cart.setItems(cartDTO.getItems());
    }

}
