package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.M_CompeteInsert;
import util.Main;
import util.StringUtil;

public class CompeteMesgDao {
	
	public int add(Connection con,M_CompeteInsert M_CompeteInsert)throws Exception {
		String sql="insert into 比赛信息表 values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, M_CompeteInsert.getMatchTeamID());
		pstmt.setInt(2, M_CompeteInsert.getMTeamID());
		pstmt.setInt(3, M_CompeteInsert.getCTeamID());
		pstmt.setInt(4, M_CompeteInsert.getMScore());
		pstmt.setInt(5, M_CompeteInsert.getCScore());
		pstmt.setInt(6, M_CompeteInsert.getMMScore());
		pstmt.setInt(7, M_CompeteInsert.getCCScore());
		pstmt.setString(8, M_CompeteInsert.getMDate());
		pstmt.setString(9, M_CompeteInsert.getMTime());
		pstmt.setString(10, M_CompeteInsert.getMWinRate());
		pstmt.setString(11, M_CompeteInsert.getCWinRate());
		pstmt.setInt(12, M_CompeteInsert.getMRanking());
		pstmt.setInt(13, M_CompeteInsert.getCRanking());
		return pstmt.executeUpdate();
	}
	
	//赛程编码查询集合
	public  ResultSet List(Connection con,M_CompeteInsert m_CompeteInsert)throws Exception {
		StringBuffer sb=new StringBuffer("select * from 比赛信息表");
			if(StringUtil.isNotEmpty(m_CompeteInsert.getMatchTeamID()))
		{
			sb.append(" and 赛事编号 ="+m_CompeteInsert.getMatchTeamID());
		}
		//and 替换成where
		PreparedStatement pstmt =con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
	//所有赛程信息
	public  ResultSet ListAll(Connection con,M_CompeteInsert M_CompeteInsert)throws Exception {
		String sql="select * from 比赛信息表 ";
		PreparedStatement pstmt =con.prepareStatement(sql);
		return pstmt.executeQuery();
	}
	
	//删除
	public int delete(Connection con,String MatchTeamID)throws Exception{
		String sql="delete  from 比赛信息表 where 赛事编号=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, MatchTeamID);
		return pstmt.executeUpdate();
	}
	//修改
	public int update(Connection con,M_CompeteInsert M_CompeteInsert,String ID)throws Exception{
		String sql="update 比赛信息表 set 赛事编号=?,主队编号=?,客队编号=?,主队分数=?,客队分数=?,"
				+ "主队最高分=?,客队最高分=?,比赛日期=?,比赛时间=?,主队胜率=?,客队胜率=?,主队名次=?,客队名次=? where 赛事编号=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, M_CompeteInsert.getMatchTeamID());
		pstmt.setInt(2, M_CompeteInsert.getMTeamID());
		pstmt.setInt(3, M_CompeteInsert.getCTeamID());
		pstmt.setInt(4, M_CompeteInsert.getMScore());
		pstmt.setInt(5, M_CompeteInsert.getCScore());
		pstmt.setInt(6, M_CompeteInsert.getMMScore());
		pstmt.setInt(7, M_CompeteInsert.getCCScore());
		pstmt.setString(8, M_CompeteInsert.getMDate());
		pstmt.setString(9, M_CompeteInsert.getMTime());
		pstmt.setString(10, M_CompeteInsert.getMWinRate());
		pstmt.setString(11, M_CompeteInsert.getCWinRate());
		pstmt.setInt(12, M_CompeteInsert.getMRanking());
		pstmt.setInt(13, M_CompeteInsert.getCRanking());
		pstmt.setString(14, ID);
		return pstmt.executeUpdate();
	}
	
}
