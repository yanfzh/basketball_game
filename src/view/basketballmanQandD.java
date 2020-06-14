package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.BasketManDao;
import dao.PlayerDao;
import model.M_BasketMan;
import model.M_TbMatchPlayer;
import util.Main;
import util.StringUtil;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.Font;
import java.awt.Toolkit;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class basketballmanQandD extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	private BasketManDao basketManDao=new BasketManDao();
    private Main main=new Main();
    String ID;
    private JTextField textField_9;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basketballmanQandD frame = new basketballmanQandD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public basketballmanQandD() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(basketballmanQandD.class.getResource("/images/Basketball_23.96694214876px_1191175_easyicon.net (1).png")));
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 17));
		setTitle("球员信息查询");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 876, 541);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(224, 0, 634, 320);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tableMousePressed(e);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u7403\u5458\u7F16\u53F7", "\u7403\u961F\u7F16\u53F7", "\u7403\u5458\u540D\u79F0", "\u751F\u65E5", "\u51FA\u751F\u5730", "\u8EAB\u9AD8", "\u4F53\u91CD", "\u4F4D\u7F6E"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("球员查询：");
		label.setBounds(14, 26, 104, 18);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(14, 239, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("所有球员信息查询");
		button.setFont(new Font("SimSun", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allPlayerMesgSearch(e);
			}
		});
		button.setBounds(16, 64, 170, 27);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("球员编号：");
		label_1.setBounds(17, 203, 101, 18);
		contentPane.add(label_1);
		
		JButton button_1 = new JButton("查询");
		button_1.setFont(new Font("SimSun", Font.BOLD, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerIDSearchActionPerformed(e);
			}
		});
		button_1.setBounds(108, 238, 79, 27);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("修改");
		button_2.setFont(new Font("SimSun", Font.BOLD, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateAction(e);
			}
		});
		button_2.setBounds(18, 293, 79, 27);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("删除");
		button_3.setFont(new Font("SimSun", Font.BOLD, 12));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deleteAction(arg0);
			}
		});
		button_3.setBounds(110, 292, 79, 27);
		contentPane.add(button_3);
		
		JLabel label_2 = new JLabel("球员编号：");
		label_2.setBounds(70, 359, 112, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("球队编号：");
		label_3.setBounds(290, 359, 112, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("球员名称：");
		label_4.setBounds(550, 359, 112, 18);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("生日：");
		label_5.setBounds(70, 405, 112, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("出生地：");
		label_6.setBounds(290, 405, 112, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("身高：");
		label_7.setBounds(550, 405, 112, 18);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("体重：");
		label_8.setBounds(70, 450, 112, 18);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("位置：");
		label_9.setBounds(290, 450, 112, 18);
		contentPane.add(label_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 354, 100, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(375, 354, 100, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(640, 354, 100, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(140, 400, 100, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(375, 400, 100, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(640, 400, 100, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(140, 450, 100, 24);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(375, 450, 100, 24);
		contentPane.add(textField_8);
		
		JLabel label_10 = DefaultComponentFactory.getInstance().createTitle("球员名称:");
		label_10.setFont(new Font("SimSun", Font.PLAIN, 12));
		label_10.setBounds(14, 127, 108, 15);
		contentPane.add(label_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(14, 156, 86, 24);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton button_4 = new JButton("查询");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerNameSearch();
			}
		});
		button_4.setFont(new Font("SimSun", Font.BOLD, 12));
		button_4.setBounds(108, 156, 79, 23);
		contentPane.add(button_4);
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
	}
	//球员名称模糊查询
	protected void playerNameSearch() {
		// TODO Auto-generated method stub
		String s_PlayerName=this.textField_9.getText();
		 if(StringUtil.isEmpty(s_PlayerName)) {
			 JOptionPane.showMessageDialog(null,"请输入要查询的球员名称！");
			 return;
		 }
		 
		 M_BasketMan m_BasketMan=new M_BasketMan();
		try {
			m_BasketMan.setPlayerName(s_PlayerName);
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null,"信息查询失败！");
			 e1.printStackTrace();
		}
		 DefaultTableModel dtm=(DefaultTableModel)table.getModel();//取得表格
			dtm.setRowCount(0);
			Connection con=null;
			try {
				con=main.getConnection();
				ResultSet rs=basketManDao.List1(con,m_BasketMan);
				
				while(rs.next()) {
					Vector v=new Vector();
					v.add(rs.getString("球员编号"));
					v.add(rs.getString("球队编号"));
					v.add(rs.getString("球员名称"));
					v.add(rs.getString("生日"));
					v.add(rs.getString("出生地"));
					v.add(rs.getString("身高"));
					v.add(rs.getString("体重"));
					v.add(rs.getString("位置"));
					
					dtm.addRow(v);
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null,"信息查询失败！");
				 e2.printStackTrace();
			}finally {
				try {
					main.closeCon(con);
				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null,"信息查询失败！");
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			}
	}

	//行获取操作，在界面表格选中1行，自动捕捉整行信息到修改文本框
	protected void tableMousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int row=this.table.getSelectedRow();
		this.textField_1.setText((String)table.getValueAt(row, 0));
		this.textField_2.setText((String)table.getValueAt(row, 1));
		this.textField_3.setText((String)table.getValueAt(row, 2));
		this.textField_4.setText((String)table.getValueAt(row, 3));
		this.textField_5.setText((String)table.getValueAt(row, 4));
		this.textField_6.setText((String)table.getValueAt(row, 5));
		this.textField_7.setText((String)table.getValueAt(row, 6));
		this.textField_8.setText((String)table.getValueAt(row, 7));

		ID=(String)table.getValueAt(row, 0);
	}

	//删除操作
	protected void deleteAction(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String PlayerID=textField_1.getText();
		if(StringUtil.isEmpty(PlayerID)) {
			JOptionPane.showMessageDialog(null,"请选择要删除的记录！");
			return;
		}
		int n=JOptionPane.showConfirmDialog(null,"确定删除该记录吗？");
		if(n==0) {
			Connection con=null;
			try {
				con=main.getConnection();
				int flag=basketManDao.delete(con,PlayerID);
				if(flag==1) {
					JOptionPane.showMessageDialog(null,"删除成功！");
					this.resetValue();
					this.fillTable(new M_BasketMan());//刷新表单
				}
				else {
					JOptionPane.showMessageDialog(null,"删除失败！");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				try {
					main.closeCon(con);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"删除失败！");
				}
			}
		}
	}

	//修改操作
	protected void updateAction(ActionEvent e) {
		//从界面获取所要修改的信息
		 String PlayerID=textField_1.getText();
		 int TeamID=Integer.valueOf(textField_2.getText());
		 String PlayerName=textField_3.getText();
		 String Birthday=textField_4.getText();
		 String Birthplace=textField_5.getText();
		 String Height=textField_6.getText();
		 String Weight=textField_7.getText();
		 String PlayerPosition=textField_8.getText();
		 //必填项是否为空值判断
		 if(StringUtil.isEmpty(String.valueOf(PlayerID))) {
			 JOptionPane.showMessageDialog(null,"请输入要修改的球员编码！");
			 return;
		 }
		 M_BasketMan m_BasketMan=new M_BasketMan(PlayerID, TeamID, PlayerName, Birthday,Birthplace, Height,
					Weight, PlayerPosition) ;
		 	 Connection con=null;
		 try {
			 con=main.getConnection();
			int flag=basketManDao.update(con,m_BasketMan,ID);
			if(flag==1) {
				JOptionPane.showMessageDialog(null,"修改成功！");
				this.resetValue();//重置表单
				this.fillTable(new M_BasketMan());//刷新表单
			}
			else {
				JOptionPane.showMessageDialog(null,"修改失败！");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			try {
				main.closeCon(con);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null,"修改失败！");
			}
		}
	}

	//球员编码查询
	protected void playerIDSearchActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s_PlayerID=this.textField.getText();
		 if(StringUtil.isEmpty(s_PlayerID)) {
			 JOptionPane.showMessageDialog(null,"请输入要查询的球员编号！");
			 return;
		 }
		 
		 M_BasketMan m_BasketMan=new M_BasketMan();
		try {
			m_BasketMan.setPlayerID(s_PlayerID);
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null,"信息查询失败！");
			 e1.printStackTrace();
		}
		 DefaultTableModel dtm=(DefaultTableModel)table.getModel();//取得表格
			dtm.setRowCount(0);
			Connection con=null;
			try {
				con=main.getConnection();
				ResultSet rs=basketManDao.List(con,m_BasketMan);
				
				while(rs.next()) {
					Vector v=new Vector();
					v.add(rs.getString("球员编号"));
					v.add(rs.getString("球队编号"));
					v.add(rs.getString("球员名称"));
					v.add(rs.getString("生日"));
					v.add(rs.getString("出生地"));
					v.add(rs.getString("身高"));
					v.add(rs.getString("体重"));
					v.add(rs.getString("位置"));
					
					dtm.addRow(v);
				}
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null,"信息查询失败1！");
				 e2.printStackTrace();
			}finally {
				try {
					main.closeCon(con);
				} catch (Exception e3) {
					JOptionPane.showMessageDialog(null,"信息查询失败2！");
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			}
		
	}

	//所有球员信息查询
	protected void allPlayerMesgSearch(ActionEvent e) {
		// TODO Auto-generated method stub
		this.fillTable(new M_BasketMan());
	}
	//刷新表格
	private void fillTable(M_BasketMan M_BasketMan) {
		DefaultTableModel dtm=(DefaultTableModel) table.getModel();
		dtm.setRowCount(0);//表格清空
		Connection con=null;
		try {
			con=main.getConnection();
			ResultSet rs = BasketManDao.ListA(con,M_BasketMan);
			while (rs.next()) {
				Vector v=new Vector();
				v.add(rs.getString("球员编号"));
				v.add(rs.getString("球队编号"));
				v.add(rs.getString("球员名称"));
				v.add(rs.getString("生日"));
				v.add(rs.getString("出生地"));
				v.add(rs.getString("身高"));
				v.add(rs.getString("体重"));
				v.add(rs.getString("位置"));
				dtm.addRow(v);
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"信息查询失败1！");
			e.printStackTrace();
		}finally {
			try {
				//main.closeCon(con);
				main.closeCon(con);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"信息查询失败2！");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//重置表单
		private void resetValue() {
			this.textField_1.setText("");
			this.textField_2.setText("");
			this.textField_3.setText("");
			this.textField_4.setText("");
			this.textField_5.setText("");
			this.textField_6.setText("");
			this.textField_7.setText("");
			this.textField_8.setText("");
			
		}
}
