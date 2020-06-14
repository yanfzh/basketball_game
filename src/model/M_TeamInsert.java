package model;

public class M_TeamInsert {
	private String TeamID;
	private String TeamName;
	private String TeamCity;
	private int    Champions;
	private String GYM;
	private String NowRanking;
	private String NowWinRate;
	private String CurrentCoach;
	
	
	
	public M_TeamInsert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public M_TeamInsert(String teamID, String teamName, String teamCity, int champions, String gYM, String nowRanking,
			String nowWinRate, String currentCoach) {
		super();
		TeamID = teamID;
		TeamName = teamName;
		TeamCity = teamCity;
		Champions = champions;
		GYM = gYM;
		NowRanking = nowRanking;
		NowWinRate = nowWinRate;
		CurrentCoach = currentCoach;
	}


	public String getTeamID() {
		return TeamID;
	}
	public void setTeamID(String teamID) {
		TeamID = teamID;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public String getTeamCity() {
		return TeamCity;
	}
	public void setTeamCity(String teamCity) {
		TeamCity = teamCity;
	}
	public int getChampions() {
		return Champions;
	}
	public void setChampions(int champions) {
		Champions = champions;
	}
	public String getGYM() {
		return GYM;
	}
	public void setGYM(String gYM) {
		GYM = gYM;
	}
	public String getNowRanking() {
		return NowRanking;
	}
	public void setNowRanking(String nowRanking) {
		NowRanking = nowRanking;
	}
	public String getNowWinRate() {
		return NowWinRate;
	}
	public void setNowWinRate(String nowWinRate) {
		NowWinRate = nowWinRate;
	}
	public String getCurrentCoach() {
		return CurrentCoach;
	}
	public void setCurrentCoach(String currentCoach) {
		CurrentCoach = currentCoach;
	}
	
}
