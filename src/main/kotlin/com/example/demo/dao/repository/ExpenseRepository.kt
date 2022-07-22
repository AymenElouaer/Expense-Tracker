package com.example.demo.dao.repository

import com.example.demo.dao.model.Expense
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ExpenseRepository: JpaRepository<Expense, Long> {
   fun searchExpenseByExpenseId(id: Long)
}