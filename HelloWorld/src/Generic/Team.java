package Generic;
import java.util.*;
import java.util.stream.*;

public class Team <T>{
	
	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	private String teamName;
	private List<T> teamMembers = new ArrayList<>();
	private int totalWins = 0;
	private int totalLoses = 0;
	private int totalTies = 0;
	
	public void addTeamMembers(T t) {
		if(!teamMembers.contains(t)) {
			teamMembers.add(t);
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
