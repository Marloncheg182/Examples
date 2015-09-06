package com.examples.repository;

import com.examples.RecordBean;
import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
@Repository
public interface RecordRepository extends CrudRepository<RecordBean, Integer> {
    RecordBean findByRecordId(String recordId);

    @Query("SELECT * FROM /record")
    Collection<RecordBean> myFindAll();
}
