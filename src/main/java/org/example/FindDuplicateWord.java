package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateWord {
    String sentence = "java is easy and java is powerful";
    List<String> res =  Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(e -> e,Collectors.counting())).entrySet().stream().filter(e -> e.getValue()>1).map(e -> e.getKey()).collect(Collectors.toList());
       // System.out.println(res);
}
