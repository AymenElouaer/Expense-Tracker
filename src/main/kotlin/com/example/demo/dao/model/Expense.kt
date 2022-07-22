package com.example.demo.dao.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.Instant
import javax.persistence.*

@Entity
@Table(name="expenseTable")
data class Expense (
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    var expenseId: Long,
    @Column(name= "expenseAmount")
    var expenseAmount: Double,
    @Column(name = "expenseDate")
    var expenseDate: Instant,
    @Column(name = "description")
    var description: String,
    @Column
    var location: String,

    @ManyToOne
    @JoinColumn(name= "categoryId")
    private var category: Category,

    @ManyToOne
    @JoinColumn(name = "userId")
    private var user: User //user can have many expenses

        )