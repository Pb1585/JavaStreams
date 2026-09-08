package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueCharacters {

    String unquie = "texting";
    String res = unquie.chars().mapToObj(e -> (char) e).map(e -> String.valueOf(e)).distinct().collect(Collectors.joining());

}
