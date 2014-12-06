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

	public CustomerPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 881);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelcome.setBounds(72, 23, 86, 25);
		contentPane.add(lblWelcome);

		JLabel lblYourCreditIs = new JLabel("Your Credit  Amount   :");
		lblYourCreditIs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblYourCreditIs.setBounds(40, 63, 153, 14);
		contentPane.add(lblYourCreditIs);

		creditLabel = new JLabel("00");
		creditLabel.setBounds(244, 64, 241, 14);
		contentPane.add(creditLabel);

		itemList = new JList();
		itemList.setBounds(52, 430, 180, 321);
		contentPane.add(itemList);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 13));
		lblTitle.setBounds(345, 535, 57, 14);
		contentPane.add(lblTitle);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(345, 561, 70, 25);
		contentPane.add(lblPrice);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Dialog", Font.BOLD, 13));
		lblDescription.setBounds(345, 583, 102, 32);
		contentPane.add(lblDescription);

		btnBuy = new JButton("Buy");
		btnBuy.setBounds(389, 716, 89, 23);
		contentPane.add(btnBuy);

		purchesedItemList = new JList();
		purchesedItemList.setBounds(41, 116, 180, 245);
		contentPane.add(purchesedItemList);

		JLabel lblTitle_1 = new JLabel("Title");
		lblTitle_1.setBounds(345, 134, 46, 14);
		contentPane.add(lblTitle_1);

		JLabel lblPrice_1 = new JLabel("Price");
		lblPrice_1.setBounds(345, 172, 46, 14);
		contentPane.add(lblPrice_1);

		JLabel lblDescription_1 = new JLabel("Description ");
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

		purchasedDesc = new JTextArea();
		purchasedDesc.setBounds(446, 207, 153, 115);
		contentPane.add(purchasedDesc);
		purchasedDesc.setEditable(false);

		itemTitle = new JTextField();
		itemTitle.setBounds(441, 533, 153, 19);
		contentPane.add(itemTitle);
		itemTitle.setColumns(10);
		itemTitle.setEditable(false);

		itemPrice = new JTextField();
		itemPrice.setBounds(446, 561, 148, 19);
		contentPane.add(itemPrice);
		itemPrice.setColumns(10);
		itemPrice.setEditable(false);

		itemDesc = new JTextArea();
		itemDesc.setBounds(456, 598, 143, 87);
		contentPane.add(itemDesc);
		itemDesc.setEditable(false);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(345, 346, 70, 15);
		contentPane.add(lblNewLabel);

		purchasedStatus = new JTextField();
		purchasedStatus.setBounds(441, 342, 158, 19);
		contentPane.add(purchasedStatus);
		purchasedStatus.setColumns(10);
		purchasedStatus.setEditable(false);

		back = new JButton("Back");
		back.setBounds(511, 715, 76, 25);
		contentPane.add(back);

		JLabel lblOrderList = new JLabel("Order List");
		lblOrderList.setBounds(88, 89, 116, 15);
		contentPane.add(lblOrderList);

		JLabel lblTitleList = new JLabel("Title List");
		lblTitleList.setBounds(88, 403, 105, 15);
		contentPane.add(lblTitleList);
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
