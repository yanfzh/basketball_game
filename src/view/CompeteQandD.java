package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.CompeteMesgDao;
import model.M_CompeteInsert;
import util.Main;
import util.StringUtil;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.Font;

public class CompeteQandD extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTable table;

	private Main main=new Main();
	private CompeteMesgDao competeMesgDao=new CompeteMesgDao();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	
	String ID;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompeteQandD frame = new CompeteQandD();
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
	public CompeteQandD() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CompeteQandD.class.getResource("/images/Basketball_23.96694214876px_1191175_easyicon.net (1).png")));
		
		
		
		setTitle("赛程管理");
		setVisible(true);
		setBounds(100, 100, 1100, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("赛程：");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("赛程编码：");
		
		JButton button = new JButton("所有赛程查询");
		button.setFont(new Font("SimSun", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//查询---
				allCompeteMesgActionPerformed(e);
				
			}
		});
		
		btnNewButton = new JButton("查询");
		btnNewButton.setFont(new Font("SimSun", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				competeMesgIDSeachActionPerformed(e1);
			}
		});
		
		btnNewButton_1 = new JButton("修改");
		btnNewButton_1.setFont(new Font("SimSun", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateActionPerformed(e);
			}
		});
		
		btnNewButton_2 = new JButton("删除");
		btnNewButton_2.setFont(new Font("SimSun", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteCompeteActionPerformed(e);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel label_2 = DefaultComponentFactory.getInstance().createLabel("赛事编号");
		
		JLabel label_3 = DefaultComponentFactory.getInstance().createLabel("主队编号");
		
		JLabel label_4 = DefaultComponentFactory.getInstance().createLabel("客队编号");
		
		JLabel label_5 = DefaultComponentFactory.getInstance().createLabel("主队分数");
		
		JLabel label_6 = DefaultComponentFactory.getInstance().createLabel("客队分数");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel label_7 = DefaultComponentFactory.getInstance().createLabel("主队最高分");
		
		JLabel label_8 = DefaultComponentFactory.getInstance().createLabel("客队最高分");
		
		JLabel label_9 = DefaultComponentFactory.getInstance().createLabel("比赛日期");
		
		JLabel label_10 = DefaultComponentFactory.getInstance().createLabel("比赛时间");
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("主队胜率");
		
		JLabel label_11 = DefaultComponentFactory.getInstance().createTitle("客队胜率");
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("主队名次");
		
		JLabel label_12 = DefaultComponentFactory.getInstance().createTitle("客队名次");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(label_1)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnNewButton_1)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnNewButton_2)))
								.addComponent(label)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(button)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_2)
									.addGap(18)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_3)
									.addGap(18)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_4)
									.addGap(18)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_5)
									.addGap(18)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_6)
									.addGap(18)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewJgoodiesLabel)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(label_9)
										.addComponent(label_7)
										.addComponent(label_8)
										.addComponent(label_10))
									.addGap(22)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_10, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(textField_9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(label_11)
											.addGap(18)
											.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(label_12)
													.addGap(18)
													.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(lblNewJgoodiesTitle)
													.addGap(18)
													.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label)
							.addGap(21)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_1))))
					.addGap(49)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(label_11)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewJgoodiesTitle)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_9)
						.addComponent(label_12)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(label_10)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewJgoodiesLabel)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e1) {
				competeTableMousePressed(e1);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\u8D5B\u4E8B\u7F16\u53F7", "\u4E3B\u961F\u7F16\u53F7", "\u5BA2\u961F\u7F16\u53F7", "\u4E3B\u961F\u5206\u6570", "\u5BA2\u961F\u5206\u6570", "\u4E3B\u961F\u6700\u9AD8\u5206", "\u5BA2\u961F\u6700\u9AD8\u5206", "\u6BD4\u8D5B\u65E5\u671F", "\u6BD4\u8D5B\u65F6\u95F4", "\u4E3B\u961F\u80DC\u7387", "\u5BA2\u961F\u80DC\u7387", "\u4E3B\u961F\u540D\u6B21", "\u5BA2\u961F\u540D\u6B21"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
		
		
	}
	
	//删除选中记录
	private void deleteCompeteActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		deleteCompeteMesg();
		
	}
	private void deleteCompeteMesg() {
		// TODO Auto-generated method stub
		String MatchTeamID=textField_1.getText();
		if(StringUtil.isEmpty(MatchTeamID)) {
			JOptionPane.showMessageDialog(null,"请选择要删除的记录！");
			return;
		}
		int n=JOptionPane.showConfirmDialog(null,"确定删除该记录吗？");
		if(n==0) {
			Connection con=null;
			try {
				con=main.getConnection();
				int flag=competeMesgDao.delete(con,MatchTeamID);
				if(flag==1) {
					JOptionPane.showMessageDialog(null,"删除成功！");
					this.resetValue();
					this.fillTable(new M_CompeteInsert());//刷新表单
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




	//表格行点击事件处理
	private void competeTableMousePressed(MouseEvent e1) {
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
		this.textField_9.setText((String)table.getValueAt(row, 8));
		this.textField_10.setText((String)table.getValueAt(row, 9));
		this.textField_11.setText((String)table.getValueAt(row, 10));
		this.textField_12.setText((String)table.getValueAt(row, 11));
		this.textField_13.setText((String)table.getValueAt(row, 12));
		
		ID=(String)table.getValueAt(row, 0);
	}




	//修改
	private void updateActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 String MatchTeamID=textField_1.getText();
		 int MTeamID=Integer.valueOf(textField_2.getText());
		 int CTeamID=Integer.valueOf(textField_3.getText());
		 int MScore=Integer.valueOf(textField_4.getText());
		 int CScore=Integer.valueOf(textField_5.getText());
		 int MMScore=Integer.valueOf(textField_6.getText());
		 int CCScore=Integer.valueOf(textField_7.getText());
		 String MDate=textField_8.getText();
		 String MTime=textField_9.getText();
		 String MWinRate=textField_10.getText();
		 String CWinRate=textField_11.getText();
		 int MRanking=Integer.valueOf(textField_12.getText());
		 int CRanking=Integer.valueOf(textField_13.getText());
		
		 if(StringUtil.isEmpty(MatchTeamID)) {
			 JOptionPane.showMessageDialog(null,"请输入要修改的赛事编码！");
			 return;
		 }
		 M_CompeteInsert m_CompeteInsert=new M_CompeteInsert(MatchTeamID, MTeamID, CTeamID, MScore, CScore, MMScore, CCScore,
					MDate, MTime, MWinRate, CWinRate, MRanking, CRanking);
		 	 Connection con=null;
		 try {
			 con=main.getConnection();
			 System.out.println(ID);
			int flag=competeMesgDao.update(con,m_CompeteInsert,ID);
			if(flag==1) {
				JOptionPane.showMessageDialog(null,"修改成功！");
				this.resetValue();
				this.fillTable(new M_CompeteInsert());//刷新表单
			}
			else {
				JOptionPane.showMessageDialog(null,"修改失败1！");
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




	//赛程编码查询
	private void competeMesgIDSeachActionPerformed(ActionEvent e1) {
		String s_MatchTeamID=this.textField.getText();
		 if(StringUtil.isEmpty(s_MatchTeamID)) {
			 JOptionPane.showMessageDialog(null,"请输入要查询的赛事编码！");
			 return;
		 }
		 
		 M_CompeteInsert m_CompeteMesg=new M_CompeteInsert();
		try {
			m_CompeteMesg.setMatchTeamID(s_MatchTeamID);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"信息查询失败！");
			 e.printStackTrace();
		}
		 DefaultTableModel dtm=(DefaultTableModel)table.getModel();//取得表格
			dtm.setRowCount(0);
			Connection con=null;
			try {
				con=main.getConnection();
				ResultSet rs=competeMesgDao.List(con,m_CompeteMesg);
				
				while(rs.next()) {
					Vector v=new Vector();
					v.add(rs.getString("赛事编号"));
					v.add(rs.getString("主队编号"));
					v.add(rs.getString("客队编号"));
					v.add(rs.getString("主队分数"));
					v.add(rs.getString("客队分数"));
					v.add(rs.getString("主队最高分"));
					v.add(rs.getString("客队最高分"));
					v.add(rs.getString("比赛日期"));
					v.add(rs.getString("比赛时间"));
					v.add(rs.getString("主队胜率"));
					v.add(rs.getString("客队胜率"));
					v.add(rs.getString("主队名次"));
					v.add(rs.getString("客队名次"));
					dtm.addRow(v);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"信息查询失败1！");
				 e.printStackTrace();
			}finally {
				try {
					main.closeCon(con);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"信息查询失败2！");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}



       
	private void allCompeteMesgActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.fillTable(new M_CompeteInsert());
	}




	//所有赛程查询
	private void fillTable(M_CompeteInsert m_CompeteInsert) {
		DefaultTableModel dtm=(DefaultTableModel)table.getModel();//取得表格
		dtm.setRowCount(0);
		Connection con=null;
		try {
			con=main.getConnection();
			ResultSet rs=competeMesgDao.ListAll(con,m_CompeteInsert);
			while(rs.next()) {
				Vector v=new Vector();
				v.add(rs.getString("赛事编号"));
				v.add(rs.getString("主队编号"));
				v.add(rs.getString("客队编号"));
				v.add(rs.getString("主队分数"));
				v.add(rs.getString("客队分数"));
				v.add(rs.getString("主队最高分"));
				v.add(rs.getString("客队最高分"));
				v.add(rs.getString("比赛日期"));
				v.add(rs.getString("比赛时间"));
				v.add(rs.getString("主队胜率"));
				v.add(rs.getString("客队胜率"));
				v.add(rs.getString("主队名次"));
				v.add(rs.getString("客队名次"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"信息查询失败1！");
			 e.printStackTrace();
		}finally {
			try {
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
		this.textField_9.setText("");
		this.textField_10.setText("");
		this.textField_11.setText("");
		this.textField_12.setText("");
		this.textField_13.setText("");
	}
	
}