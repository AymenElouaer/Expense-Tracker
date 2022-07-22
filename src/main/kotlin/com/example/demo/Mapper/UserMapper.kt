package com.example.demo.com.example.demo.Mapper

import com.example.demo.Mapper.UserDto
import com.example.demo.dao.model.User
import org.mapstruct.Mapper

@Mapper
abstract class UserMapper {
    abstract fun UserToEntity(
        userDto: UserDto
    ): User
    abstract fun UserDtotoDto(
        user: User
    ) : UserDto
    abstract fun UsersToEntities(
        usersDto: List<UserDto>
    ): List<User>
    abstract fun UsersToDTOS(
        users: List<User>
    ): List<UserDto>
}