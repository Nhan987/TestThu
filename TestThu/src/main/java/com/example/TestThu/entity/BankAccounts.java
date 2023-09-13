package com.example.TestThu.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name=" BankAccounts ")
public class BankAccounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AccountID")
    private String AccountId;
    @Column(name = "AccountName")
    private String AccountName;
    @Column(name = "OpenDate")
    private LocalDate OpenDate;
    @Column(name = "BranchName")
    private String BranchName;
    @Column(name = "TypeID")
    private String TypeID;

    public BankAccounts() {
    }

    public BankAccounts(String accountId, String accountName, LocalDate openDate, String branchName, String typeID) {
        AccountId = accountId;
        AccountName = accountName;
        OpenDate = openDate;
        BranchName = branchName;
        TypeID = typeID;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public LocalDate getOpenDate() {
        return OpenDate;
    }

    public void setOpenDate(LocalDate openDate) {
        OpenDate = openDate;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public String getTypeID() {
        return TypeID;
    }

    public void setTypeID(String typeID) {
        TypeID = typeID;
    }
}
