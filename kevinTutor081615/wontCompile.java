public abstract class PipelineJob {

    public abstract int doJob(int input);

}

public class IncrementByOneJob {

    public int doJob(int input) {
        return input + 1;
    }

}

public class Pipeline {
    
    private PipelineJob[] jobs;

    public Pipeline(PipelineJob...  jobs) {
        // TODO actually queue up this shit
    }

    public int startPipeline(int input) {
        int result= input;
        for (PipelineJob job : jobs) {
            result= job.doJob(result);
        }
        return result;
    }

}

...
PipelineJob job= new IncrementByOneJob();
new Pipeline(job, job, job, job, job).startPipeline(0);
...
