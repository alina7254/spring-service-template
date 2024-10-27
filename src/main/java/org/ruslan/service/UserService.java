package org.ruslan.service;

import org.ruslan.dto.UserDto;
import org.ruslan.entity.UserEntity;
import org.ruslan.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserEntityRepository repository;

    public List<UserDto> getUsers() {
        List<UserEntity> userEntities = repository.findAll();
        return userEntities.stream().map(userEntity -> {
            UserDto userDto = new UserDto();
            userDto.setFirstName(userEntity.getFirstName());
            userDto.setLastName(userEntity.getLastName());
            userDto.setAge(userEntity.getAge());
            return userDto;
        }).toList();
    }


    public int saveUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setAge(userDto.getAge());

        userEntity = repository.saveAndFlush(userEntity);

        return userEntity.getId();
    }
}
