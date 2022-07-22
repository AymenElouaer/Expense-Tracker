package com.example.demo.dao.dao.expenseDao

import com.example.demo.dao.model.Expense

interface ExpenseDao {
    fun fetchAllExpenses(): List<Expense>
    fun deleteExpense(expenseId: Long)
    fun insertExpense(expense: Expense)
    fun updateExpense(expense: Expense)
    fun fetchExpenseById(expenseId: Long): Expense
}