package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class MainFra extends JFrame {
    private JDesktopPane table_1=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFra frame = new MainFra();
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
	public MainFra() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFra.class.getResource("/images/person_32px_1233072_easyicon.net.png")));
		setTitle("篮球联赛系统主界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("基本数据维护");
		menuBar.add(menu);
		
		JMenu menu_4 = new JMenu("数据导入");
		menu.add(menu_4);
		
		JMenuItem menuItem_11 = new JMenuItem("球队信息导入");
		menu_4.add(menuItem_11);
		menuItem_11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new teamInsert();
			}
		});
		
		JMenuItem menuItem_12 = new JMenuItem("球员信息导入");
		menu_4.add(menuItem_12);
		menuItem_12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new basketballmanInsert();
			}
		});
		JMenu menu_2 = new JMenu("信息管理");
		menu.add(menu_2);
		
		
		
		JMenuItem menuItem = new JMenuItem("赛程录入");
		menu_2.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new competeInsert();
			}
		});
		JMenuItem menuItem_1 = new JMenuItem("赛程管理");
		menu_2.add(menuItem_1);
		menuItem_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new CompeteQandD();
			}
		});
		JMenuItem menuItem_6 = new JMenuItem("赛程球员信息录入");
		menu_2.add(menuItem_6);
		menuItem_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new tbMatchPlayer();
			}
		});
		JMenuItem menuItem_7 = new JMenuItem("赛程球员信息管理");
		menu_2.add(menuItem_7);
		menuItem_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new PlayerQandD();
			}
		});
		JMenuItem menuItem_2 = new JMenuItem("球员信息管理");
		
		menuItem_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new basketballmanQandD();
			}
		});
		menu_2.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("球队信息管理");
		menu_2.add(menuItem_3);
		menuItem_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//new competeInsert();
				new teamQandD();
			}
		});
		JMenuItem menuItem_4 = new JMenuItem("安全退出");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统");
				//System.out.println(result);
				if(result==0) {
					dispose();
				}
			}
		});
		menu.add(menuItem_4);
		
		JMenu menu_1 = new JMenu("关于我们");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_5 = new JMenuItem("该系统开发人员信息");
		menuItem_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				InterFra interFra=new InterFra();
				interFra.setVisible(true);
				table_1.add(interFra);
			}
		});
		menu_1.add(menuItem_5);
		
		//设置最大化
	   // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);//设置Loging（小窗体）居中显示
	    table_1 = new JDesktopPane();
	    table_1.setBackground(Color.WHITE);
	    getContentPane().add(table_1, BorderLayout.CENTER);
}
	}
   
