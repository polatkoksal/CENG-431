package com.ebookstore.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class CustomerPanel extends JFrame {

	private JPanel contentPane;
	private CustomerLogin customerLogin;

	public CustomerPanel(String customerName,String customerSurname) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 881);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelcome.setBounds(72, 23, 86, 25);
		contentPane.add(lblWelcome);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setText(customerName);
		
		lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCustomerName.setBounds(168, 28, 317, 14);
		contentPane.add(lblCustomerName);
		
		JLabel lblYourCreditIs = new JLabel("Your Credit  Amount   :");
		lblYourCreditIs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblYourCreditIs.setBounds(40, 63, 153, 14);
		contentPane.add(lblYourCreditIs);
		
		JLabel label = new JLabel("00");
		label.setBounds(244, 64, 241, 14);
		contentPane.add(label);
		
		JList itemList = new JList();
		itemList.setBounds(0, 429, 180, 321);
		itemList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(itemList);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(0, 389, 64, 14);
		contentPane.add(lblType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Books", "Music CDs", "Computer Softwares"}));
		comboBox.setBounds(86, 387, 72, 20);
		contentPane.add(comboBox);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitle.setBounds(305, 538, 180, 14);
		contentPane.add(lblTitle);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(305, 563, 209, 25);
		contentPane.add(lblPrice);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescription.setBounds(313, 599, 72, 25);
		contentPane.add(lblDescription);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(408, 605, 106, 84);
		contentPane.add(textArea);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setBounds(431, 716, 89, 23);
		contentPane.add(btnBuy);
		
		JList purchesedItemList = new JList();
		purchesedItemList.setBounds(0, 116, 180, 245);
		contentPane.add(purchesedItemList);
		
		JLabel lblType_1 = new JLabel("Type");
		lblType_1.setBounds(345, 94, 46, 14);
		contentPane.add(lblType_1);
		
		JLabel lblTitle_1 = new JLabel("Title");
		lblTitle_1.setBounds(345, 134, 46, 14);
		contentPane.add(lblTitle_1);
		
		JLabel lblPrice_1 = new JLabel("Price");
		lblPrice_1.setBounds(345, 172, 46, 14);
		contentPane.add(lblPrice_1);
		
		JLabel lblDescription_1 = new JLabel("Description ");
		lblDescription_1.setBounds(345, 216, 119, 14);
		contentPane.add(lblDescription_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(408, 241, 77, 120);
		contentPane.add(textArea_1);
	}
}
