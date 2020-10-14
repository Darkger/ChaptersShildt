package com.eugene.javacore.patterns.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTrracker bugTrracker = new BugTrracker();
    public void solveProblems(){
        job.doJob();
        bugTrracker.startSprint();
        developer.doJobBeforeDeadline(bugTrracker);
    }
}
