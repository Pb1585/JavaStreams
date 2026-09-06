package org.example;

import java.util.stream.Collectors;

public class NumberOfDistinctcCharacters {

    String text = "aabb";
   Long res = text.chars().mapToObj(e -> (char) e).distinct().collect(Collectors.counting());

}
