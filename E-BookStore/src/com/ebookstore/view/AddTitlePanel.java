package com.ebookstore.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AddTitlePanel extends JFrame {

	private JPanel contentPane;
	private JTextField textTitle;
	private JTextField textTitlePrice;
	private AdminMenuPanel admMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTitlePanel frame = new AddTitlePanel();
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
	public AddTitlePanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddTitle = new JLabel("Add Title");
		lblAddTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddTitle.setBounds(175, 39, 87, 25);
		contentPane.add(lblAddTitle);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(73, 104, 46, 14);
		contentPane.add(lblType);
		
		final JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitle.setBounds(73, 186, 46, 14);
		contentPane.add(lblTitle);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrice.setBounds(73, 246, 46, 14);
		contentPane.add(lblPrice);
		
		final JComboBox comboBoxType = new JComboBox();
		comboBoxType.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Integer i = comboBoxType.getSelectedIndex();
				if(i == 0){
					lblTitle.setText("Author");
				} if (i==1) {
					lblTitle.setText("Kind");
					
				} if (i==2){
					lblTitle.setText("Area");
				}
			}
		});
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Book", "Music CD", "Computer Software "}));
		comboBoxType.setBounds(175, 102, 87, 20);
		contentPane.add(comboBoxType);
		
		textTitle = new JTextField();
		textTitle.setBounds(176, 184, 86, 20);
		contentPane.add(textTitle);
		textTitle.setColumns(10);
		
		textTitlePrice = new JTextField();
		textTitlePrice.setBounds(176, 244, 86, 20);
		contentPane.add(textTitlePrice);
		textTitlePrice.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescription.setBounds(73, 320, 76, 14);
		contentPane.add(lblDescription);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(176, 321, 195, 146);
		contentPane.add(textArea);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admMenu = new AdminMenuPanel();
				admMenu.setVisible(true);
				setVisible(false);
			}
		});
		btnSave.setBounds(394, 476, 89, 23);
		contentPane.add(btnSave);
	}
}
