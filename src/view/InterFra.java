package view;



import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Rectangle;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
 
import javax.swing.ImageIcon;
public class InterFra extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterFra frame = new InterFra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public InterFra() {
		setMaximizable(true);
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("廖煜婷   软工1班 3186016007");
		lblNewLabel.setIcon(new ImageIcon(InterFra.class.getResource("/images/person_32px_1233072_easyicon.net.png")));
		
		JLabel label = new JLabel("张艳烽   软工1班 3186016009");
		label.setIcon(new ImageIcon(InterFra.class.getResource("/images/person_32px_1233072_easyicon.net.png")));
		
		JLabel label_1 = new JLabel("张新奥淇 软工1班 3186016022");
		label_1.setIcon(new ImageIcon(InterFra.class.getResource("/images/person_32px_1233072_easyicon.net.png")));
		
		JLabel label_2 = new JLabel("张  义   软工1班 3186004047");
		label_2.setIcon(new ImageIcon(InterFra.class.getResource("/images/person_32px_1233072_easyicon.net.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(81)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(lblNewLabel)
						.addGroup(Alignment.TRAILING, gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(label_2)
							.addComponent(label_1)))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_2)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		
		
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		setIconifiable(true);
		setRootPaneCheckingEnabled(false);
		setTitle("该系统开发人员信息");
		setBounds(0, 0, 430, 230);


	}
}
