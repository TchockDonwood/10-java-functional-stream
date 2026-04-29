package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Task04Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in, "UTF-8"))) {

            String text = reader.lines().collect(Collectors.joining(" "));

            String result = java.util.Arrays.stream(text.split("[^\\p{L}\\d]+"))
                    .filter(word -> !word.isEmpty())
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(
                            Map.Entry.<String, Long>comparingByValue().reversed()
                                    .thenComparing(Map.Entry.comparingByKey())
                    )
                    .limit(10)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.joining("\n"));

            System.out.println(result);
        }
    }
}
