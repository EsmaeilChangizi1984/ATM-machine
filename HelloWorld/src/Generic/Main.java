package Generic;
import java.util.*;
import java.util.stream.*;

interface Player{}
record BaseballPlayers(String name, String position) implements Player{}
record FootBallPlayers(String name, String position) implements Player{}

public class Main {

	public static void main(String[] args) {
		
		BaseballTeam philies1 = new BaseballTeam("Philadelphia Philies");
		BaseballTeam astros1 = new BaseballTeam("Huston Astros");
		
		scoreResult(philies1,3,astros1,5);
		
		SportsTeam philies2 = new SportsTeam("Philadelphia Philies");
		SportsTeam astros2 = new SportsTeam("Huston Astros");
		
		scoreResult(philies2,3,astros2,5);
		
		Team<BaseballPlayers> philies = new Team <>("Philadelphia Philies");
		Team<BaseballPlayers> astros = new Team<>("Huston Astros");
		
		scoreResult(philies,3,astros,5);
		
		var David = new BaseballPlayers("Daivid","3");
		var Kelly = new BaseballPlayers("Kelly","22");
		
		philies.addTeamMembers(David);
		philies.addTeamMembers(Kelly);
		
		var ben = new BaseballPlayers("Jim","Crafter");
		philies.addTeamMembers(ben);
		
		philies.listTeamMembers();
		
		
		SportsTeam AFC1 = new SportsTeam("Adelide");
		Team<FootBallPlayers> AFC = new Team<>("Adelide");
		
		
		var tex = new FootBallPlayers("Esmaeil","Defender");
		var ted = new FootBallPlayers("Taha","Foreward");
		AFC.addTeamMembers(tex);
		AFC.addTeamMembers(ted);
		
		AFC.listTeamMembers();
		
		
		
		
	}
	
	public static void scoreResult(BaseballTeam team1,int t1_score,BaseballTeam team2, int t2_score) {
		
		String message = team1.setScore(t1_score, t2_score);
		                 team2.setScore(t1_score, t2_score);
		                 
		System.out.printf("%s %s %s %n",team1,message,team2);                 
	}
	
public static void scoreResult(SportsTeam team1,int t1_score,SportsTeam team2, int t2_score) {
		
		String message = team1.setScore(t1_score, t2_score);
		                 team2.setScore(t1_score, t2_score);
		                 
		System.out.printf("%s %s %s %n",team1,message,team2);                 
	}

public static void scoreResult(Team team1,int t1_score,Team team2, int t2_score) {
	
	String message = team1.setScore(t1_score, t2_score);
	                 team2.setScore(t1_score, t2_score);
	                 
	System.out.printf("%s %s %s %n",team1,message,team2);                 
}

}
