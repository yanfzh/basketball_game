package model;

public class M_BasketMan {
	private String PlayerID;
	private int TeamID;	
	private String PlayerName;
	private String Birthday;
	private String Birthplace;
	private String Height;
	private String Weight;
	private String PlayerPosition;
	
	public M_BasketMan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public M_BasketMan(String playerID, int teamID, String playerName, String birthday, String birthplace, String height,
			String weight, String playerPosition) {
		super();
		PlayerID = playerID;
		TeamID = teamID;
		PlayerName = playerName;
		Birthday = birthday;
		Birthplace = birthplace;
		Height = height;
		Weight = weight;
		PlayerPosition = playerPosition;
	}
    
	

	String playerPic=null;

	public int getTeamID() {
		return TeamID;
	}
	public void setTeamID(int teamID) {
		TeamID = teamID;
	}
	public String getPlayerID() {
		return PlayerID;
	}
	public void setPlayerID(String playerID) {
		PlayerID = playerID;
	}
	
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getBirthplace() {
		return Birthplace;
	}
	public void setBirthplace(String birthplace) {
		Birthplace = birthplace;
	}
	public String getHeight() {
		return Height;
	}
	public void setHeight(String height) {
		Height = height;
	}
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}
	public String getPlayerPosition() {
		return PlayerPosition;
	}
	public void setPlayerPosition(String playerPosition) {
		PlayerPosition = playerPosition;
	}
	
	
}
