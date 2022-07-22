package com.example.demo.dao.model

import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Transaction(
    @Id
    @GeneratedValue
    var transactionId: Long,
    var amount: Double,
    var date: Date,
    var transactionType: String,
    @ManyToOne
    private var ewallet: Ewallet

        )

