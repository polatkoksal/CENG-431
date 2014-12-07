package com.ebookstore.view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class CustomerPanel extends JFrame {

	private static final long serialVersionUID = -7498133513057083228L;
	private JPanel contentPane;
	private JButton btnBuy;
	private JList itemList;
	private JList purchesedItemList;
	private JTextField purchasedTitle;
	private JTextField purchasedPrice;
	private JTextField itemTitle;
	private JTextField itemPrice;
	private JTextArea purchasedDesc;
	private JTextArea itemDesc;
	private JLabel lblNewLabel;
	private JTextField purchasedStatus;
	private JLabel creditLabel;
	private JButton back;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;

	public CustomerPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 748);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelcome.setBounds(230, 28, 105, 25);
		contentPane.add(lblWelcome);

		JLabel lblYourCreditIs = new JLabel("Your Credit  Amount   :");
		lblYourCreditIs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYourCreditIs.setBounds(40, 63, 153, 14);
		contentPane.add(lblYourCreditIs);

		creditLabel = new JLabel("00");
		creditLabel.setBounds(244, 64, 241, 14);
		contentPane.add(creditLabel);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 13));
		lblTitle.setBounds(371, 459, 57, 14);
		contentPane.add(lblTitle);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice.setBounds(371, 511, 76, 25);
		contentPane.add(lblPrice);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Dialog", Font.BOLD, 13));
		lblDescription.setBounds(371, 547, 94, 25);
		contentPane.add(lblDescription);

		btnBuy = new JButton("Buy");
		btnBuy.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBuy.setBounds(395, 675, 89, 23);
		contentPane.add(btnBuy);

		JLabel lblTitle_1 = new JLabel("Title");
		lblTitle_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitle_1.setBounds(345, 134, 46, 14);
		contentPane.add(lblTitle_1);

		JLabel lblPrice_1 = new JLabel("Price");
		lblPrice_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice_1.setBounds(345, 172, 46, 14);
		contentPane.add(lblPrice_1);

		JLabel lblDescription_1 = new JLabel("Description ");
		lblDescription_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescription_1.setBounds(345, 198, 102, 32);
		contentPane.add(lblDescription_1);

		purchasedTitle = new JTextField();
		purchasedTitle.setBounds(441, 132, 153, 19);
		contentPane.add(purchasedTitle);
		purchasedTitle.setColumns(10);
		purchasedTitle.setEditable(false);

		purchasedPrice = new JTextField();
		purchasedPrice.setBounds(441, 170, 153, 19);
		contentPane.add(purchasedPrice);
		purchasedPrice.setColumns(10);
		purchasedPrice.setEditable(false);

		itemTitle = new JTextField();
		itemTitle.setBounds(473, 457, 153, 19);
		contentPane.add(itemTitle);
		itemTitle.setColumns(10);
		itemTitle.setEditable(false);

		itemPrice = new JTextField();
		itemPrice.setBounds(478, 513, 148, 19);
		contentPane.add(itemPrice);
		itemPrice.setColumns(10);
		itemPrice.setEditable(false);

		lblNewLabel = new JLabel("State Item");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(345, 346, 70, 15);
		contentPane.add(lblNewLabel);

		purchasedStatus = new JTextField();
		purchasedStatus.setBounds(441, 342, 158, 19);
		contentPane.add(purchasedStatus);
		purchasedStatus.setColumns(10);
		purchasedStatus.setEditable(false);

		back = new JButton("Back");
		back.setFont(new Font("Tahoma", Font.BOLD, 11));
		back.setBounds(507, 674, 76, 25);
		contentPane.add(back);

		JLabel lblOrderList = new JLabel("Order List");
		lblOrderList.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOrderList.setBounds(88, 89, 116, 15);
		contentPane.add(lblOrderList);

		JLabel lblTitleList = new JLabel("Title List");
		lblTitleList.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitleList.setBounds(88, 403, 105, 15);
		contentPane.add(lblTitleList);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(483, 577, 143, 87);
		contentPane.add(scrollPane);
		
				itemDesc = new JTextArea();
				scrollPane.setViewportView(itemDesc);
				itemDesc.setEditable(false);
				
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(441, 218, 153, 115);
				contentPane.add(scrollPane_1);
				
						purchasedDesc = new JTextArea();
						scrollPane_1.setViewportView(purchasedDesc);
						purchasedDesc.setEditable(false);
						
						scrollPane_2 = new JScrollPane();
						scrollPane_2.setBounds(40, 134, 218, 247);
						contentPane.add(scrollPane_2);
						
								purchesedItemList = new JList();
								scrollPane_2.setViewportView(purchesedItemList);
								
								scrollPane_3 = new JScrollPane();
								scrollPane_3.setBounds(40, 429, 218, 271);
								contentPane.add(scrollPane_3);
								
										itemList = new JList();
										scrollPane_3.setViewportView(itemList);
	}

	public void addActionListenerToBuyBtn(ActionListener listener) {
		btnBuy.addActionListener(listener);
	}

	public void addListSelectionListenerToItemList(
			ListSelectionListener listener) {
		itemList.addListSelectionListener(listener);
	}

	public void addListSelectionListenerToPurchesedItemList(
			ListSelectionListener listener) {
		purchesedItemList.addListSelectionListener(listener);
	}

	public void addBackButtonListener(ActionListener listener) {
		back.addActionListener(listener);
	}

	public JList getItemList() {
		return itemList;
	}

	public void setItemList(JList itemList) {
		this.itemList = itemList;
	}

	public JList getPurchesedItemList() {
		return purchesedItemList;
	}

	public void setPurchesedItemList(JList purchesedItemList) {
		this.purchesedItemList = purchesedItemList;
	}

	public JTextField getPurchasedTitle() {
		return purchasedTitle;
	}

	public void setPurchasedTitle(JTextField purchasedTitle) {
		this.purchasedTitle = purchasedTitle;
	}

	public JTextField getPurchasedPrice() {
		return purchasedPrice;
	}

	public void setPurchasedPrice(JTextField purchasedPrice) {
		this.purchasedPrice = purchasedPrice;
	}

	public JTextField getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(JTextField itemTitle) {
		this.itemTitle = itemTitle;
	}

	public JTextField getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(JTextField itemPrice) {
		this.itemPrice = itemPrice;
	}

	public JTextArea getPurchasedDesc() {
		return purchasedDesc;
	}

	public void setPurchasedDesc(JTextArea purchasedDesc) {
		this.purchasedDesc = purchasedDesc;
	}

	public JTextArea getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(JTextArea itemDesc) {
		this.itemDesc = itemDesc;
	}

	public JTextField getPurchasedStatus() {
		return purchasedStatus;
	}

	public void setPurchasedStatus(JTextField purchasedStatus) {
		this.purchasedStatus = purchasedStatus;
	}

	public JLabel getCreditLabel() {
		return creditLabel;
	}

	public void setCreditLabel(JLabel creditLabel) {
		this.creditLabel = creditLabel;
	}
}
