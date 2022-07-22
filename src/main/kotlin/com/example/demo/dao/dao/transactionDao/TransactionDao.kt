package com.example.demo.dao.dao.transactionDao
import com.example.demo.dao.model.Transaction

interface TransactionDao {
    fun fetchAllTransactions(): List<Transaction>
    fun fetchTransaction(id:Long) : Transaction
    fun insertTransaction(transaction: Transaction)
    fun updateTransaction(transaction: Transaction)
    fun deleteTransaction(id: Long)
}