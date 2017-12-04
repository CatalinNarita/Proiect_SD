package com.edu.control.dto.mapper;

import com.edu.control.dto.UserDTO;
import com.edu.entity.User;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-04T14:34:35+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
public class UserDTOMapperImpl implements UserDTOMapper {

    @Override
    public UserDTO mapToDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setUsername( user.getUsername() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setFirstName( user.getFirstName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setAddress( user.getAddress() );

        return userDTO;
    }

    @Override
    public User mapToEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setUsername( userDTO.getUsername() );
        user.setPassword( userDTO.getPassword() );
        user.setFirstName( userDTO.getFirstName() );
        user.setLastName( userDTO.getLastName() );
        user.setEmail( userDTO.getEmail() );
        user.setAddress( userDTO.getAddress() );

        return user;
    }
}
