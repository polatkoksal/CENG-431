package com.ebookstore.app;

import com.ebookstore.controller.Controller;
import com.ebookstore.view.AddCustomerPanel;
import com.ebookstore.view.AddTitlePanel;
import com.ebookstore.view.AdminLogin;
import com.ebookstore.view.AdminMenuPanel;
import com.ebookstore.view.CustomerLogin;
import com.ebookstore.view.CustomerPanel;
import com.ebookstore.view.LoginPage;
import com.ebookstore.view.ManageOrderItem;
import com.ebookstore.view.UpdateRemoveCustomer;
import com.ebookstore.view.UpdateRemoveTitle;

public class EBookStore {

	public static void main(String[] args) {
		LoginPage loginPage = new LoginPage();
		AdminLogin adminLogin = new AdminLogin();
		CustomerLogin customerLogin = new CustomerLogin();
		AdminMenuPanel adminMenuPanel = new AdminMenuPanel();
		AddCustomerPanel addCustomerPanel = new AddCustomerPanel();
		UpdateRemoveCustomer updateRemoveCustomer = new UpdateRemoveCustomer();
		ManageOrderItem manageOrderItem = new ManageOrderItem();
		AddTitlePanel addTitlePanel = new AddTitlePanel();
		UpdateRemoveTitle updateRemoveTitle = new UpdateRemoveTitle();
		CustomerPanel customerPanel = new CustomerPanel();

		Controller controller = new Controller(loginPage, adminLogin,
				customerLogin, adminMenuPanel, addCustomerPanel,
				updateRemoveCustomer, manageOrderItem, addTitlePanel,
				updateRemoveTitle, customerPanel);
	}

}
