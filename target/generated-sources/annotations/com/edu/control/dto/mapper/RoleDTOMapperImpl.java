package com.edu.control.dto.mapper;

import com.edu.control.dto.RoleDTO;
import com.edu.entity.Role;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-12-02T19:14:37+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_151 (Oracle Corporation)"
)
public class RoleDTOMapperImpl implements RoleDTOMapper {

    @Override
    public RoleDTO mapToDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setRoleName( role.getRoleName() );

        return roleDTO;
    }
}
