package com.eugene.javacore.practic3.visitor;

public class Project implements ProjectItem {
    ProjectItem[] projectItem;

    public Project() {
       this.projectItem = new ProjectItem[]{
                new LaunchVehicle(),
                new Headunit()};
    }

    @Override
    public void toBeDone(DesignBureau designBureau) {
for(ProjectItem element:projectItem){
    element.toBeDone(designBureau);
}
    }
}
