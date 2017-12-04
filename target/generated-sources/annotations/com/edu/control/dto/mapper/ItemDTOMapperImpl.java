package com.edu.control.dto.mapper;

import com.edu.control.dto.ItemDTO;
import com.edu.entity.Item;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-04T14:34:35+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class ItemDTOMapperImpl implements ItemDTOMapper {

    @Override
    public ItemDTO mapToDto(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        itemDTO.setId( item.getId() );
        itemDTO.setProduct( item.getProduct() );
        itemDTO.setQuantity( item.getQuantity() );

        return itemDTO;
    }

    @Override
    public Item mapToEntity(ItemDTO itemDTO) {
        if ( itemDTO == null ) {
            return null;
        }

        Item item = new Item();

        item.setId( itemDTO.getId() );
        item.setProduct( itemDTO.getProduct() );
        item.setQuantity( itemDTO.getQuantity() );

        return item;
    }
}
