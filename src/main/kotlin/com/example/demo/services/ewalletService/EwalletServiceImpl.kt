package com.example.demo.services.ewalletService

import com.example.demo.dao.dao.ewalletDao.EwalletDao
import com.example.demo.dao.model.Ewallet
import com.example.demo.dao.model.Transaction
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EwalletServiceImpl: EwalletService {
    @Autowired
    private lateinit var ewalletDao: EwalletDao

    override fun getEwallet(): List<Ewallet> = ewalletDao.fetchAllEwallet()

    override fun getEwalletById(id: Long): Ewallet = ewalletDao.fetchEwallet(id)

    override fun addEwallet(ewallet: Ewallet) {
       ewalletDao.insertEwallet(ewallet)
    }

    override fun updateEwallet(ewallet: Ewallet) {
        ewalletDao.updateEwallet(ewallet)
    }

    override fun removeEwallet(id: Long) {
        ewalletDao.deleteEwallet(id)
    }

    override fun findByAccountNumber(accountNumber: String):Ewallet {
        return ewalletDao.findByAccount(accountNumber)
    }

    override fun sendMoney(accountNumber: String, amount: Double): Ewallet {
        return ewalletDao.send(accountNumber, amount)
    }

    override fun withdrawMoney(accountNumber: String, amount: Double): Ewallet {
        return ewalletDao.withdraw(accountNumber, amount)
    }

    override fun TransferMoney(accountNumber: String, amount: Double): Ewallet {
        return ewalletDao.Transfer(accountNumber,amount)
    }

}