package com.example.demo.dao.repository

import com.example.demo.dao.model.Ewallet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EwalletRepository: JpaRepository<Ewallet, Long> {
    fun findByAccountNumber(accountNumber: String): Ewallet
}