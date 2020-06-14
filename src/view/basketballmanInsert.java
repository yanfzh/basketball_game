package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.BasketManDao;
import model.M_BasketMan;
import util.Main;
import util.StringUtil;
import javax.swing.ImageIcon;

public class basketballmanInsert extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	private Main main=new Main();
	private BasketManDao basketManDao=new BasketManDao();
	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					basketballmanInsert frame = new basketballmanInsert();
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
	public basketballmanInsert() {
		setTitle("球员信息导入");
		setVisible(true);
		setBounds(100, 100, 480, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("球员编号：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel.setBounds(70, 50, 120, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("球队编号：");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(70, 100, 120, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("球员名称：");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(70, 150, 120, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("生  日：");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(70, 200, 120, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("出生地：");
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(70, 250, 120, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("身  高：");
		lblNewLabel_6.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(70, 300, 120, 25);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("体  重：");
		lblNewLabel_7.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(70, 350, 120, 25);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("位  置：");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(70, 400, 120, 25);
		contentPane.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBounds(200, 50, 170, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 100, 170, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 150, 170, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 200, 170, 25);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(200, 250, 170, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(200, 300, 170, 25);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(200, 350, 170, 25);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(200, 400, 170, 25);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		btnNewButton = new JButton("保存");
		btnNewButton.setIcon(new ImageIcon(basketballmanInsert.class.getResource("/images/password_23.969348659004px_1230191_easyicon.net.png")));
		btnNewButton.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			//信息保存
			     public void actionPerformed(ActionEvent e) {
			    	 basketballmanInsertActionPerformed(e);
			     }
		});
		btnNewButton.setBounds(70, 470, 120, 30);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("重置");
		btnNewButton_1.setIcon(new ImageIcon(basketballmanInsert.class.getResource("/images/power_button_29.996705107084px_1228841_easyicon.net.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		btnNewButton_1.setBounds(250, 470, 120, 30);
		contentPane.add(btnNewButton_1);
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
	}
    //添加保存
	protected void basketballmanInsertActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 String PlayerID=this.textField.getText();//异常可以抛出，万一有非数字情况出现
		 String TeamID= this.textField_1.getText();//异常可以抛出，万一有非数字情况出现
		 String PlayerName=this.textField_2.getText();
		 String Birthday=this.textField_4.getText();
		 String Birthplace=this.textField_5.getText();
		 String Height=this.textField_6.getText();
		 String Weight=this.textField_7.getText();
		 String PlayerPosition=this.textField_8.getText();
		 
		 if(StringUtil.isEmpty(String.valueOf(PlayerID))){
				 JOptionPane.showMessageDialog(null, "球员编号不能为空！");
				 return;
			 }
			if(StringUtil.isEmpty(String.valueOf(TeamID))){
				 JOptionPane.showMessageDialog(null, "球队编号不能为空！");
				 return;
			 }
			
		 M_BasketMan m_BasketMan=new M_BasketMan(PlayerID,Integer.parseInt(TeamID),PlayerName,Birthday,
				 Birthplace, Height,Weight, PlayerPosition);
		 
		 Connection con=null;
		 try {
			con=main.getConnection();//注意实例化
			 int n= basketManDao.add(con, m_BasketMan);
			if(n==1) {
				JOptionPane.showMessageDialog(null, "信息导入成功！");
				resetValue();
			}else {
				JOptionPane.showMessageDialog(null, "信息导入失败1！");
			}
		 }catch(Exception evt){
			 	evt.printStackTrace();
			 	JOptionPane.showMessageDialog(null, "信息导入失败2！");
			 	
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
		this.textField_1.setText("");
		this.textField_2.setText("");
		this.textField_4.setText("");
		this.textField_5.setText("");
		this.textField_6.setText("");
		this.textField_7.setText("");
		this.textField_8.setText("");
	}

}
