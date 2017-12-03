package com.edu.control.dto.mapper;

import com.edu.control.dto.UserDTO;
import com.edu.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDTOMapper {

    UserDTOMapper INSTANCE = Mappers.getMapper(UserDTOMapper.class);

    UserDTO mapToDTO(User user);

    User mapToEntity(UserDTO userDTO);

}
