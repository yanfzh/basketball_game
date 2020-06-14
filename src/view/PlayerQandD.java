package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import dao.CompeteMesgDao;
import dao.PlayerDao;
import dao.UserDao;
import model.M_CompeteInsert;
import model.M_TbMatchPlayer;
import util.Main;
import util.StringUtil;

import javax.swing.JScrollPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class PlayerQandD extends JFrame {

	private JPanel contentPane;
	private JTable M_TbMatchPlayerTable;
	private JTextField textField;
	private Main dbUtil=new Main();
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	
    private PlayerDao playerDao=new PlayerDao();
    private Main main=new Main();
    String ID;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerQandD frame = new PlayerQandD();
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
	public PlayerQandD() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PlayerQandD.class.getResource("/images/Basketball_23.96694214876px_1191175_easyicon.net (1).png")));
		setTitle("赛程管理");
		setVisible(true);
		setBounds(100, 100, 650, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("赛程人员：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		btnNewButton = new JButton("所有赛程人员查询");
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//查询---
				allPlayerMesgActionPerformed(e);
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("比赛球员编号：");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("查询");
		btnNewButton_1.setFont(new Font("SimSun", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerIDSearchActionPerformed(e);
			}
		});
		
		btnNewButton_2 = new JButton("修改");
		btnNewButton_2.setFont(new Font("SimSun", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateMatchPlayerActionPerfored(e);
			}
		});
		
		btnNewButton_3 = new JButton("删除");
		btnNewButton_3.setFont(new Font("SimSun", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteMatchPlayerActionPerfored(e);
			}
		});
		
		JLabel label = DefaultComponentFactory.getInstance().createLabel("比赛球员编号");
		
		JLabel label_1 = DefaultComponentFactory.getInstance().createLabel("赛事编号");
		
		JLabel label_2 = DefaultComponentFactory.getInstance().createLabel("总篮板");
		
		JLabel label_3 = DefaultComponentFactory.getInstance().createLabel("助攻");
		
		JLabel label_4 = DefaultComponentFactory.getInstance().createLabel("得分");
		
		JLabel label_5 = DefaultComponentFactory.getInstance().createTitle("抢断");
		
		JLabel label_6 = DefaultComponentFactory.getInstance().createTitle("盖帽");
		
		JLabel label_7 = DefaultComponentFactory.getInstance().createTitle("犯规");
		
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
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(btnNewButton_1))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnNewButton_2)
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(label)
												.addComponent(btnNewButton_3)
												.addComponent(label_1)
												.addComponent(label_2)
												.addComponent(label_3)))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton)))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(81)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_7)
									.addGap(18)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_6)
									.addGap(18)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_5)
									.addGap(18)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_4)
									.addGap(18)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(15)
							.addComponent(btnNewButton)
							.addGap(46)
							.addComponent(lblNewLabel_1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(16)
									.addComponent(btnNewButton_1)))
							.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_3))
							.addGap(15)))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(label))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_6)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_2)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_7))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addGap(47))
		);
		
		M_TbMatchPlayerTable = new JTable();
		M_TbMatchPlayerTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				playerTableMousePressed(e);
				
			}
		});
		M_TbMatchPlayerTable.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		M_TbMatchPlayerTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u6BD4\u8D5B\u7403\u5458\u7F16\u53F7", "\u8D5B\u4E8B\u7F16\u53F7", "\u603B\u7BEE\u677F", "\u52A9\u653B", "\u5F97\u5206", "\u62A2\u65AD", "\u76D6\u5E3D", "\u72AF\u89C4"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		M_TbMatchPlayerTable.getColumnModel().getColumn(0).setPreferredWidth(105);
		scrollPane.setViewportView(M_TbMatchPlayerTable);
		contentPane.setLayout(gl_contentPane);
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
		
	}
	
	//获取表格行数据
		private void playerTableMousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
					int row=this.M_TbMatchPlayerTable.getSelectedRow();
					this.textField_1.setText((String)M_TbMatchPlayerTable.getValueAt(row, 0));
					this.textField_2.setText((String)M_TbMatchPlayerTable.getValueAt(row, 1));
					this.textField_3.setText((String)M_TbMatchPlayerTable.getValueAt(row, 2));
					this.textField_4.setText((String)M_TbMatchPlayerTable.getValueAt(row, 3));
					this.textField_5.setText((String)M_TbMatchPlayerTable.getValueAt(row, 4));
					this.textField_6.setText((String)M_TbMatchPlayerTable.getValueAt(row, 5));
					this.textField_7.setText((String)M_TbMatchPlayerTable.getValueAt(row, 6));
					this.textField_8.setText((String)M_TbMatchPlayerTable.getValueAt(row, 7));

					ID=(String)M_TbMatchPlayerTable.getValueAt(row, 0);
		}
		
	//删除记录
	private void deleteMatchPlayerActionPerfored(ActionEvent e) {
		// TODO Auto-generated method stub
		String MatchPlayerTeamID=textField_1.getText();
		if(StringUtil.isEmpty(MatchPlayerTeamID)) {
			JOptionPane.showMessageDialog(null,"请选择要删除的记录！");
			return;
		}
		int n=JOptionPane.showConfirmDialog(null,"确定删除该记录吗？");
		if(n==0) {
			Connection con=null;
			try {
				con=main.getConnection();
				int flag=playerDao.delete(con,MatchPlayerTeamID);
				if(flag==1) {
					JOptionPane.showMessageDialog(null,"删除成功！");
					this.resetValue();
					this.fillTable(new M_TbMatchPlayer());//刷新表单
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

	//修改记录
	protected void updateMatchPlayerActionPerfored(ActionEvent e) {
		// TODO Auto-generated method stub
		String MatchPlayerID=textField_1.getText();
		 int MatchTeamID=Integer.valueOf(textField_2.getText());
		 int ToltalRebounds=Integer.valueOf(textField_3.getText());
		 int Assists=Integer.valueOf(textField_4.getText());
		 int Score=Integer.valueOf(textField_5.getText());
		 int Steals=Integer.valueOf(textField_6.getText());
		 int Blocks=Integer.valueOf(textField_7.getText());
		 int Foul=Integer.valueOf(textField_8.getText());
		
		 if(StringUtil.isEmpty(String.valueOf(MatchPlayerID))) {
			 JOptionPane.showMessageDialog(null,"请输入要修改的比赛球员编码！");
			 return;
		 }
		  M_TbMatchPlayer m_TbMatchPlayer=new M_TbMatchPlayer(MatchPlayerID, MatchTeamID, ToltalRebounds, Assists, Score, Steals,
					Blocks, Foul);
		 	 Connection con=null;
		 try {
			 con=main.getConnection();
			 //System.out.println(ID);
			int flag=playerDao.update(con,m_TbMatchPlayer,ID);
			if(flag==1) {
				JOptionPane.showMessageDialog(null,"修改成功！");
				this.resetValue();
				this.fillTable(new M_TbMatchPlayer());//刷新表单
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

	

	//比赛人员编号查询
	protected void playerIDSearchActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s_MatchPlayerID=this.textField.getText();
		 if(StringUtil.isEmpty(s_MatchPlayerID)) {
			 JOptionPane.showMessageDialog(null,"请输入要查询的比赛人员编号！");
			 return;
		 }
		 
		 M_TbMatchPlayer m_TbMatchPlayer=new M_TbMatchPlayer();
		try {
			m_TbMatchPlayer.setMatchPalyerID(s_MatchPlayerID);
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null,"信息查询失败！");
			 e1.printStackTrace();
		}
		 DefaultTableModel dtm=(DefaultTableModel)M_TbMatchPlayerTable.getModel();//取得表格
			dtm.setRowCount(0);
			Connection con=null;
			try {
				con=main.getConnection();
				ResultSet rs=playerDao.List(con,m_TbMatchPlayer);
				
				while(rs.next()) {
					Vector v=new Vector();
					v.add(rs.getString("比赛球员编号"));
					v.add(rs.getString("赛事编号"));
					v.add(rs.getString("总篮板"));
					v.add(rs.getString("助攻"));
					v.add(rs.getString("得分"));
					v.add(rs.getString("抢断"));
					v.add(rs.getString("盖帽"));
					v.add(rs.getString("犯规"));
					
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

	protected void allPlayerMesgActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.fillTable(new M_TbMatchPlayer());
	}

	/**
	 * 初始化表格
	 * @param M_TbMatchPlayer
	 */
	private void fillTable(M_TbMatchPlayer M_TbMatchPlayer) {
		DefaultTableModel dtm=(DefaultTableModel) M_TbMatchPlayerTable.getModel();
		dtm.setRowCount(0);//表格清空
		Connection con=null;
		try {
			con=dbUtil.getConnection();
			//ResultSet rs=competeMesgDao.ListAll(con,m_CompeteInsert);
			ResultSet rs = PlayerDao.ListA(con,M_TbMatchPlayer);
			while (rs.next()) {
				Vector v=new Vector();
				v.add(rs.getString("比赛球员编号"));
				v.add(rs.getString("赛事编号"));
				v.add(rs.getString("总篮板"));
				v.add(rs.getString("助攻"));
				v.add(rs.getString("得分"));
				v.add(rs.getString("抢断"));
				v.add(rs.getString("盖帽"));
				v.add(rs.getString("犯规"));
				dtm.addRow(v);
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"信息查询失败1！");
			e.printStackTrace();
		}finally {
			try {
				//main.closeCon(con);
				dbUtil.closeCon(con);
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
