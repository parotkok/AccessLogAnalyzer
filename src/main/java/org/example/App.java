package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

/**
 *
 */
public class App 
{
    private static String path = "d:/JAVA/access.log";

    public static void main( String[] args ) throws IOException {
        LocalDateTime time = LocalDateTime.of(2020, 12, 5, 6, 7, 8);
        System.out.println(time.toEpochSecond(ZoneOffset.UTC));


//        List<String> lines = Files.readAllLines(Paths.get(path));
//        for (String line : lines) {
//            System.out.println(line);
//        }
//        Statistics statistics = new Statistics(50, 22);
//        Gson gson = new Gson();
//        String json = gson.toJson(statistics);
//
//        System.out.println(json);
    }
}
