package com.edu.control.service;

import com.edu.control.dao.CartDAO;
import com.edu.control.dao.UserDAO;
import com.edu.control.dto.CartDTO;
import com.edu.control.dto.OrderDTO;
import com.edu.control.dto.UserDTO;
import com.edu.control.dto.mapper.OrderDTOMapper;
import com.edu.control.dto.mapper.UserDTOMapper;
import com.edu.entity.Cart;
import com.edu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private CartDAO cartDAO;

    private UserDTOMapper userMapper = UserDTOMapper.INSTANCE;

    private OrderDTOMapper orderMapper = OrderDTOMapper.INSTANCE;

    public UserDTO findById(Long id) {
        return userMapper.mapToDTO(userDAO.findOne(id));
    }

    public List<UserDTO> getAllUsers() {
        List<User> users = userDAO.findAll();

        return users
                .stream()
                .map(user -> userMapper.mapToDTO(user))
                .collect(Collectors.toList());
    }

    public void addUser(UserDTO userDTO) {
        User user = userMapper.mapToEntity(userDTO);

        Cart cart = new Cart();
        cart.setUser(user);

        userDAO.save(user);
        cartDAO.save(cart);
    }

    public void updateUser(UserDTO userDTO) {
        User user = userDAO.findOne(userDTO.getId());

        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setAddress(userDTO.getAddress());
    }

    public void deleteUser(Long id) {
        userDAO.delete(id);
    }

    public List<OrderDTO> getUserOrders(Long id) {
        return userDAO.findOne(id).getOrders()
                .stream()
                .map(order -> orderMapper.mapToDto(order))
                .collect(Collectors.toList());
    }

}
