package org.example;

import java.util.stream.IntStream;

public class FindTheFirstNonRepeated {
    String r = "prudhvi";
   Character res = r.chars().mapToObj(e -> (char) e).filter( e -> r.indexOf(e) != r.lastIndexOf(e)).findFirst().orElse('N');

   // using int stream
   //Character res = IntStream.range(0,name.length()).mapToObj(e -> name.charAt( e)).filter( e -> name.indexOf(String.valueOf(e)) == name.lastIndexOf(String.valueOf(e))).findFirst().orElse('N');

}
