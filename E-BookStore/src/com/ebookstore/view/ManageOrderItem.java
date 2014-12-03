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
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageOrderItem extends JFrame {

	private JPanel contentPane;
    private AdminMenuPanel admMenu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageOrderItem frame = new ManageOrderItem();
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
	public ManageOrderItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerList = new JLabel("Customer List");
		lblCustomerList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCustomerList.setBounds(10, 84, 95, 14);
		contentPane.add(lblCustomerList);
		
		JLabel lblItemList = new JLabel("Item List");
		lblItemList.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblItemList.setBounds(432, 85, 95, 14);
		contentPane.add(lblItemList);
		
		JList jCustomlist = new JList();
		jCustomlist.setBounds(21, 120, 196, 236);
		jCustomlist.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
			}
		});
		contentPane.add(jCustomlist);
		
		JList jItemList = new JList();
		jItemList.setBounds(340, 120, 204, 236);
		jItemList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		contentPane.add(jItemList);
		
		JLabel lblManageOrderItem = new JLabel("Manage Order Item");
		lblManageOrderItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblManageOrderItem.setBounds(171, 29, 182, 14);
		contentPane.add(lblManageOrderItem);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(25, 459, 114, 20);
		contentPane.add(comboBox);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admMenu = new AdminMenuPanel();
				admMenu.setVisible(true);
				setVisible(false);
				
			}
		});
		btnSave.setBounds(411, 456, 89, 23);
		contentPane.add(btnSave);
	}

}
