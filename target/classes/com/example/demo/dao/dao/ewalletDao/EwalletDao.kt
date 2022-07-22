package com.example.demo.dao.dao.ewalletDao

import com.example.demo.dao.model.Ewallet
import com.example.demo.dao.model.Transaction

interface EwalletDao {
    fun fetchAllEwallet(): List<Ewallet>
    fun fetchEwallet(id:Long) : Ewallet
    fun insertEwallet(ewallet: Ewallet)
    fun updateEwallet(ewallet: Ewallet)
    fun deleteEwallet(id: Long)
    fun findByAccount(accountNumber: String): Ewallet
    fun send(accountNumber: String, amount: Double): Ewallet
    fun withdraw(accountNumber: String, amount: Double): Ewallet
    fun Transfer(accountNumber:String,amount: Double): Ewallet
}