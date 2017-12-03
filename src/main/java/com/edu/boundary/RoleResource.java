package com.edu.boundary;


import com.edu.control.dto.RoleDTO;
import com.edu.control.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/role")
public class RoleResource {

    @Autowired
    private RoleService roleService;

    @RequestMapping(name = "/{username}", method = RequestMethod.GET)
    public RoleDTO getRoleByUsername(@PathVariable("username") String username) {
        return roleService.getRoleByUsername(username);
    }

}
