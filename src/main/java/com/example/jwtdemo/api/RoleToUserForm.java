package com.example.jwtdemo.api;

import lombok.Data;

@Data
class RoleToUserForm{
    private String userName;
    private String roleName;
}