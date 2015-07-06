package dataexam.repository;

import dataexam.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Dell on 6/13/2015.
 */
public interface BankRepository extends JpaRepository<Bank, Long>{ // Bank - ?????? ?????? Bank, Long ????????? ?? Bank.id

    @Query("select b from b where b.name=:name")
    Bank findByName(@Param("name") String name);
}
