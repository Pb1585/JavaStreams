package org.example;

import java.util.stream.Collectors;

public class FindCharactersOccurringExactlyOnce {

    String once = "aabbc";
    String res = once.chars().mapToObj(e -> (char) e).filter( e-> once.lastIndexOf(e) == once.indexOf(e)).map(e -> String.valueOf(e)).collect(Collectors.joining());
}
