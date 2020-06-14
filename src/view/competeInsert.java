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

import dao.CompeteMesgDao;
import model.M_CompeteInsert;
import util.Main;
import util.StringUtil;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class competeInsert extends JFrame {

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
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JButton button;
	private JButton button_1;

	private Main main=new Main();
	private CompeteMesgDao competeMesgDao=new CompeteMesgDao();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					competeInsert frame = new competeInsert();
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
	public competeInsert() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(competeInsert.class.getResource("/images/Basketball_23.96694214876px_1191175_easyicon.net (1).png")));
		setTitle("赛程录入");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 690);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("赛事编码：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel.setBounds(70, 40, 120, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("主队编码：");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(70, 80, 120, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("客队编码：");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(70,120, 120, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("主队分数：");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(70, 160, 120, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("客队分数：");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(70, 200, 120, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("主队最高分：");
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(70, 240, 120, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("客队最高分：");
		lblNewLabel_6.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_6.setBounds(70, 280, 120, 25);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("比赛日期：");
		lblNewLabel_7.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_7.setBounds(70, 320, 120, 25);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("比赛时间：");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(70, 360, 120, 25);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("主队胜率：");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(70, 400, 120, 25);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("客队胜率：");
		lblNewLabel_10.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_10.setBounds(70, 440, 120, 25);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("主队名次：");
		lblNewLabel_11.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(70, 480, 120, 25);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("客队名次：");
		lblNewLabel_12.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		lblNewLabel_12.setBounds(70, 520, 120, 25);
		contentPane.add(lblNewLabel_12);
		
		textField = new JTextField();
		textField.setBounds(167, 42, 230, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 82, 230, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(167, 122, 230, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(167, 162, 230, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(167, 202, 230, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(167, 242, 230, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(167, 282, 230, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(167, 322, 230, 24);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(167, 362, 230, 24);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(167, 402, 230, 24);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(167, 442, 230, 24);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(167, 482, 230, 24);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(167, 522, 230, 24);
		contentPane.add(textField_12);
		
		button = new JButton("保存");
		button.setIcon(new ImageIcon(competeInsert.class.getResource("/images/password_23.969348659004px_1230191_easyicon.net.png")));
		button.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				competeInsertActionPerformed(e);
			}
		});
		button.setBounds(83, 584, 113, 33);
		contentPane.add(button);
		
		button_1 = new JButton("重置");
		button_1.setIcon(new ImageIcon(competeInsert.class.getResource("/images/power_button_29.996705107084px_1228841_easyicon.net.png")));
		button_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetValueActionPerformed(e);
			}
		});
		button_1.setBounds(284, 584, 113, 33);
		contentPane.add(button_1);
		
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
		
	}
   
	//导入保存
	protected void competeInsertActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String MatchTeamID=this.textField.getText();
		String MTeamID=this.textField_1.getText();
		String CTeamID=this.textField_2.getText();
		String MScore=this.textField_3.getText();
		String CScore=this.textField_4.getText();
		String MMScore=this.textField_5.getText();
		String CCScore=this.textField_6.getText();
		String MDate=this.textField_7.getText();
		String MTime=this.textField_8.getText();
		String MWinRate=this.textField_9.getText();
		String CWinRate=this.textField_10.getText();
		String MRanking=this.textField_11.getText();
	    String CRanking=this.textField_12.getText();
	    //括号内参数记得改
	    if(StringUtil.isEmpty(MatchTeamID)) {
			 JOptionPane.showMessageDialog(null,"赛事编码不能为空！");
			 return;
		 }
	    if(StringUtil.isEmpty(MTeamID)) {
	    	JOptionPane.showMessageDialog(null,"主队编码不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(CTeamID)) {
	    	JOptionPane.showMessageDialog(null,"客队编码不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(MScore)) {
	    	JOptionPane.showMessageDialog(null,"主队分数不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(CScore)) {
	    	JOptionPane.showMessageDialog(null,"客队分数不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(MMScore)) {
	    	JOptionPane.showMessageDialog(null,"主队最高分不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(CCScore)) {
	    	JOptionPane.showMessageDialog(null,"客队最高分不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(MDate)) {
	    	JOptionPane.showMessageDialog(null,"比赛日期不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(MTime)) {
	    	JOptionPane.showMessageDialog(null,"比赛时间不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(MWinRate)) {
	    	JOptionPane.showMessageDialog(null,"主队胜率不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(CWinRate)) {
	    	JOptionPane.showMessageDialog(null,"客队胜率不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(MRanking)) {
	    	JOptionPane.showMessageDialog(null,"主队名次不能为空！");
	    	return;
	    }
	    if(StringUtil.isEmpty(CRanking)) {
	    	JOptionPane.showMessageDialog(null,"客队名次不能为空！");
	    	return;
	    }
	    M_CompeteInsert m_CompeteInsert=new M_CompeteInsert(MatchTeamID, Integer.parseInt(MTeamID) , Integer.parseInt(CTeamID) , Integer.parseInt(MScore) , Integer.parseInt(CScore) , Integer.parseInt(MMScore) , Integer.parseInt(CCScore) ,
				 MDate,  MTime,  MWinRate, CWinRate, Integer.parseInt(MRanking) , Integer.parseInt(CRanking) );
	    
	    Connection con=null;
		try {
			con=main.getConnection();
			int addNum=competeMesgDao.add(con, m_CompeteInsert);
			if(addNum==1) {
				JOptionPane.showMessageDialog(null,"信息添加成功！");
				 //resetValue();
			}
			else {
				JOptionPane.showMessageDialog(null,"信息添加失败！");
				 
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			//另报错原因：主队编码与客队编码必须与之前添加的一致，因为有表间关联
			JOptionPane.showMessageDialog(null,"信息添加失败,请检查赛事编码是否与已有的重复！");
			 e1.printStackTrace();
		}finally {
			try {
				main.closeCon(con);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
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
		this.textField_8.setText("");
		this.textField_9.setText("");
		this.textField_10.setText("");
		this.textField_11.setText("");
		this.textField_12.setText("");
		
		
	}
}
