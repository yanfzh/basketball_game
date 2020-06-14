package model;

public class M_TbMatchPlayer {
	private String MatchPalyerID;
	private int MatchTeamID;
	private int ToltalRebounds;
	private int Assists;
	private int Score;
	private int Steals;
	private int Blocks;
	private int Foul;
	
	
	public M_TbMatchPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public M_TbMatchPlayer(String matchPalyerID, int matchTeamID, int toltalRebounds, int assists, int score, int steals,
			int blocks, int foul) {
		super();
		MatchPalyerID = matchPalyerID;
		MatchTeamID = matchTeamID;
		ToltalRebounds = toltalRebounds;
		Assists = assists;
		Score = score;
		Steals = steals;
		Blocks = blocks;
		Foul = foul;
	}


	public String getMatchPalyerID() {
		return MatchPalyerID;
	}
	public void setMatchPalyerID(String matchPalyerID) {
		MatchPalyerID = matchPalyerID;
	}
	public int getMatchTeamID() {
		return MatchTeamID;
	}
	public void setMatchTeamID(int matchTeamID) {
		MatchTeamID = matchTeamID;
	}
	public int getToltalRebounds() {
		return ToltalRebounds;
	}
	public void setToltalRebounds(int toltalRebounds) {
		ToltalRebounds = toltalRebounds;
	}
	public int getAssists() {
		return Assists;
	}
	public void setAssists(int assists) {
		Assists = assists;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public int getSteals() {
		return Steals;
	}
	public void setSteals(int steals) {
		Steals = steals;
	}
	public int getBlocks() {
		return Blocks;
	}
	public void setBlocks(int blocks) {
		Blocks = blocks;
	}
	public int getFoul() {
		return Foul;
	}
	public void setFoul(int foul) {
		Foul = foul;
	}
	
}
