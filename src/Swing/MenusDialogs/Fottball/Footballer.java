package Swing.MenusDialogs.Fottball;

import java.time.LocalDate;
import java.util.Date;

class Footballer
{
	private String name;
	private String club;
	private int gamesPlayed;
	private int goalsScored;
	
	public Footballer(String cl, String po, int gp,int gs)
	{
		this.name=cl;
		this.club=po;
		this.gamesPlayed=gp;
		this.goalsScored=gs;
		
	}
	public String getName()
	{
		return this.name;
	}
	public String getClub()
	{
		return this.club;
	}
	public int getGoalsScored()
	{
		return this.goalsScored;
	}
	public int getGamesPlayed()
	{
		return this.gamesPlayed;
	}

	public void addGoalsScored(int g)
	{
		this.goalsScored+=g;
	}
	public void stepGamesPlayed()
	{
		this.gamesPlayed++;
	}
	public void reset()
	{
		goalsScored=0;gamesPlayed=0;
	}


	public double calculateGoalsPerGames()
	{
		return (double)goalsScored/gamesPlayed;
	}

}