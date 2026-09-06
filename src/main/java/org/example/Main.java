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
        //Count the number of characters in a String.
        String name = "ppprudhvi";
        String sentence = "is java is easy and java is powerful";
      String res =  Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(e -> e,Collectors.counting())).entrySet().stream().filter(e -> e.getValue()==1).map(e -> e.getKey()).findFirst().orElse("n");
        System.out.println(res);
    }
}