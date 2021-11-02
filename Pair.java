

import java.util.*;
import java.util.Map;
import java.lang.String;

public class Pair {

    public static void main(String[] args)
        {
            // initialize a HashMap for STRING AS KEY and STRING AS VALUE
            HashMap<String, String> myObj = new HashMap<>();

            // Add elements using put method
            myObj.put("Raja","EEE-232");
            myObj.put("Yugesh","EEE-240");
            myObj.put("Anil","EEE-233");    

            
            
            for (Map.Entry<String, String> e :myObj.entrySet())
                System.out.println("Key: as NAME:--> " + e.getKey()+" /"
                        + " Value: as STREAM:--> " + e.getValue());
           

            
                        HashMap<String, java.util.Date> myObj1 = new HashMap<>();
                        myObj1.put("TODAY  IS ", new java.util.Date());

                        // Print and display TIMINGS of MyObj//
                        System.out.println("TIME AND DATE OF MyObj : "
                                + myObj1);

                    }
                }
     



