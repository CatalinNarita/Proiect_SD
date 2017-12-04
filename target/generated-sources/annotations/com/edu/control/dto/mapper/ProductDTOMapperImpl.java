package com.edu.control.dto.mapper;

import com.edu.control.dto.ProductDTO;
import com.edu.entity.Product;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-04T10:41:32+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_152 (Oracle Corporation)"
)
public class ProductDTOMapperImpl implements ProductDTOMapper {

    @Override
    public ProductDTO mapToDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( product.getId() );
        productDTO.setName( product.getName() );
        productDTO.setCategory( product.getCategory() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setProductSpec( product.getProductSpec() );

        return productDTO;
    }

    @Override
    public Product mapToEntity(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDTO.getId() );
        product.setName( productDTO.getName() );
        product.setCategory( productDTO.getCategory() );
        product.setPrice( productDTO.getPrice() );
        product.setProductSpec( productDTO.getProductSpec() );

        return product;
    }
}
