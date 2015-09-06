package examples.util;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Map;

/**
 * Created by Oleg Romanenchuk on 9/1/2015.
 */
public class MyTaskScheduler extends QuartzJobBean {

    private String jobName;
    private JobLauncher jobLauncher;
    private JobLocator jobLocator;

    public JobLauncher getJobLauncher() {
        return jobLauncher;
    }

    public void setJobLauncher(JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
    }

    public JobLocator getJobLocator() {
        return jobLocator;
    }

    public void setJobLocator(JobLocator jobLocator) {
        this.jobLocator = jobLocator;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        @SuppressWarnings("unchacked")
        Map map = jobExecutionContext.getMergedJobDataMap();
        jobName = (String)map.get("jobName");
        try {
            JobExecution execution = jobLauncher.run(jobLocator.getJob(jobName), new JobParameters());
            System.out.println("Execution Status: " + execution.getStatus());
        }catch (Exception e){
            System.out.println("Encountered job execution exception! ");
            e.printStackTrace();
        }
    }
}
