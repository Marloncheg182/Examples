package dataexam.repository;

import dataexam.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dell on 6/13/2015.
 */
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
