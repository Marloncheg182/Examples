package dataexam.repository;

import dataexam.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dell on 6/13/2015.
 */
public interface ClientRepository extends JpaRepository<Client, Long>{
}
