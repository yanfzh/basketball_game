package util;

import java.sql.*;

public class Main {
   
     String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL数据库引擎
     String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=小型篮球联赛管理系统";//数据源  ！！！！注意若出现加载或者连接数据库失败一般是这里出现问题
     String Name="sa";
     String Pwd="578081";
     
     public  Connection getConnection() throws Exception{     
      Class.forName(driverName);
      Connection con=DriverManager.getConnection(dbURL,Name,Pwd);
	  return con;
   
	 } 
     
    public void closeCon(Connection con) throws Exception {
    	if(con!=null) con.close();
    }
    
    public static void main(String[] args) {
    	Main Main=new Main();
    	try {
			Main.getConnection();
			System.out.println("数据库连接成功！");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("数据库连接失败！");
		}
    	
    }
}   
	
