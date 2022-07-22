package com.example.demo.services.expenseService

import com.example.demo.dao.dao.expenseDao.ExpenseDao
import com.example.demo.dao.model.Expense
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpenseServiceImpl: ExpenseService {
    @Autowired
    private lateinit var expenseDao: ExpenseDao

    override fun getExpenses(): List<Expense> = expenseDao.fetchAllExpenses()
    override fun removeExpense(expenseId: Long) {
        expenseDao.deleteExpense(expenseId)
    }

    override fun addExpense(expense: Expense) {
        expenseDao.insertExpense(expense)
    }

    override fun getExpenseById(expenseId: Long): Expense {
       return expenseDao.fetchExpenseById(expenseId)
    }

    override fun updateExpense(expense: Expense) {
        expenseDao.updateExpense(expense)
    }
}