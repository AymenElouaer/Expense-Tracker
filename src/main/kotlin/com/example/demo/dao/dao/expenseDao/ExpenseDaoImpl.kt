package com.example.demo.dao.dao.expenseDao

import com.example.demo.dao.model.Expense
import com.example.demo.dao.repository.ExpenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpenseDaoImpl : ExpenseDao {
    @Autowired
    private lateinit var expenseRepository: ExpenseRepository

    override fun fetchAllExpenses(): List<Expense> = expenseRepository.findAll()

    override fun deleteExpense(expenseId: Long) {
        expenseRepository.deleteById(expenseId)
    }

    override fun insertExpense(expense: Expense) {
        expenseRepository.save(expense)
    }

    override fun updateExpense(expense: Expense) {
        expenseRepository.save(expense)
    }

    override fun fetchExpenseById(expenseId: Long): Expense {
        return expenseRepository.findById(expenseId).orElse(null)
    }

}