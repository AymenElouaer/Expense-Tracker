package com.example.demo.services.ewalletService

import com.example.demo.dao.model.Ewallet
import com.example.demo.dao.model.Transaction

interface EwalletService {
    fun getEwallet(): List<Ewallet>
    fun getEwalletById(id:Long) : Ewallet
    fun addEwallet(ewallet: Ewallet)
    fun updateEwallet(ewallet: Ewallet)
    fun removeEwallet(id: Long)
    fun findByAccountNumber(accountNumber: String):Ewallet
    fun sendMoney(accountNumber: String, amount: Double): Ewallet
    fun withdrawMoney(accountNumber: String, amount: Double): Ewallet
    fun TransferMoney(accountNumber:String,amount: Double): Ewallet


}