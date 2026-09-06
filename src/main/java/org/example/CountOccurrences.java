package org.example;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrences {
    String name = "prudhvi";
   Map<Character,Long> mp = name.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e ,Collectors.counting()));
   //System.out.println(mp);
}
