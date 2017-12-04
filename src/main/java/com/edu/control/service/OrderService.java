package com.edu.control.service;

import com.edu.control.dao.OrderDAO;
import com.edu.control.dto.OrderDTO;
import com.edu.control.dto.mapper.OrderDTOMapper;
import com.edu.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderDAO orderDAO;

    private OrderDTOMapper mapper = OrderDTOMapper.INSTANCE;

    public OrderDTO getOrderById(Long id) {
        //Order order = orderDAO.findOne(id);
        return mapper.mapToDto(orderDAO.findOne(id));
    }

    public List<OrderDTO> getAllOrders() {
        return orderDAO.findAll()
                .stream()
                .map(order -> mapper.mapToDto(order))
                .collect(Collectors.toList());
    }

    public void addOrder(OrderDTO orderDTO) {
        orderDAO.save(mapper.mapToEntity(orderDTO));
    }

    public void updateOrder(OrderDTO orderDTO) {
        Order order = orderDAO.findOne(orderDTO.getId());
        order.setAddress(orderDTO.getAddress());
    }

    public void deleteOrder(Long id) {
        Order order = orderDAO.findOne(id);

        //order.setProducts(null);
        orderDAO.delete(order);
    }

}
