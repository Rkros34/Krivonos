package by.it_academy.lesson12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        readFromFile();
    }

    private static void readFromFile() {
        Path path = Path.of("D:\\IT Academy\\data.csv");
        try {
            List<String> gameInfoList = Files.readAllLines(path);
            for (String str : gameInfoList) {
                String[] listOfGame=str.split("\\,");
                new GameInfo(listOfGame[0],listOfGame[1], Integer.parseInt(listOfGame[2]),Integer.parseInt(listOfGame[3]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

