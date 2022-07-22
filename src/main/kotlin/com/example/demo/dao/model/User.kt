package com.example.demo.dao.model

import javax.persistence.*

@Entity
@Table(name= "userTable")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    var userId: Long,
    @Column(name = "firstName")
    var firstName:String,
    @Column(name = "lastName")
    var lastName:String,
    var email:String,
    var password:String,
// Set A generic unordered collection of elements that does not support duplicate elements
   @OneToMany
   private var category: List<Category>,
   @OneToOne
   private var ewallet: Ewallet


)