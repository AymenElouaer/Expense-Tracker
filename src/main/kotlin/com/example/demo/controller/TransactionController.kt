package com.example.demo.controller

import com.example.demo.dao.model.Transaction
import com.example.demo.services.transactionService.TransactionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class TransactionController {
    @Autowired
    private lateinit var trasactionService: TransactionService

    @GetMapping("/transactions")
    fun getAllTransaction(): List<Transaction> {
        return trasactionService.getTransaction()
    }

    @PostMapping("/transactions")
    fun newCategory(@RequestBody ewallet: Transaction){
        trasactionService.addTransaction(ewallet)
    }

    @GetMapping("/transaction/{id}")
    fun getCategory(@PathVariable id: Long): Transaction {
        return trasactionService.getTransactionById(id)
    }

    @PutMapping("/updateTransaction")
    fun update(@RequestBody ewallet: Transaction) {
        trasactionService.updateTransaction(ewallet)
    }

    @DeleteMapping("/transaction/{id}")
    fun delete(@PathVariable id : Long) {
        trasactionService.removeTransaction(id)
    }
}