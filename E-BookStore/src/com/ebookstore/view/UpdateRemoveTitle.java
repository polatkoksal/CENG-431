package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;

public class UpdateRemoveTitle extends JFrame {

	private static final long serialVersionUID = 9073683700231800549L;
	private JPanel contentPane;
	private JTextField textTitle;
	private JTextField textPrice;
	private JButton btnRemove;
	private JButton btnUpdate;
	private JList jlist;
	private JTextArea textArea;
	private JButton back;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

	public UpdateRemoveTitle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUpdateRemove = new JLabel("Update / Remove Title");
		lblUpdateRemove.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUpdateRemove.setBounds(175, 28, 240, 37);
		contentPane.add(lblUpdateRemove);

		JLabel lblItemList = new JLabel("Item List");
		lblItemList.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblItemList.setBounds(57, 110, 107, 23);
		contentPane.add(lblItemList);

		final JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitle.setBounds(335, 169, 62, 14);
		contentPane.add(lblTitle);

		textTitle = new JTextField();
		textTitle.setBounds(427, 167, 101, 20);
		contentPane.add(textTitle);
		textTitle.setColumns(10);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrice.setBounds(335, 226, 46, 18);
		contentPane.add(lblPrice);

		textPrice = new JTextField();
		textPrice.setBounds(427, 226, 101, 20);
		contentPane.add(textPrice);
		textPrice.setColumns(10);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDescription.setBounds(335, 312, 82, 14);
		contentPane.add(lblDescription);

		btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdate.setBounds(335, 446, 89, 23);
		contentPane.add(btnUpdate);

		btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRemove.setBounds(445, 446, 89, 23);
		contentPane.add(btnRemove);

		back = new JButton("Back");
		back.setFont(new Font("Tahoma", Font.BOLD, 13));
		back.setBounds(240, 446, 89, 23);
		contentPane.add(back);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 142, 170, 305);
		contentPane.add(scrollPane);
		
				jlist = new JList();
				scrollPane.setViewportView(jlist);
				
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(427, 323, 124, 94);
				contentPane.add(scrollPane_1);
				
						textArea = new JTextArea();
						scrollPane_1.setViewportView(textArea);
	}

	public void addActionListenerToUpdateTitleBtn(ActionListener listener) {
		btnUpdate.addActionListener(listener);
	}

	public void addActionListenerToRemoveTitleBtn(ActionListener listener) {
		btnRemove.addActionListener(listener);
	}

	public void addListSelectionListenerToUpdateItemList(
			ListSelectionListener listener) {
		jlist.addListSelectionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	public JTextField getTextTitle() {
		return textTitle;
	}

	public void setTextTitle(JTextField textTitle) {
		this.textTitle = textTitle;
	}

	public JTextField getTextPrice() {
		return textPrice;
	}

	public void setTextPrice(JTextField textPrice) {
		this.textPrice = textPrice;
	}

	public JList getJlist() {
		return jlist;
	}

	public void setJlist(JList jlist) {
		this.jlist = jlist;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

}
