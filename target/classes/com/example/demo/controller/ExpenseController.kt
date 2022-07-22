package com.example.demo.controller

import com.example.demo.dao.model.Expense
import com.example.demo.services.expenseService.ExpenseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class ExpenseController {
    @Autowired
    private lateinit var expenseService: ExpenseService

    @GetMapping("/expenses")
    fun getAllExpense(): List<Expense> {
        return expenseService.getExpenses()
    }
    @DeleteMapping("/expense/{id}")
    fun delete(@PathVariable id : Long) {
        expenseService.removeExpense(id)
    }

    @PostMapping("/addExpense")
    fun newExpense(@RequestBody expense: Expense) {
        expenseService.addExpense(expense)
    }

    @GetMapping("/expense/{id}")
    fun getExpense(@PathVariable id: Long): Expense {
        return expenseService.getExpenseById(id)
    }

    @PutMapping("/updateExpense")
    fun update(@RequestBody expense: Expense) {
        expenseService.updateExpense(expense)
    }
}