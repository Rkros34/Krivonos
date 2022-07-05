package by.it_academy.lesson12;

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
}
