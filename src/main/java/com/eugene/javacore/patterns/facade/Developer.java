package com.eugene.javacore.patterns.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTrracker bugTrracker){
        if(bugTrracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        }else
        {
            System.out.println("Developer is reading Hubrhubr");
        }
    }
}
