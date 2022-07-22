package com.example.demo.dao.dao.ewalletDao

import com.example.demo.dao.model.Ewallet
import com.example.demo.dao.model.Transaction
import com.example.demo.dao.repository.EwalletRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EwalletDaoImpl: EwalletDao {
    @Autowired
    private lateinit var ewalletRepository: EwalletRepository
    private lateinit var transaction: Transaction

    override fun fetchAllEwallet(): List<Ewallet> = ewalletRepository.findAll()

    override fun fetchEwallet(id: Long): Ewallet = ewalletRepository.findById(id).orElse(null)

    override fun insertEwallet(ewallet: Ewallet){
     ewalletRepository.save(ewallet)
    }

    override fun updateEwallet(ewallet: Ewallet) {
        ewalletRepository.save(ewallet)
    }

    override fun deleteEwallet(id: Long) {
        ewalletRepository.deleteById(id)
    }

    override fun findByAccount(accountNumber: String): Ewallet {
        return ewalletRepository.findByAccountNumber(accountNumber)
    }

    override fun send(accountNumber: String, amount: Double) =
        Transfer(accountNumber,amount)

    override fun withdraw(accountNumber: String, amount: Double) =
        Transfer(accountNumber,(-1)*amount)


    override fun Transfer(accountNumber: String, amount: Double): Ewallet {
        var amount: Double= transaction.amount
        val walletOpt: Ewallet = ewalletRepository.findByAccountNumber(accountNumber)
        val wallet: Ewallet = walletOpt
        wallet.currentBalance+= amount
        return ewalletRepository.save(wallet)
    }
}