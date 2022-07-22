package com.example.demo.services.userService

import com.example.demo.dao.dao.userDao.UserDao
import com.example.demo.dao.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{
    @Autowired
    private lateinit var userDao: UserDao
    override fun getUsers(): List<User> = userDao.fetchAllUsers()

    override fun getUserById(userId: Long): User= userDao.fetchUserById(userId)

    override fun addUser(user: User) {
        userDao.insertUser(user)
    }

    override fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    override fun removeUser(userId: Long) {
        userDao.deleteUser(userId)
    }
}
