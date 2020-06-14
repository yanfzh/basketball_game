package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import model.M_BasketMan;
import model.M_CompeteInsert;
import model.M_TbMatchPlayer;
import model.M_TeamInsert;
import util.StringUtil;

public class PlayerDao {
	
	/**
	 * 比赛球员信息添加
	 * @param con
	 * @param M_TbMatchPlayer
	 * @return
	 * @throws Exception
	 */
	public int add(Connection con, M_TbMatchPlayer M_TbMatchPlayer) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into 比赛球员信息表 values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, M_TbMatchPlayer.getMatchPalyerID());
		pstmt.setInt(2, M_TbMatchPlayer.getMatchTeamID());
		pstmt.setInt(3, M_TbMatchPlayer.getToltalRebounds());
		pstmt.setInt(4, M_TbMatchPlayer.getAssists());
		pstmt.setInt(5, M_TbMatchPlayer.getScore());
		pstmt.setInt(6, M_TbMatchPlayer.getSteals());
		pstmt.setInt(7, M_TbMatchPlayer.getBlocks());
		pstmt.setInt(8, M_TbMatchPlayer.getFoul());
		return pstmt.executeUpdate();
	}
	
	/**
	 * 查询比赛球员信息
	 * @param con
	 * @param M_TbMatchPlayer
	 * @return
	 * @throws Exception
	 */
	//比赛球员编号查询集合
		public  ResultSet List(Connection con,M_TbMatchPlayer M_TbMatchPlayer )throws Exception {
			StringBuffer sb=new StringBuffer("select * from 比赛球员信息表");
			if(StringUtil.isNotEmpty(M_TbMatchPlayer.getMatchPalyerID())) 
				{
				sb.append(" and 比赛球员编号="+M_TbMatchPlayer.getMatchPalyerID());
			}
			//and 替换成where
			PreparedStatement pstmt =con.prepareStatement(sb.toString().replaceFirst("and", "where"));
			return pstmt.executeQuery();
		}
		//所有比赛球员信息
		public static  ResultSet ListA(Connection con,M_TbMatchPlayer M_TbMatchPlayer)throws Exception {
			String sql="select * from 比赛球员信息表 ";
			PreparedStatement pstmt =con.prepareStatement(sql);
			return pstmt.executeQuery();
		}
		
		
		//删除
		public int delete(Connection con,String MatchTeamID)throws Exception{
			String sql="delete  from 比赛球员信息表 where 比赛球员编号=?";
			PreparedStatement pstmt =con.prepareStatement(sql);
			pstmt.setString(1, MatchTeamID);
			return pstmt.executeUpdate();
		}
		//修改
		public int update(Connection con,M_TbMatchPlayer M_TbMatchPlayer,String ID)throws Exception{
			String sql="update 比赛球员信息表 set 比赛球员编号=?,赛事编号=?,总篮板=?,助攻=?,得分=?,"
					+ "抢断=?,盖帽=?,犯规=? where 比赛球员编号=?";
			PreparedStatement pstmt =con.prepareStatement(sql);
			
			pstmt.setString(1, M_TbMatchPlayer.getMatchPalyerID());
			pstmt.setInt(2, M_TbMatchPlayer.getMatchTeamID());
			pstmt.setInt(3, M_TbMatchPlayer.getToltalRebounds());
			pstmt.setInt(4, M_TbMatchPlayer.getAssists());
			pstmt.setInt(5, M_TbMatchPlayer.getScore());
			pstmt.setInt(6, M_TbMatchPlayer.getSteals());
			pstmt.setInt(7, M_TbMatchPlayer.getBlocks());
			pstmt.setInt(8, M_TbMatchPlayer.getFoul());
			pstmt.setString(9, ID);
			return pstmt.executeUpdate();
		}
}
