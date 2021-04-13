package JavaGenerics.GenericsPart2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootBallPlayer> adelaideCrows = new Team(" Adelaide Crows");
        adelaideCrows.addPlayer(joe);
    /*    adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);
*/


        System.out.println(adelaideCrows.numPlayers());

        Team<BaseBallPlayer> baseBallTeam = new Team<>(" CHICAGO CUBS");
        baseBallTeam.addPlayer(pat);

        System.out.println(baseBallTeam.numPlayers());
        Team<SoccerPlayer> soccerTeam = new Team<>(" BARCELONA");
        soccerTeam.addPlayer(beckham);
        System.out.println(soccerTeam.numPlayers());


        Team<FootBallPlayer> melbourne = new Team<>("MELBOURNE");
        FootBallPlayer banks = new FootBallPlayer("GORDON");
        melbourne.addPlayer(banks);


        Team<FootBallPlayer> hawthorn = new Team<>("HAWTHORN");
        Team<FootBallPlayer> fremantle = new Team<>("FREMANTLE");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);


        adelaideCrows.matchResult(fremantle,2,1);


      //  adelaideCrows.matchResult(baseBallTeam,1,1);
        System.out.println("RANKINGS");
        System.out.println(adelaideCrows.getName() + ":" + adelaideCrows.rankin());
        System.out.println(hawthorn.getName() + ":" + hawthorn.rankin());
        System.out.println(melbourne.getName() + ":" + melbourne.rankin());
        System.out.println(fremantle.getName() + ":" +fremantle.rankin());


        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));


        ArrayList<Team> teams;
        /*Collections.sort(teams);*/
    }
}
