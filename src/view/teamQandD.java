package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import dao.PlayerDao;
import dao.TeamInsertDao;
import model.M_TbMatchPlayer;
import model.M_TeamInsert;
import util.Main;
import util.StringUtil;

import java.awt.Button;
import javax.swing.JButton;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;

public class teamQandD extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;
	
	private TeamInsertDao teamInsertDao=new TeamInsertDao();
    private Main main=new Main();
    String ID;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamQandD frame = new teamQandD();
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
	public teamQandD() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100,  865, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = DefaultComponentFactory.getInstance().createTitle("球队查询");
		label.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		label.setBackground(Color.WHITE);
		
		JButton button = new JButton("所有球队查询");
		button.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allTeamSearchActionPerformed();
			}
		});
		
		JLabel label_1 = DefaultComponentFactory.getInstance().createTitle("球队编号：");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton button_1 = new JButton("查询");
		button_1.setFont(new Font("SimSun", Font.BOLD, 12));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamIDSearch();
			}
		});
		
		JButton button_2 = new JButton("修改");
		button_2.setFont(new Font("SimSun", Font.BOLD, 12));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateActionPerformed(e);
			}
		});
		
		JButton button_3 = new JButton("删除");
		button_3.setFont(new Font("SimSun", Font.BOLD, 12));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteActionPerformed(e);
			}
		});
		
		JLabel label_2 = DefaultComponentFactory.getInstance().createTitle("球队编码：");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label_3 = DefaultComponentFactory.getInstance().createTitle("球队名称：");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel label_4 = DefaultComponentFactory.getInstance().createTitle("城市：");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel label_5 = DefaultComponentFactory.getInstance().createTitle("总冠军次数：");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel label_6 = DefaultComponentFactory.getInstance().createTitle("体育馆：");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel label_7 = DefaultComponentFactory.getInstance().createTitle("当前排名：");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel label_8 = DefaultComponentFactory.getInstance().createTitle("当前胜率：");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel label_9 = DefaultComponentFactory.getInstance().createTitle("现任主教练：");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(41)
							.addComponent(label))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(button)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(button_2)
										.addGap(18)
										.addComponent(button_3))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_1))))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(10, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label_8)
							.addGap(18)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label_9)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(label_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addComponent(label_6))
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(60)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7)
						.addComponent(label_4))
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(230))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(label)
							.addGap(18)
							.addComponent(button)
							.addGap(54)
							.addComponent(label_1)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1))
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_2)
								.addComponent(button_3)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(label_2)
								.addGap(6)))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_9)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(49))
		);
		
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
				"\u7403\u961F\u7F16\u7801", "\u7403\u961F\u540D\u79F0", "\u57CE\u5E02", "\u603B\u51A0\u519B\u6B21\u6570", "\u4F53\u80B2\u9986", "\u5F53\u524D\u6392\u540D", "\u5F53\u524D\u80DC\u7387", "\u73B0\u4EFB\u4E3B\u6559\u7EC3"
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
		contentPane.setLayout(gl_contentPane);
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	//表格行获取
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

	//删除
	protected void deleteActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String TeamID=textField_1.getText();
		if(StringUtil.isEmpty(TeamID)) {
			JOptionPane.showMessageDialog(null,"请选择要删除的记录！");
			return;
		}
		int n=JOptionPane.showConfirmDialog(null,"确定删除该记录吗？");
		if(n==0) {
			Connection con=null;
			try {
				con=main.getConnection();
				int flag=teamInsertDao.delete(con,TeamID);
				if(flag==1) {
					JOptionPane.showMessageDialog(null,"删除成功！");
					this.resetValue();
					this.fillTable(new M_TeamInsert());//刷新表单
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

	//修改
	protected void updateActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 String TeamID=textField_1.getText();
		 String TeamName=textField_2.getText();
		 String TeamCity=textField_3.getText();
		 int Champions=Integer.valueOf(textField_4.getText());
		 String GYM=textField_5.getText();
		 String NowRanking=textField_6.getText();
		 String NowWinRate=textField_7.getText();
		 String CurrentCoach=textField_8.getText();
		
		 if(StringUtil.isEmpty(String.valueOf(TeamID))) {
			 JOptionPane.showMessageDialog(null,"请输入要修改的球队编号！");
			 return;
		 }
		 M_TeamInsert m_TeamInsert=new M_TeamInsert(TeamID, TeamName, TeamCity, Champions, GYM, NowRanking,
					NowWinRate, CurrentCoach);
		 	 Connection con=null;
		 try {
			 con=main.getConnection();
			 //System.out.println(ID);
			int flag=teamInsertDao.update(con,m_TeamInsert,ID);
			if(flag==1) {
				JOptionPane.showMessageDialog(null,"修改成功！");
				this.resetValue();
				this.fillTable(new M_TeamInsert());//刷新表单
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

	//球队编号查询
	protected void teamIDSearch() {
		// TODO Auto-generated method stub
		String TeamID=this.textField.getText();
		 if(StringUtil.isEmpty(TeamID)) {
			 JOptionPane.showMessageDialog(null,"请输入要查询的球队编号！");
			 return;
		 }
		 
		 M_TeamInsert m_TeamInsert=new M_TeamInsert();
		try {
			m_TeamInsert.setTeamID(TeamID);
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null,"信息查询失败！");
			 e1.printStackTrace();
		}
		 DefaultTableModel dtm=(DefaultTableModel)table.getModel();//取得表格
			dtm.setRowCount(0);
			Connection con=null;
			try {
				con=main.getConnection();
				ResultSet rs=TeamInsertDao.List(con,m_TeamInsert);///////
				
				while(rs.next()) {
					Vector v=new Vector();
					v.add(rs.getString("球队编号"));
					v.add(rs.getString("球队名称"));
					v.add(rs.getString("城市"));
					v.add(rs.getString("总冠军次数"));
					v.add(rs.getString("体育馆"));
					v.add(rs.getString("当前排名"));
					v.add(rs.getString("当前胜率"));
					v.add(rs.getString("现任主教练"));
					
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

	//所有球队查询
	protected void allTeamSearchActionPerformed() {
		// TODO Auto-generated method stub
		this.fillTable(new M_TeamInsert());
	}
	
	private void fillTable(M_TeamInsert M_TeamInsert) {
	DefaultTableModel dtm=(DefaultTableModel) table.getModel();
	dtm.setRowCount(0);//表格清空
	Connection con=null;
	try {
		con=main.getConnection();
		ResultSet rs = TeamInsertDao.ListA(con,M_TeamInsert);
		while (rs.next()) {
			Vector v=new Vector();
			v.add(rs.getString("球队编号"));
			v.add(rs.getString("球队名称"));
			v.add(rs.getString("城市"));
			v.add(rs.getString("总冠军次数"));
			v.add(rs.getString("体育馆"));
			v.add(rs.getString("当前排名"));
			v.add(rs.getString("当前胜率"));
			v.add(rs.getString("现任主教练"));
			dtm.addRow(v);
		}
	}catch(Exception e) {
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
		
	}
	
	
}
