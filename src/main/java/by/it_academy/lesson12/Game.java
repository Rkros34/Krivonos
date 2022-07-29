package by.it_academy.lesson12;
/**
 * Нужно написать программу, которая будет спрашивать пользователя название команды,
 * пользователь через консоль введет название команды.
 * После этого программа должна напечатать:
 * общее количество игр с этой командой, количество побед и количество проигрышей.
 * Информацию в формате 'первая команда, вторая команда, очки первой команды, очки второй команды' брать из файла data.csv
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the team's name: ");
        var teamFromUser = scanner.nextLine();
        scanner.close();
        int wins = 0;
        int loses = 0;
        for (GameInfo game : readFromFile()) {
            if (game.hasTeam(teamFromUser)) {
                if (game.getWinner().equals(teamFromUser)) {
                    wins++;
                } else {
                    loses++;
                }
            }
        }
        System.out.println("Total result: " + (wins + loses));
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
    }


    private static ArrayList<GameInfo> readFromFile() {
        var games = new ArrayList<GameInfo>();
        Path path = Path.of("D:\\IT Academy\\data.csv");
        try {
            List<String> gameInfoList = Files.readAllLines(path);
            for (String str : gameInfoList) {
                String[] listOfGame = str.split(",");
                games.add(new GameInfo(listOfGame[0], listOfGame[1], Integer.parseInt(listOfGame[2]), Integer.parseInt(listOfGame[3])));
            }
            return games;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

