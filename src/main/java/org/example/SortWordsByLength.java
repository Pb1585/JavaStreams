package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortWordsByLength {
    List<String> ls = List.of("String","Prudhvi");
   Map<Integer,List<String>> mp = ls.stream().collect(Collectors.groupingBy(e -> e.length()));
}
