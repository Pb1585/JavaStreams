package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindUniqueCharacters {
    String name = "testeettt";
    Long res =  IntStream.range(0,name.length()).mapToObj(e -> name.charAt(e)).filter(e -> !"aeiou".contains(String.valueOf(e))).collect(Collectors.counting());
}
