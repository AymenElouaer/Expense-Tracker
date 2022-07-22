package com.example.demo.controller
import com.example.demo.dao.model.Ewallet
import com.example.demo.services.ewalletService.EwalletService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class EwalletController {
    @Autowired
    private lateinit var ewalletService: EwalletService

    @GetMapping("/ewallets")
    fun getAllEwallet(): List<Ewallet> {
        return ewalletService.getEwallet()
    }
    @GetMapping("walletNumber")
    fun getWalletByAccountNumber(accountNumber: String): Ewallet{
        return ewalletService.findByAccountNumber(accountNumber)
    }

    @PostMapping("/ewallets")
    fun newCategory(@RequestBody ewallet: Ewallet){
        ewalletService.addEwallet(ewallet)
    }

    @GetMapping("/ewallet/{id}")
    fun getCategory(@PathVariable id: Long): Ewallet {
        return ewalletService.getEwalletById(id)
    }

    @PutMapping("/updateWallet")
    fun update(@RequestBody ewallet: Ewallet) {
        ewalletService.updateEwallet(ewallet)
    }

    @DeleteMapping("/ewallet/{id}")
    fun delete(@PathVariable id : Long) {
        ewalletService.removeEwallet(id)
    }

}