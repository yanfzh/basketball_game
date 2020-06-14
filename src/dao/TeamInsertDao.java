package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.M_TbMatchPlayer;
import model.M_TeamInsert;
import util.StringUtil;

public class TeamInsertDao {
	public int add(Connection con,M_TeamInsert M_TeamInsert)throws Exception {
		String sql="insert into 球队信息表 values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, M_TeamInsert.getTeamID());
		pstmt.setString(2, M_TeamInsert.getTeamName());
		pstmt.setString(3,M_TeamInsert.getTeamCity());
		pstmt.setInt(4, M_TeamInsert.getChampions());
		pstmt.setString(5, M_TeamInsert.getGYM());
		pstmt.setString(6, M_TeamInsert.getNowRanking());
		pstmt.setString(7, M_TeamInsert.getNowWinRate());
		pstmt.setString(8, M_TeamInsert.getCurrentCoach());
		return pstmt.executeUpdate();
	}
	
	//球队编号查询集合
			public static  ResultSet List(Connection con,M_TeamInsert M_TeamInsert )throws Exception {
				StringBuffer sb=new StringBuffer("select * from 球队信息表");
				if(StringUtil.isNotEmpty(M_TeamInsert.getTeamID())) 
					{
					sb.append(" and 球队编号="+M_TeamInsert.getTeamID());
				}
				//and 替换成where
				PreparedStatement pstmt =con.prepareStatement(sb.toString().replaceFirst("and", "where"));
				return pstmt.executeQuery();
			}
			//所有球队信息
			public static  ResultSet ListA(Connection con,M_TeamInsert M_TeamInsert)throws Exception {
				String sql="select * from 球队信息表 ";
				PreparedStatement pstmt =con.prepareStatement(sql);
				return pstmt.executeQuery();
			}
			
			
			//删除
			public int delete(Connection con,String MatchTeamID)throws Exception{
				String sql="delete  from 球队信息表 where 球队编号=?";
				PreparedStatement pstmt =con.prepareStatement(sql);
				pstmt.setString(1, MatchTeamID);
				return pstmt.executeUpdate();
			}
			//修改
			public int update(Connection con,M_TeamInsert M_TeamInsert,String ID)throws Exception{
				String sql="update 球队信息表 set 球队编号=?,球队名称=?,城市=?,总冠军次数=?,体育馆=?,"
						+ "当前排名=?,当前胜率=?,现任主教练=? where 球队编号=?";
				PreparedStatement pstmt =con.prepareStatement(sql);
				
				pstmt.setString(1, M_TeamInsert.getTeamID());
				pstmt.setString(2, M_TeamInsert.getTeamName());
				pstmt.setString(3, M_TeamInsert.getTeamCity());
				pstmt.setInt(4, M_TeamInsert.getChampions());
				pstmt.setString(5, M_TeamInsert.getGYM());
				pstmt.setString(6, M_TeamInsert.getNowRanking());
				pstmt.setString(7, M_TeamInsert.getNowWinRate());
				pstmt.setString(8, M_TeamInsert.getCurrentCoach());
				pstmt.setString(9, ID);
				return pstmt.executeUpdate();
			}
}
