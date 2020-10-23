package com.eugene.javacore.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specilty) {
        Developer developer = developers.get(specilty);
        if (developer == null) {
            switch (specilty) {
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                case "C++":
                    System.out.println("Hiring C++ develoer...");
                    developer = new CppDeveloper();


            }
            developers.put(specilty, developer);
        }return developer;

    }
}
