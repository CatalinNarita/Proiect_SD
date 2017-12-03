package com.edu.boundary;

import com.edu.control.dto.CartDTO;
import com.edu.control.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartResource {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CartDTO getCartById(@PathVariable("id") Long id) {
        return cartService.getCartById(id);
    }

    @RequestMapping(value = "/updateCart", method = RequestMethod.PUT)
    public void updateCart(@RequestBody CartDTO cartDTO) {
        cartService.updateCart(cartDTO);
    }
}
