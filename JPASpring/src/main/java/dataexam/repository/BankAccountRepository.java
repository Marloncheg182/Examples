package dataexam.repository;

import dataexam.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dell on 6/13/2015.
 */
public interface BankAccountRepository extends JpaRepository<BankAccount, Long>{
}
