package com.openapi.controller;

import com.openapi.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
class UserControllerApi implements UserApi {

    @Override
    public ResponseEntity<UserDto> createUser(@Valid final UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(new UserDto().id(2L)
                .name(userDto.getName()).address(userDto.getAddress())
                .phone(userDto.getPhone()).postalCode(userDto.getPostalCode()));
    }

    @Override
    public ResponseEntity<Void> deleteUserById(final Long id) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    public ResponseEntity<UserDto> getUserById(final Long id) {
        return ResponseEntity.ok(new UserDto().id(id).name("Name "+id)
                .address("Address "+id).postalCode("11408").phone("666777888"));
    }

    @Override
    public ResponseEntity<List<UserDto>> getUsers() {
        return ResponseEntity.ok(Collections.singletonList(new UserDto().id(1L).name("Name 1")
                .address("Address 1").postalCode("11408").phone("666777888")));
    }

    @Override
    public ResponseEntity<Void> updateUser(final Long id, @Valid final UserDto userDto) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
