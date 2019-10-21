import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class create_topic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					create_topic frame = new create_topic();
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
	public create_topic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateTopic = new JLabel("Create Topic");
		lblCreateTopic.setFont(new Font("Verdana", Font.BOLD, 15));
		lblCreateTopic.setForeground(new Color(255, 255, 255));
		lblCreateTopic.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateTopic.setBounds(141, 37, 137, 32);
		contentPane.add(lblCreateTopic);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Verdana", Font.BOLD, 11));
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(new Color(34, 139, 34));
		btnSubmit.setBounds(304, 226, 89, 23);
		contentPane.add(btnSubmit);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(10);
		textArea.setMargin(new Insets(5, 5, 5, 5));
		textArea.setDisabledTextColor(new Color(0, 100, 0));
		textArea.setCaretColor(new Color(0, 100, 0));
		textArea.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Enter Topic", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 100, 0)));
		textArea.setBounds(38, 78, 383, 123);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(220, 20, 60));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(396, 0, 54, 23);
		contentPane.add(btnNewButton);
		
		/* below 2 lines are to appear frame in the center of the screen*/
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		setUndecorated(true);// to remove the minimize, maximize and close button from action bar
	}
}
