package com.example.demo.services.expenseService

import com.example.demo.dao.model.Category
import com.example.demo.dao.model.Expense


interface ExpenseService {
    fun getExpenses(): List<Expense>
    fun removeExpense(expenseId: Long)
    fun addExpense(expense: Expense)
    fun getExpenseById(expenseId: Long): Expense
    fun updateExpense(expense: Expense)
}