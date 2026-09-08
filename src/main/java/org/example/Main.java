package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> ls = List.of("String","Prudhvi","prudhi");
        String once = "shlsjdk";
        String res = once.chars().mapToObj(e -> (char) e).filter( e-> once.lastIndexOf(e) == once.indexOf(e)).map(e -> String.valueOf(e)).collect(Collectors.joining());
        System.out.println(res);
    }
}