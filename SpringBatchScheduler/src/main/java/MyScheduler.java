import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
public class MyScheduler {

    @Autowired
    private JobLauncher launcher;

    @Autowired
    private Job job;

    private JobExecution execution;

    public void run(){
        try {
            execution = launcher.run(job, new JobParameters());
        }catch (JobExecutionAlreadyRunningException e){
            e.printStackTrace();
        }catch (JobRestartException e){
            e.printStackTrace();
        }catch (JobInstanceAlreadyCompleteException e){
            e.printStackTrace();
        }catch (JobParametersInvalidException e){
            e.printStackTrace();
        }
    }
}
