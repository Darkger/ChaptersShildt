package com.eugene.javacore.practic3.factory;

public class EntarpriseRunner  {
    public static void main(String[] args) {
        ManagerFactory managerFactory = creatManagerFactory("office");
        ManagerFactory managerFactory1= creatManagerFactory("Sales");
        managerFactory.creatManager().sellGoods();
        managerFactory1.creatManager().sellGoods();
    }
    public static ManagerFactory creatManagerFactory(String str){
        if(str.equalsIgnoreCase("Office"))
        {
            return new OfficeManagerFactory();
        }
        else if (str.equalsIgnoreCase("Sales")){return new SalesManagerFactory();}
        else throw new RuntimeException("???");
    }
}
