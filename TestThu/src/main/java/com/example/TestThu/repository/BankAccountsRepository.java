package com.example.TestThu.repository;

import com.example.TestThu.entity.BankAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BankAccountsRepository extends JpaRepository<BankAccounts,String> {

    @Query(value = "SELECT * FROM BankAccounts WHERE AccountName = :username",nativeQuery = true)
    public List<BankAccounts> findByAccountName(String username);
}
