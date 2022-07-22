package com.example.demo.dao.dao.userDao

import com.example.demo.dao.model.User


interface UserDao{
    fun fetchAllUsers(): List<User>
    fun fetchUserById(userId: Long) : User
    fun insertUser(user: User)
    fun updateUser(user: User)
    fun deleteUser(userId: Long)
}