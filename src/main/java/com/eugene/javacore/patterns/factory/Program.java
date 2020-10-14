package com.eugene.javacore.patterns.factory;

public class Program {
    public static void main(String[] args) {
       DeveloperFactory developerFactory = creatDeveloperBySpecialty("java");
        Developer developer = developerFactory.creatDeveloper();
        developer.writeCode();
    }
    static DeveloperFactory creatDeveloperBySpecialty (String specialty){
        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();

        }else if (specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("php"))
        {return new PhpDeveloperFactory();
        }
        else
         {
            throw new RuntimeException((specialty+"is unknow specialty."));
        }
    }
}
