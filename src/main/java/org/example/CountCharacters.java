package org.example;

import java.util.stream.Collectors;

public class CountCharacters {

    String s = "prudhvi";
    Long res = s.chars().mapToObj(e -> (char) e).collect(Collectors.counting());
    //System.out.println(res);

}
