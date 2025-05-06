package org.example.stream_api;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        String s="Mahavir Singh";
        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);

        s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(
                e->e.getValue()==1
        ).forEach(
                System.out::println
        );

        List<Character> characters= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(
                e->e.getValue()==1
        ).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(characters);

        Optional<Long> max= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(
                e->e.getValue()>0
        ).map(Map.Entry::getValue).max(Comparator.comparingLong(x -> x));
        max.ifPresent(System.out::println);

        //first not repeating character
        s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).findFirst().ifPresent(System.out::println);


        List<Integer> list=List.of(1,3,4,2,4,12,23,12,12,20);
        Optional<Integer> secondHeightst=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHeightst.ifPresent(System.out::println);

        String [] arr= {"mahavir","singh","abc"};
        Optional<String> maxLength= Arrays.stream(arr).max((s1,s2)->s1.length()-s2.length());
        if(max.isPresent())
        System.out.println(maxLength);

    }
}
