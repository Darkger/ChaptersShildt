package com.eugene.javacore.practic3.chainOfResponsibility;

public class RegistrationRunner {
    public static void main(String[] args) {
        Level first = new LevelSecond(Step.FIRST);
        Level second = new LevelFirst(Step.SECOND);

        Level third = new LevelThird(Step.THIRD);

         first.setNextStage(second);
         second.setNextStage(third);

        first.registrationManager("level 1",Step.FIRST);
        System.out.println();
        System.out.println();
        second.registrationManager("level 2",Step.SECOND);
        System.out.println();
        System.out.println();
        third.registrationManager("final",Step.THIRD);
        System.out.println();
        System.out.println();

    }
}
