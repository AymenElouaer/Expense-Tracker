package com.example.demo.controller

import com.example.demo.dao.model.Ewallet
import com.example.demo.services.ewalletService.EwalletService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DepositController {
    @Autowired
    private lateinit var ewalletService: EwalletService

    @PostMapping("/sendMoney")
    private fun send(accountNumber: String, amount: Double): Ewallet{
        return ewalletService.sendMoney(accountNumber, amount)
    }
    @PostMapping("/withdrawMoney")
    private fun withdraw(accountNumber: String, amount: Double): Ewallet{
        return ewalletService.withdrawMoney(accountNumber, amount)
    }
    }