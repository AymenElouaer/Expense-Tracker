package com.example.demo.services.transactionService

import com.example.demo.dao.dao.transactionDao.TransactionDao
import com.example.demo.dao.model.Transaction
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TransactionServiceImpl: TransactionService {
    @Autowired
    private lateinit var transactionDao: TransactionDao
    override fun getTransaction(): List<Transaction> = transactionDao.fetchAllTransactions()

    override fun getTransactionById(id: Long): Transaction =transactionDao.fetchTransaction(id)

    override fun addTransaction(transaction: Transaction) {
        transactionDao.insertTransaction(transaction)
    }

    override fun updateTransaction(transaction: Transaction) {
        transactionDao.updateTransaction(transaction)
    }

    override fun removeTransaction(id: Long) {
        transactionDao.deleteTransaction(id)
    }

}