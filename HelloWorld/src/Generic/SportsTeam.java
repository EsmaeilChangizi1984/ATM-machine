package Generic;
import java.util.*;
import java.util.stream.*;

public class SportsTeam {
	
	public SportsTeam(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	private String teamName;
	private List<Player> teamMembers = new ArrayList<>();
	private int totalWins = 0;
	private int totalLoses = 0;
	private int totalTies = 0;
	
	public void addTeamMembers(Player player) {
		if(!teamMembers.contains(player)) {
			teamMembers.add(player);
		}
	}
	
	public void listTeamMembers() {
		
		System.out.println(teamName + " Roster:");
		System.out.println(teamMembers);
	}
	
	public int ranking() {
		return (totalLoses*2)+totalTies+1;
	}
	
	public String setScore(int ourGoals, int theirGoals) {
		
		String message = "Lost to.";
		if(ourGoals > theirGoals) {
			totalWins++;
			message = "Beat";
		}else if(ourGoals==theirGoals) {
			totalTies++;
			message = "Tie";
		}else {
			totalLoses++;
		}
		return message;
	}
	
	@Override
	public String toString() {
		return teamName + "( Rank "+ranking()+")";
	}

}
