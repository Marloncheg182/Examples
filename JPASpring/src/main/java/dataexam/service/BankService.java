package dataexam.service;

import dataexam.entity.Bank;

import java.util.List;

/**
 * Created by Dell on 6/13/2015.
 */
public interface BankService {
    Bank addBank(Bank bank);

    void delete(long id);

    Bank getByName(String name);

    Bank editBank(Bank bank);

    List<Bank> getAll();
}
