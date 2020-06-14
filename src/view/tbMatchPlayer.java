package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.PlayerDao;
import dao.TeamInsertDao;
import model.M_TbMatchPlayer;
import util.Main;
import util.StringUtil;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class tbMatchPlayer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	private Main main=new Main();
	private PlayerDao tbMatchPlayerDao=new PlayerDao();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tbMatchPlayer frame = new tbMatchPlayer();
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
	public tbMatchPlayer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(tbMatchPlayer.class.getResource("/images/Basketball_23.96694214876px_1191175_easyicon.net (1).png")));
		setTitle("比赛球员信息表");
		setVisible(true);
		setBounds(100, 100, 450, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("比赛球员编号：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel.setBounds(60, 50, 120, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("赛事编号：");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(60, 100, 120, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("总篮板：");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(60, 150, 120, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("助    攻：");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(60, 200, 120, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("得    分：");
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(60, 250, 120, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("抢    断：");
		lblNewLabel_6.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(60, 300, 120, 25);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("盖    帽：");
		lblNewLabel_7.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(60, 350, 120, 25);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("犯    规：");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(60, 400, 120, 25);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(200, 50, 200, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(200, 100, 200, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(200, 150, 200, 25);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(200, 200, 200, 25);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(200, 250, 200, 25);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(200, 300, 200, 25);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(200, 350, 200, 25);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(200, 400, 200, 25);
		contentPane.add(textField_8);
		
		JButton btnNewButton = new JButton("保  存");
		btnNewButton.setIcon(new ImageIcon(tbMatchPlayer.class.getResource("/images/password_23.969348659004px_1230191_easyicon.net.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbMatchPlayerInsertActionPerformed(e);
			}
		});
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		btnNewButton.setBounds(80, 450, 120, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("重  置");
		btnNewButton_1.setIcon(new ImageIcon(tbMatchPlayer.class.getResource("/images/power_button_29.996705107084px_1228841_easyicon.net.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		btnNewButton_1.setBounds(240, 450, 120, 31);
		contentPane.add(btnNewButton_1);
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
	}
	//保存
	protected void tbMatchPlayerInsertActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 String MatchPalyerID=this.textField.getText();
		 String MatchTeamID=this.textField_2.getText();
		 String ToltalRebounds=this.textField_3.getText();
		 String Assists=this.textField_4.getText();
		 String Score=this.textField_5.getText();
		 String Steals=this.textField_6.getText();
		 String Blocks=this.textField_7.getText();
		 String Foul=this.textField_8.getText();
		 
		 if(StringUtil.isEmpty(MatchPalyerID)) {
			 JOptionPane.showMessageDialog(null,"比赛球员编号不能为空！");
			 return;
		 }
		 if(StringUtil.isEmpty(MatchTeamID)) {
			 JOptionPane.showMessageDialog(null,"赛事编号不能为空！");
			 return;
		 }
		 if(StringUtil.isEmpty(ToltalRebounds)) {
			 JOptionPane.showMessageDialog(null,"总篮板不能为空！");
			 return;
		 }
		 if(StringUtil.isEmpty(Assists)) {
			 JOptionPane.showMessageDialog(null,"助攻次数不能为空！");
			 return;
		 }
		 if(StringUtil.isEmpty(Score)) {
			 JOptionPane.showMessageDialog(null,"得分不能为空！");
			 return;
		 }
		 if(StringUtil.isEmpty(Steals)) {
			 JOptionPane.showMessageDialog(null,"抢断次数不能为空！");
			 return;
		 }
		 if(StringUtil.isEmpty(Blocks)) {
			 JOptionPane.showMessageDialog(null,"盖帽次数不能为空！");
			 return;
		 }
		 if(StringUtil.isEmpty(Foul)) {
			 JOptionPane.showMessageDialog(null,"犯规次数不能为空！");
			 return;
		 }
		 
		  M_TbMatchPlayer m_TbMatchPlayer=new M_TbMatchPlayer(MatchPalyerID ,Integer.parseInt(MatchTeamID),Integer.parseInt(ToltalRebounds) ,Integer.parseInt(Assists) ,
				 Integer.parseInt(Score) ,Integer.parseInt(Steals) ,Integer.parseInt(Blocks)  , Integer.parseInt(Foul) );
		 
		  Connection con=null;
		  
			try {
				con=main.getConnection();
				int addNum=tbMatchPlayerDao.add(con, m_TbMatchPlayer);
				if(addNum==1) {
					JOptionPane.showMessageDialog(null,"信息添加成功！");
					 resetValue();
				}
				else {
					JOptionPane.showMessageDialog(null,"信息添加失败！");
					 
				}
			} catch (Exception evt) {
				// TODO Auto-generated catch block
				
				JOptionPane.showMessageDialog(null,"信息添加失败！");
				 evt.printStackTrace();
			}finally {
				try {
					main.closeCon(con);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		 
		 
	}

	private void resetValueActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.resetValue();
	}
	
	private void resetValue() {
		this.textField.setText("");
		this.textField_2.setText("");
		this.textField_3.setText("");
		this.textField_4.setText("");
		this.textField_5.setText("");
		this.textField_6.setText("");
		this.textField_7.setText("");
		this.textField_8.setText("");
		
	}
}
