package com.example.demo.dao.model

import javax.persistence.*

@Entity
@Table
data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="categoryId")
    var categoryId: Long,
    @Column(name = "title")
    var title: String,
    @Column(name = "description")
    var description: String,
    @Column(name = "totalExpense")
    var totalExpense: Double,

    @ManyToOne
    private var user: User,

    @OneToMany
    private var expense: List<Expense>

)