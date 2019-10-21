import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;

public class admin_homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_homepage frame = new admin_homepage();
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
	public admin_homepage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBackground(new Color(175, 238, 238));
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
		
		
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH); //to make jFrame full screen 
		setSize(1300, 700);
		ImageIcon img = new ImageIcon("C:\\Users\\ABC\\Desktop\\SEM 3\\JAVA project\\Myproject\\images\\admin_bg.jpg");
		getContentPane().setLayout(null);
		JLabel background = new JLabel("",img,JLabel.CENTER);
		background.setBounds(0, 0, 1500, 700);
		getContentPane().add(background);
		/* below 2 lines are to appear frame in the center of the screen*/
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(148, 0, 211));
		setJMenuBar(menuBar);
		
		JMenu mnCreate = new JMenu("Create");
		mnCreate.setFont(new Font("Verdana", Font.BOLD, 12));
		mnCreate.setForeground(new Color(255, 255, 255));
		mnCreate.setBackground(new Color(238, 130, 238));
		menuBar.add(mnCreate);
		
		JMenuItem mntmCreateTopicTo = new JMenuItem("Create topic to be discussed");
		mntmCreateTopicTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				create_topic c =new create_topic();
				c.setVisible(true);
			}
		});
		mnCreate.add(mntmCreateTopicTo);
		
		JMenu mnLogout = new JMenu("Logout");
		mnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int answer = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure?", "LOGOUT", 1);
				if (answer == JOptionPane.YES_OPTION) {
					dispose();
					login l = new login();
					l.setVisible(true);
				}
				
			}
		});
		mnLogout.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		mnLogout.setFont(new Font("Verdana", Font.BOLD, 12));
		mnLogout.setHorizontalAlignment(SwingConstants.RIGHT);
		mnLogout.setForeground(new Color(240, 248, 255));
		menuBar.add(mnLogout);
	}
}
