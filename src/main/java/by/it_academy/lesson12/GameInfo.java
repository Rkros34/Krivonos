package by.it_academy.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Нужно написать программу, которая будет спрашивать пользователя название команды,
 * пользователь через консоль введет название команды.
 * После этого программа должна напечатать:
 * общее количество игр с этой командой, количество побед и количество проигрышей.
 * Информацию в формате 'первая команда, вторая команда, очки первой команды, очки второй команды' брать из файла data.csv
 */

public class GameInfo {
    private final String nameOfFirstTeam;
    private final String nameOfSecondTeam;
    private final int pointOfFirstTeam;
    private final int pointOfSecondTeam;


    public GameInfo(String nameOfFirstTeam, String nameOfSecondTeam, int pointOfFirstTeam, int pointOfSecondTeam) {
        this.nameOfFirstTeam = nameOfFirstTeam;
        this.nameOfSecondTeam = nameOfSecondTeam;
        this.pointOfFirstTeam = pointOfFirstTeam;
        this.pointOfSecondTeam = pointOfSecondTeam;
    }

    boolean hasTeam (String teamFromUser){
        return nameOfFirstTeam.equals(teamFromUser)||nameOfSecondTeam.equals(teamFromUser);
    }

    String getWinner(){
        if(pointOfFirstTeam>pointOfSecondTeam){
            return nameOfFirstTeam;
        }
            return nameOfSecondTeam;
    }
}
