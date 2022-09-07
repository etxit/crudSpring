package com.orient.crudspring.controller;

import com.orient.crudspring.model.Account;
import com.orient.crudspring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/account")
public class AccountController {

    // Spring Web, Spring Data JPA, MySQL Driver, Lombok

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/all")
    public List<Account> findAll()
    {
        List<Account> accounts = accountService.findAll();
        return accounts;
    }

    @GetMapping(value = "/{id}")
    public Account findById(@PathVariable Long id)
    {
        Account account = accountService.findById(id);
        return account;
    }

    @PostMapping(value = "/create")
    public void create(@RequestBody Account account)
    {
        accountService.create(account);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable Long id, @RequestBody Account account)
    {
        accountService.update(id, account);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id)
    {
        accountService.delete(id);
    }

}
