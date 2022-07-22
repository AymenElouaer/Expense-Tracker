package com.example.demo.dao.dao.userDao

import com.example.demo.dao.model.User
import com.example.demo.dao.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserDaoImpl: UserDao {
    @Autowired
    private lateinit var userRepository: UserRepository

    override fun fetchAllUsers(): List<User> = userRepository.findAll()

    override fun fetchUserById(userId: Long): User =
        userRepository.findById(userId).orElse(null)


    override fun insertUser(user: User) {
        userRepository.save(user)
    }

    override fun updateUser(user: User) {
        userRepository.save(user)
    }

    override fun deleteUser(userId: Long) {
        userRepository.deleteById(userId)
    }
}