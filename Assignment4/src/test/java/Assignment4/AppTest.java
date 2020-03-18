package Assignment4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.*;

/**
 *
 */
public class AppTest 
{
    /**
     *
     */
    @Test
    public void AppTest() {
        List<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Green");
        colors.add("Blue");
        colors.add("violet");
        colors.add(4,"purple");
        colors.add(2,"maroon");

        colors.set(1, "light green");

        System.out.println("Colors: " + colors);
        System.out.println("Amount: " + colors.size());
        System.out.println("Colors is empty: "
                + colors.isEmpty());


        Set<String> aves=new HashSet<>();
        aves.add("Hornbill");
        aves.add("swallow");
        aves.add("sparrow");
        aves.add("kite");

        Set<String> A=new HashSet<>();
        aves.add("A");
        aves.add("B");
        aves.add("C");
        aves.add("D");
        aves.add("E");

        Set<String> B=new LinkedHashSet<>();
        aves.add("A");
        aves.add("B");
        aves.add("F");
        aves.add("G");

        System.out.println("Aves: " + aves);
        System.out.println("Amount: " + aves.size());
        System.out.println("Aves is empty: "
                + aves.isEmpty());


        Map<String,String> map = new HashMap<>();
        map.put("Tom",   "(111)123-4567");
        map.put("Dick",  "(222)123-7890");
        map.put("Harry", "(333)373-3703");

        String dp = map.get("Dick");

        System.out.println("Map: " + map);
        System.out.println("Map Size: " + map.size());
        System.out.println("Map is empty: "
                + map.isEmpty());
        System.out.println("Map contains Dick key: "
                + map.containsKey("Dick"));
        System.out.println("Dick Phone: " + dp);
        System.out.println("Dick key is removed: "
                + map.remove("Dick"));

        map.clear();


    }
}
