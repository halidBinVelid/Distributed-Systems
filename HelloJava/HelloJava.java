package HelloJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HelloJava{
    public static void main(String[] args){
        System.out.println("hello java!");

        Greeting greeting1 = new Greeting("halit");
        System.out.println(new Greeting().hello());

        Greeting greeting2 = new Greeting();
        System.out.println(greeting1.hello("halit"));

         int c = 'a';
         Object o = c;
         String classname = o.getClass().getName();
         System.out.println(classname);

         LocalDate date = LocalDate.now();
         System.out.println(date.getYear());


        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(5);
        list.add(3);
        
        System.out.println(list);
        
        Collections.sort(list);

        System.out.println(list);

        Map<String, String> adresses = new TreeMap<>(); 
        adresses.put("halit", "balikesir/karesi");
        adresses.put("irem", "balikesir/karesi");
        adresses.put("bora", "balikesir/karesi");
        System.out.println(adresses);
        System.out.println(adresses.get("halit"));
    }
}
