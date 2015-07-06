package dataexam.service.impl;

import dataexam.entity.Bank;
import dataexam.repository.BankRepository;
import dataexam.service.BankService;

import java.util.List;

/**
 * Created by Dell on 6/13/2015.
 */
public class BankServiceImpl implements BankService {

private BankRepository bankRepository;
    @Override
    public Bank addBank(Bank bank) {
        Bank savedBank = bankRepository.saveAndFlush(bank);
        return savedBank;
    }

    @Override
    public void delete(long id) {
        bankRepository.delete(id);

    }

    @Override
    public Bank getByName(String name) {

        return bankRepository.findByName(name);
    }

    @Override
    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }
}
