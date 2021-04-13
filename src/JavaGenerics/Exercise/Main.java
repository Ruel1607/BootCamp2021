package JavaGenerics.Exercise;

import JavaGenerics.GenericsAnswer.League;
import JavaGenerics.GenericsAnswer.Team;

public class Main {

    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.


        JavaGenerics.GenericsAnswer.League<JavaGenerics.GenericsAnswer.Team<FootballPlayer>> footballLeague = new JavaGenerics.GenericsAnswer.League<>("AFL");
        JavaGenerics.GenericsAnswer.Team<FootballPlayer> adelaideCrows = new JavaGenerics.GenericsAnswer.Team<>("Adelaide Crows");
        JavaGenerics.GenericsAnswer.Team<FootballPlayer> melbourne = new JavaGenerics.GenericsAnswer.Team<>("Melbourne");
        JavaGenerics.GenericsAnswer.Team<FootballPlayer> hawthorn= new JavaGenerics.GenericsAnswer.Team<>("Hawthorn");
        JavaGenerics.GenericsAnswer.Team<FootballPlayer> fremantle= new JavaGenerics.GenericsAnswer.Team<>("Fremantle");
        JavaGenerics.GenericsAnswer.Team<BaseballPlayer> baseballTeam = new JavaGenerics.GenericsAnswer.Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

//        footballLeague.add(baseballTeam);
        footballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        JavaGenerics.GenericsAnswer.Team rawTeam = new JavaGenerics.GenericsAnswer.Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.add(rawTeam);     // unchecked warning

        JavaGenerics.GenericsAnswer.League<Team> rawLeague = new JavaGenerics.GenericsAnswer.League<>("Raw");
        rawLeague.add(adelaideCrows);     // no warning
        rawLeague.add(baseballTeam);    // no warning
        rawLeague.add(rawTeam);         // no warning

        JavaGenerics.GenericsAnswer.League reallyRaw = new League("Really raw");
        reallyRaw.add(adelaideCrows);     // unchecked warning
        reallyRaw.add(baseballTeam);    // unchecked warning
        reallyRaw.add(rawTeam);         // unchecked warning





















    }
}
