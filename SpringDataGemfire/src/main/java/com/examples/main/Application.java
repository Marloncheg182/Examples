package com.examples.main;

import com.examples.RecordBean;
import com.examples.repository.RecordRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Iterator;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocation(new ClassPathResource("resources/gfshBean.xml").getPath());
        context.refresh();
        RecordRepository recordRepository = context.getBean(RecordRepository.class);
        RecordBean recordBean = new RecordBean("1", "One");
        recordRepository.save(recordBean);
        System.out.println("Successful run!!");

        RecordBean recordBeanFetched = recordRepository.findByRecordId("2");
        System.out.println("The Fetched record bean is " + recordBeanFetched);

        Iterable<RecordBean>recordCollection = recordRepository.myFindAll();
        System.out.println("RecordBeans List : ");
        for (Iterator<RecordBean> iterator = recordCollection.iterator(); iterator.hasNext(); ){
            RecordBean recordBeannew = (RecordBean)iterator.next();
            System.out.println(recordBeannew);
        }

    }
}
