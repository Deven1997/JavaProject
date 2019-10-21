import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.tools.Tool;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField password;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel validation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* below 2 lines are to appear frame in the center of the screen*/
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		setUndecorated(true);// to remove the minimize, maximize and close button from action bar
		
		// close button on login page
		
		JButton btnClose = new JButton("close");
		btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClose.setFont(new Font("Verdana", Font.BOLD, 15));
		btnClose.setForeground(new Color(255, 255, 255));
		btnClose.setBackground(new Color(0, 128, 128));
		btnClose.setBounds(287, 224, 89, 23);
		contentPane.add(btnClose);
		
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();//to close the window
			}
		});
		
		/* close button code end */
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(userid.getText().equals("admin") && password.getText().equals("123"))
				{
					dispose();//close login window after successful login
					JOptionPane.showMessageDialog(null, "Login Successfull");
					admin_homepage adm = new admin_homepage();
					adm.setVisible(true);
					
				}
				else if(userid.getText().equals("user") && password.getText().equals("user"))
				{
					dispose();//close login window after successful login
					JOptionPane.showMessageDialog(null, "Login Successfull");
					user_homepage u = new user_homepage();
					u.setVisible(true);
					
				}
				else
				{
					validation.setText("* Invalid Credential");
				}
			}
		});
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 15));
		btnLogin.setBackground(new Color(0, 128, 128));
		btnLogin.setBounds(150, 224, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Verdana", Font.BOLD, 15));
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(225, 61, 76, 33);
		contentPane.add(lblLogin);
		/* to disappear validation text*/
		userid = new JTextField();
		userid.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				validation.setText(""); 
			}
		});
		userid.setBounds(150, 117, 226, 33);
		contentPane.add(userid);
		userid.setColumns(10);
		
		/* to disappear validation text*/
		password = new JPasswordField();
		password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				validation.setText("");
			}
		});
		password.setBounds(150, 161, 226, 36);
		contentPane.add(password);
		
		lblNewLabel = new JLabel("User ID");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(78, 126, 48, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(67, 171, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		validation = new JLabel("");
		validation.setForeground(new Color(255, 0, 0));
		validation.setBounds(161, 98, 162, 14);
		contentPane.add(validation);
		
		
		
		
		
		
	}
}
