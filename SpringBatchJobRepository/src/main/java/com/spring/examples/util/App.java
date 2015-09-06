package com.spring.examples.util;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
public class App {
    public static void main(String[] args) {
        String[]str = {"META-INF/context-config.xml","META-INF/job-config.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(str);
        Job job =(Job)ctx.getBean("myJob");
        JobLauncher jobLauncher = (JobLauncher)ctx.getBean("jobLauncher");
        try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Job Execution Status: " + execution.getStatus());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
