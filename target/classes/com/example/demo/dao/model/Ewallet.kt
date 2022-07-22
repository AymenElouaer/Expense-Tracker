package com.example.demo.dao.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "ewallet")
data class Ewallet(
    @Id
    @GeneratedValue
    var id: Long,
    var name: String, // Account name
    var accountNumber: String = UUID.randomUUID().toString(),
    var description: String,
    var currentBalance: Double = 0.0, // default value 0

    @OneToMany
    private var transaction: List<Transaction>,

    @OneToOne
    private var user: User
)

