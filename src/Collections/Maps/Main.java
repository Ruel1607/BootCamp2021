package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
      //  languages.put("Java","A COMPILED HIGH LEVET PLATFORM INDEPENDENT LANGUAGE");
        languages.put("PYTHON","AN INTERPRETED OOP HIGH LEVEL");
        languages.put("ALGOL","algo language");
        languages.put("BASIC","BEGGINERS ALL PURPOSES");
        languages.put("LISP","THEREIN LIES MADNESS");
/*
        System.out.println(languages.get("Java"));
        System.out.println(languages.get("PYTHON"));
        languages.put("Java","JAVA COURSE");
        System.out.println(languages.get("Java"));*/

        if(languages.containsKey("Java")){
            System.out.println("JAVA ALREADY EXIST");

        }else {
            languages.put("Java","JAVA COURSE");
            System.out.println("JAVA ADDED SUCCESFULLY");
            System.out.println(languages.get("Java"));
        }

        System.out.println("=======================================");

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
