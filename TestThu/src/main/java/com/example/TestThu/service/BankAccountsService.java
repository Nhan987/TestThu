package com.example.TestThu.service;

import com.example.TestThu.entity.BankAccounts;
import com.example.TestThu.repository.BankAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountsService {
    @Autowired
    private BankAccountsRepository bankAccountsRepository;


    public List<BankAccounts> findAll(){
        return bankAccountsRepository.findAll();
    }

    public List<BankAccounts> findByAccountName(String username){
        List<BankAccounts> DbAccount = bankAccountsRepository.findByAccountName(username);
        return DbAccount;
    }
}
