package com.example.demo.dao.repository

import com.example.demo.dao.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

// T: type of object this repository works with
// second params: the type of the id
@Repository
// JpaRepository has all the methods like findAll, deleteAll
interface UserRepository : JpaRepository<User,Long>  {  //extends and implement by simply typing :
}