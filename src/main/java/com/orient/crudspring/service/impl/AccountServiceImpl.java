package com.orient.crudspring.service.impl;

import com.orient.crudspring.model.Account;
import com.orient.crudspring.repository.AccountRepository;
import com.orient.crudspring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> findAll()
    {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(Long id)
    {
        Account account = null;
        try
        {
            account = accountRepository.findById(id).get();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return account;
    }

    @Override
    public void create(Account account)
    {
        accountRepository.save(account);
    }

    @Override
    public void update(Long id, Account account)
    {
        Account oldAccount = findById(id);
        oldAccount.setFirst_name(account.getFirst_name());
        oldAccount.setLast_name(account.getLast_name());
        oldAccount.setEmail(account.getEmail());
        oldAccount.setUser_name(account.getUser_name());
        oldAccount.setPassword(account.getPassword());

        accountRepository.save(oldAccount);
    }

    @Override
    public void delete(Long id)
    {
        Account account = findById(id);

        if(account != null)
        {
            accountRepository.delete(account);
        }
    }
}
