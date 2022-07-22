package com.example.demo.services.userService

import com.example.demo.dao.model.User

interface UserService {
    fun getUsers(): List<User>
    fun getUserById(userId: Long) : User
    fun addUser(user: User)
    fun updateUser(user: User)
    fun removeUser(userId: Long)


}