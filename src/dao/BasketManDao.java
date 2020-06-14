package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.M_BasketMan;
import model.M_TbMatchPlayer;
import util.StringUtil;

public class BasketManDao {
	//添加
	public int add(Connection con,M_BasketMan M_PeopleMag)throws Exception {
		String sql="insert into 球员信息表 values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, M_PeopleMag.getPlayerID());
		pstmt.setInt(2, M_PeopleMag.getTeamID());
		pstmt.setString(3, M_PeopleMag.getPlayerName());
		pstmt.setString(4, M_PeopleMag.getBirthday());
		pstmt.setString(5, M_PeopleMag.getBirthplace());
		pstmt.setString(6, M_PeopleMag.getHeight());
		pstmt.setString(7, M_PeopleMag.getWeight());
		pstmt.setString(8, M_PeopleMag.getPlayerPosition());
		return pstmt.executeUpdate();
	}
	
	//球员编码查询
			public  ResultSet List(Connection con,M_BasketMan M_BasketMan )throws Exception {
				StringBuffer sb=new StringBuffer("select * from 球员信息表");
				if(StringUtil.isNotEmpty(M_BasketMan.getPlayerID())) 
					{
					sb.append(" and 球员编号="+M_BasketMan.getPlayerID());
				}
				//and 替换成where
				PreparedStatement pstmt =con.prepareStatement(sb.toString().replaceFirst("and", "where"));
				return pstmt.executeQuery();
			}
			
			//球员名称模糊查询
			public  ResultSet List1(Connection con,M_BasketMan M_BasketMan )throws Exception {
				StringBuffer sb=new StringBuffer("select * from 球员信息表");
				if(StringUtil.isNotEmpty(M_BasketMan.getPlayerName())) 
					{
					sb.append(" and 球员名称 like '%"+M_BasketMan.getPlayerName()+"%' ");
				}
				//and 替换成where
				PreparedStatement pstmt =con.prepareStatement(sb.toString().replaceFirst("and", "where"));
				return pstmt.executeQuery();
			}
			
			//所有球员信息
			public static  ResultSet ListA(Connection con,M_BasketMan M_BasketMan)throws Exception {
				String sql="select * from 球员信息表 ";
				PreparedStatement pstmt =con.prepareStatement(sql);
				return pstmt.executeQuery();
			}
			
			
			//删除
			public int delete(Connection con,String PlayerID)throws Exception{
				String sql="delete  from 球员信息表 where 球员编号=?";
				PreparedStatement pstmt =con.prepareStatement(sql);
				pstmt.setString(1, PlayerID);
				return pstmt.executeUpdate();
			}
			//修改
			public int update(Connection con,M_BasketMan M_BasketMan,String ID)throws Exception{
				String sql="update 球员信息表 set 球员编号=?,球队编号=?,球员名称=?,生日=?,出生地=?,"
						+ "身高=?,体重=?,位置=? where 球员编号=?";
				PreparedStatement pstmt =con.prepareStatement(sql);
				
				pstmt.setString(1, M_BasketMan.getPlayerID());
				pstmt.setInt(2, M_BasketMan.getTeamID());
				pstmt.setString(3, M_BasketMan.getPlayerName());
				pstmt.setString(4, M_BasketMan.getBirthday());
				pstmt.setString(5, M_BasketMan.getBirthplace());
				pstmt.setString(6, M_BasketMan.getHeight());
				pstmt.setString(7, M_BasketMan.getWeight());
				pstmt.setString(8, M_BasketMan.getPlayerPosition());
				pstmt.setString(9, ID);
				return pstmt.executeUpdate();
			}
			
}
