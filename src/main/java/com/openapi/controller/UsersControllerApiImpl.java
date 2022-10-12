package com.openapi.controller;

import com.openapi.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
class UsersControllerApiImpl implements UsersApi {

    @Override
    public ResponseEntity<List<UserDto>> getUsers() {
        return ResponseEntity.ok(Arrays.asList(new UserDto().id(1L), new UserDto().id(2L)));
    }
}
