package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.TeamInsertDao;
import model.M_TeamInsert;
import dao.TeamInsertDao;
import util.Main;
import util.StringUtil;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Toolkit;

public class teamInsert extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	private Main main=new Main();
	private TeamInsertDao teamInsertDao=new TeamInsertDao();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamInsert frame = new teamInsert();
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
	public teamInsert() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(teamInsert.class.getResource("/images/Basketball_23.96694214876px_1191175_easyicon.net (1).png")));
		setTitle("球队信息导入");
		//setUndecorated(true);
        //setBackground(new Color(0,0,0,0));
        setVisible(true);
		
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 590);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("球队编号：");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		label.setBounds(70, 50, 150, 25);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("球队名称：");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		label_1.setBounds(70, 100, 150, 25);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("城  市：");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		label_2.setBounds(70, 150, 150, 25);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("总冠军次数：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		label_3.setBounds(70, 200, 150, 25);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("体育馆：");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		label_4.setBounds(70, 250, 150, 25);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("当前排名：");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		label_5.setBounds(70, 300, 150, 25);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("当前胜率：");
		label_6.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		label_6.setBounds(70, 350, 150, 25);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("现任主教练：");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		label_7.setBounds(70, 400, 150, 25);
		getContentPane().add(label_7);
		
		textField = new JTextField();
		textField.setBounds(200, 50, 170, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 100, 170, 25);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 150, 170, 25);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 200, 170, 25);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 250, 170, 25);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(200, 300, 170, 25);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(200, 350, 170, 25);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(200, 400, 170, 25);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("保存");
		btnNewButton.setIcon(new ImageIcon(teamInsert.class.getResource("/images/password_23.969348659004px_1230191_easyicon.net.png")));
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			//保存
			public void actionPerformed(ActionEvent e) {
				teamInsertActionPerformed(e);
			}
		});
		btnNewButton.setBounds(94, 469, 113, 27);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("重置");
		btnNewButton_1.setIcon(new ImageIcon(teamInsert.class.getResource("/images/power_button_29.996705107084px_1228841_easyicon.net.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 17));
		btnNewButton_1.setBounds(258, 468, 113, 27);
		getContentPane().add(btnNewButton_1);
		
		JLabel label_8 = DefaultComponentFactory.getInstance().createLabel("*必填");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("微软雅黑", Font.BOLD, 15));
		label_8.setBounds(380, 57, 108, 15);
		getContentPane().add(label_8);
		
		JLabel label_9 = DefaultComponentFactory.getInstance().createTitle("*必填");
		label_9.setFont(new Font("微软雅黑", Font.BOLD, 15));
		label_9.setForeground(Color.RED);
		label_9.setBounds(380, 207, 108, 15);
		getContentPane().add(label_9);
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
	}
	
	
	//导入
	private void teamInsertActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		 String TeamID=this.textField.getText();
		 String TeamName=this.textField_1.getText();
		 String TeamCity=this.textField_2.getText();
		 String Champions=this.textField_3.getText();
		 String GYM=this.textField_4.getText();
		 String NowRanking=this.textField_5.getText();
		 String NowWinRate=this.textField_6.getText();
		 String CurrentCoach=this.textField_7.getText();
		 
		 if(StringUtil.isEmpty(TeamID)) {
			 JOptionPane.showMessageDialog(null,"球队编号不能为空！");
			 return;
		 }
		 if(StringUtil.isEmpty(Champions)) {
			 JOptionPane.showMessageDialog(null,"总冠军次数不能为空！");
			 return;
		 }
		 M_TeamInsert m_TeamInsert=new M_TeamInsert(TeamID , TeamName, TeamCity,Integer.parseInt(Champions) , GYM,NowRanking,
					NowWinRate, CurrentCoach) ;
			 
		Connection con=null;
		try {
			con=main.getConnection();
			int addNum=teamInsertDao.add(con, m_TeamInsert);
			if(addNum==1) {
				JOptionPane.showMessageDialog(null,"信息添加成功！");
				 resetValue();
			}
			else {
				JOptionPane.showMessageDialog(null,"信息添加失败！请检查球队编号是否与已有的冲突。");
				 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			JOptionPane.showMessageDialog(null,"信息添加失败！请检查球队编号是否与已有的冲突。");
			 e.printStackTrace();
		}finally {
			try {
				main.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			 
		 
		 
	}

	
	private void resetValueActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.resetValue();
	}
	
	private void resetValue() {
		this.textField.setText("");
		this.textField_1.setText("");
		this.textField_2.setText("");
		this.textField_3.setText("");
		this.textField_4.setText("");
		this.textField_5.setText("");
		this.textField_6.setText("");
		this.textField_7.setText("");
		
	}
}
