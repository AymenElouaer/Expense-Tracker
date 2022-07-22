package com.example.demo.dao.dao.transactionDao

import com.example.demo.dao.model.Transaction
import com.example.demo.dao.repository.TransactionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TransactionDaoImpl: TransactionDao {
    @Autowired
    private lateinit var transactionRepository: TransactionRepository

    override fun fetchAllTransactions(): List<Transaction> =transactionRepository.findAll()

    override fun fetchTransaction(id: Long): Transaction =
        transactionRepository.findById(id).orElse(null)

    override fun insertTransaction(transaction: Transaction) {
        transactionRepository.save(transaction)
    }

    override fun updateTransaction(transaction: Transaction) {
        transactionRepository.save(transaction)
    }

    override fun deleteTransaction(id: Long) {
        transactionRepository.deleteById(id)
    }
}