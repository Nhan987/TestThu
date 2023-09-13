package com.example.TestThu.rest;

import com.example.TestThu.entity.BankAccounts;
import com.example.TestThu.service.BankAccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BankAccountsRestController {
    @Autowired
    private BankAccountsService bankAccountsService;

    @GetMapping("/Account")
    public List<BankAccounts> findAll(){
        return bankAccountsService.findAll();
    }

    @GetMapping("/Account/{AccountName}")
    public List<BankAccounts> findByAccountName(@PathVariable String AccountName){
        return bankAccountsService.findByAccountName(AccountName);
    }
}
