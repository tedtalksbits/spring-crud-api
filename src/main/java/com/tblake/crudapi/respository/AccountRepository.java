package com.tblake.crudapi.respository;

import com.tblake.crudapi.model.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepository {
    List<Account> accounts = new ArrayList<>();


    public AccountRepository(){
        accounts.add(new Account("1", "test 1", "email1", "password1"));
        accounts.add(new Account("2", "test 2", "email2", "password2"));
        accounts.add(new Account("3", "test 3", "email3", "password3"));
    }

    // find account by id
public Account findById(String id){
        for(Account account: accounts){
            if(account.getId().equals(id)){
                return account;
            }
        }
        return null;
    }
    // delete account by id
    public void deleteById(String id){
        for(Account account: accounts){
            if(account.getId().equals(id)){
                accounts.remove(account);
                break;
            }
        }
    }

    // update account by id
    public void updateById(String id, Account account){
        for(Account a: accounts){
            if(a.getId().equals(id)){
                a.setName(account.getName());
                a.setEmail(account.getEmail());
                a.setPassword(account.getPassword());
                break;
            }
        }
    }
    // create account
    public Account create(Account account){
        accounts.add(account);
        return account;
    }

// get all accounts
    public List<Account> findAll(){
        return accounts;
    }
}
