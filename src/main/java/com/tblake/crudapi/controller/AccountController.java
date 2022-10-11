package com.tblake.crudapi.controller;

import com.tblake.crudapi.model.Account;
import com.tblake.crudapi.respository.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

  private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @GetMapping
    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable String id){
        return accountRepository.findById(id);
    }
}
