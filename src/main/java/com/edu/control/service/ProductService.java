package com.edu.control.service;

import com.edu.control.dao.ProductDAO;
import com.edu.control.dto.ProductDTO;
import com.edu.control.dto.mapper.ProductDTOMapper;
import com.edu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    private ProductDTOMapper mapper = ProductDTOMapper.INSTANCE;

    public ProductDTO findById(Long id) {
        return mapper.mapToDto(productDAO.findOne(id));
    }

    public List<ProductDTO> getAllProducts() {
        return productDAO.findAll()
                .stream()
                .map(product -> mapper.mapToDto(product))
                .collect(Collectors.toList());
    }

    public void addproduct(ProductDTO productDTO) {
        Product product = mapper.mapToEntity(productDTO);
        productDAO.save(product);
    }

    public void updateProduct(ProductDTO productDTO) {
        Product product = productDAO.findOne(productDTO.getId());

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
    }

    public void deleteProduct(Long id) {
        productDAO.delete(id);
    }

}
