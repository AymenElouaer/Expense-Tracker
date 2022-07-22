package com.example.demo.services.transactionService

import com.example.demo.dao.model.Transaction

interface TransactionService {
    fun getTransaction(): List<Transaction>
    fun getTransactionById(id:Long) : Transaction
    fun addTransaction(transaction: Transaction)
    fun updateTransaction(transaction: Transaction)
    fun removeTransaction(id: Long)
}