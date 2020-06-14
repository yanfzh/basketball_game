package model;

public class M_CompeteInsert {
	private String MatchTeamID;
	private int MTeamID;
	private int CTeamID;
	private int MScore;
	private int CScore;
	private int MMScore;
	private int CCScore;
	private String MDate;
	private String MTime;
	private String MWinRate;
	private String CWinRate;
	private int MRanking;
	private int CRanking;
	
	public M_CompeteInsert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public M_CompeteInsert(String matchTeamID, int mTeamID, int cTeamID, int mScore, int cScore, int mMScore, int cCScore,
			String mDate, String mTime, String mWinRate, String cWinRate, int mRanking, int cRanking) {
		super();
		MatchTeamID = matchTeamID;
		MTeamID = mTeamID;
		CTeamID = cTeamID;
		MScore = mScore;
		CScore = cScore;
		MMScore = mMScore;
		CCScore = cCScore;
		MDate = mDate;
		MTime = mTime;
		MWinRate = mWinRate;
		CWinRate = cWinRate;
		MRanking = mRanking;
		CRanking = cRanking;
	}


	public String getMatchTeamID() {
		return MatchTeamID;
	}
	public void setMatchTeamID(String matchTeamID) {
		MatchTeamID = matchTeamID;
	}
	public int getMTeamID() {
		return MTeamID;
	}
	public void setMTeamID(int mTeamID) {
		MTeamID = mTeamID;
	}
	public int getCTeamID() {
		return CTeamID;
	}
	public void setCTeamID(int cTeamID) {
		CTeamID = cTeamID;
	}
	public int getMScore() {
		return MScore;
	}
	public void setMScore(int mScore) {
		MScore = mScore;
	}
	public int getCScore() {
		return CScore;
	}
	public void setCScore(int cScore) {
		CScore = cScore;
	}
	public int getMMScore() {
		return MMScore;
	}
	public void setMMScore(int mMScore) {
		MMScore = mMScore;
	}
	public int getCCScore() {
		return CCScore;
	}
	public void setCCScore(int cCScore) {
		CCScore = cCScore;
	}
	public String getMDate() {
		return MDate;
	}
	public void setMDate(String mDate) {
		MDate = mDate;
	}
	public String getMTime() {
		return MTime;
	}
	public void setMTime(String mTime) {
		MTime = mTime;
	}
	public String getMWinRate() {
		return MWinRate;
	}
	public void setMWinRate(String mWinRate) {
		MWinRate = mWinRate;
	}
	public String getCWinRate() {
		return CWinRate;
	}
	public void setCWinRate(String cWinRate) {
		CWinRate = cWinRate;
	}
	public int getMRanking() {
		return MRanking;
	}
	public void setMRanking(int mRanking) {
		MRanking = mRanking;
	}
	public int getCRanking() {
		return CRanking;
	}
	public void setCRanking(int cRanking) {
		CRanking = cRanking;
	}
	
	
}
