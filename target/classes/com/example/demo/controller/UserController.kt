package com.example.demo.controller

import com.example.demo.dao.model.Category
import com.example.demo.dao.model.User
import com.example.demo.dao.repository.UserRepository
import com.example.demo.services.userService.UserService
import com.example.demo.services.userService.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class UserController() {
    @Autowired
    private lateinit var userService: UserService

    @GetMapping("/user/users")
    fun getUsers(): List<User> = userService.getUsers()

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable id: Long): User {
        return userService.getUserById(id)
    }

    @PostMapping("/addUser")
   fun registerUser(@RequestBody user: User){
       userService.addUser(user)
   }
    @PutMapping("/updateUser")
    fun update(@RequestBody user: User) {
        userService.updateUser(user)
    }
    @DeleteMapping("/user/{id}")
    fun delete(@PathVariable id : Long) {
        userService.removeUser(id)
    }


}