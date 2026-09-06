package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.awt.geom.Path2D.contains;

public class CountVowels {
   String name = "Prudhvi";
    Long res =  IntStream.range(0,name.length()).mapToObj(e -> name.charAt(e)).filter(e -> "aeiou".contains(String.valueOf(e))).collect(Collectors.counting());
       //System.out.println(res);
}
