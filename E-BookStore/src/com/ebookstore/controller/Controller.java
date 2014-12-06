package com.ebookstore.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.ebookstore.model.Book;
import com.ebookstore.model.CD;
import com.ebookstore.model.Customer;
import com.ebookstore.model.Order;
import com.ebookstore.model.Software;
import com.ebookstore.model.Title;
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

public class Controller {

	private ArrayList<Customer> customers;
	private ArrayList<Title> titles;
	private Customer currentCustomer;
	private LoginPage loginPage;
	private AdminLogin adminLogin;
	private CustomerLogin customerLogin;
	private AdminMenuPanel adminMenuPanel;
	private AddCustomerPanel addCustomerPanel;
	private UpdateRemoveCustomer updateRemoveCustomer;
	private ManageOrderItem manageOrderItem;
	private AddTitlePanel addTitlePanel;
	private UpdateRemoveTitle updateRemoveTitle;
	private CustomerPanel customerPanel;
	private ActionListener actionListener;

	private Integer customerIdCount = 1;
	private Integer titleIdCount = 1;

	public Controller(LoginPage loginPage, AdminLogin adminLogin,
			CustomerLogin customerLogin, AdminMenuPanel adminMenuPanel,
			AddCustomerPanel addCustomerPanel,
			UpdateRemoveCustomer updateRemoveCustomer,
			ManageOrderItem manageOrderItem, AddTitlePanel addTitlePanel,
			UpdateRemoveTitle updateRemoveTitle, CustomerPanel customerPanel) {
		this.loginPage = loginPage;
		this.adminLogin = adminLogin;
		this.customerLogin = customerLogin;
		this.adminMenuPanel = adminMenuPanel;
		this.addCustomerPanel = addCustomerPanel;
		this.updateRemoveCustomer = updateRemoveCustomer;
		this.manageOrderItem = manageOrderItem;
		this.addTitlePanel = addTitlePanel;
		this.updateRemoveTitle = updateRemoveTitle;
		this.customerPanel = customerPanel;
		customers = new ArrayList<Customer>();
		titles = new ArrayList<Title>();
		init();
		addListeners();
	}

	private void init() {
		Customer c1 = new Customer("ömer", "erkan", 10000);
		Customer c2 = new Customer("polat", "köksal", 50000);
		addCustomer(c1);
		addCustomer(c2);
		Title t1 = new Title("kitap", "kdjgdfhsgsfjhsj", 1000);
		Title t2 = new Title("armut", "yeniksdjgdf", 500);
		addTitle(t1);
		addTitle(t2);
		Order o1 = new Order(t1, OrderStatus.PREPARING);
		c2.addOrder(o1);

	}

	private void addListeners() {

		loginPage.addActionListenerToAdminBtn(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminLogin.setVisible(true);
				loginPage.setVisible(false);
			}
		});

		loginPage.addActionListenerToCustomerBtn(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				customerLogin.setVisible(true);
				loginPage.setVisible(false);
			}
		});

		adminLogin.addActionListenerToAdminLoginBtn(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean b = validateAdmin(adminLogin.getTextAdminName()
						.getText(), adminLogin.getTextAdminSurname().getText());
				if (b) {
					adminMenuPanel.setVisible(true);
					adminLogin.setVisible(false);
				}
			}
		});

		customerLogin.addActionListenerToCustomerLoginBtn(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean b = validateCustomer(customerLogin
						.getTextCustomerName().getText(), customerLogin
						.getTextCustomerSurname().getText());
				if (b) {
					customerPanel.getPurchesedItemList().setListData(
							generateOrderArray(currentCustomer.getOrders()));
					customerPanel.getItemList().setListData(
							generateTitleArray());
					customerPanel.getCreditLabel().setText(
							currentCustomer.getCredit().toString());
					customerPanel.setVisible(true);
					customerLogin.setVisible(false);
					actionListener = this;
				}
			}
		});

		adminMenuPanel.addActionListenerToAddCustomer(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addCustomerPanel.setVisible(true);
				adminMenuPanel.setVisible(false);
			}
		});

		adminMenuPanel.addActionListenerToAddTitle(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTitlePanel.setVisible(true);
				adminMenuPanel.setVisible(false);
			}
		});

		adminMenuPanel
				.addActionListenerToManageOrderItemBtn(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						manageOrderItem.getjCustomlist().setListData(
								generateCustomerArray());
						manageOrderItem.setVisible(true);
						adminMenuPanel.setVisible(false);
					}
				});

		adminMenuPanel
				.addActionListenerToUpdateOrRemoveTitle(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						updateRemoveTitle.getJlist().setListData(
								generateTitleArray());
						updateRemoveTitle.getTextTitle().setText("");
						updateRemoveTitle.getTextPrice().setText("");
						updateRemoveTitle.getTextArea().setText("");
						updateRemoveTitle.setVisible(true);
						adminMenuPanel.setVisible(false);
					}
				});

		adminMenuPanel
				.addActionListenerToUpdateRemoveCustomerBtn(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						updateRemoveCustomer.getJlist().setListData(
								generateCustomerArray());
						updateRemoveCustomer.getTextName().setText("");
						updateRemoveCustomer.getTextSurName().setText("");
						updateRemoveCustomer.getTextCredit().setText("");
						updateRemoveCustomer.setVisible(true);
						adminMenuPanel.setVisible(false);
					}
				});

		addCustomerPanel
				.addActionListenerToSaveCustomerBtn(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Customer c = new Customer(addCustomerPanel
								.getTextUsrName().getText(), addCustomerPanel
								.getTextUsrSurname().getText(), Integer
								.valueOf(addCustomerPanel.getTextUsrCredit()
										.getText()));
						addCustomer(c);
						adminMenuPanel.setVisible(true);
						addCustomerPanel.setVisible(false);
					}
				});

		addTitlePanel.addActionListenerToSaveTitleBtn(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer i = addTitlePanel.getComboBoxType().getSelectedIndex();
				String title = addTitlePanel.getMainTitle().getText();
				String desc = addTitlePanel.getTextArea().getText();
				Integer price = Integer.valueOf(addTitlePanel
						.getTextTitlePrice().getText());
				String common = addTitlePanel.getTextTitle().getText();
				if (i == 0) {
					Book b = new Book(title, desc, price, common);
					addTitle(b);
				} else if (i == 1) {
					CD cd = new CD(title, desc, price, common);
					addTitle(cd);
				} else if (i == 2) {
					Software s = new Software(title, desc, price, common);
					addTitle(s);
				}
				adminMenuPanel.setVisible(true);
				addTitlePanel.setVisible(false);
			}
		});

		updateRemoveCustomer
				.addActionListenerToUpdateCustomerBtn(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (!updateRemoveCustomer.getJlist().isSelectionEmpty()) {
							String[] s = updateRemoveCustomer.getJlist()
									.getSelectedValue().toString().split("-");
							Customer c = getCustomerById(Integer.valueOf(s[0]));
							c.setName(updateRemoveCustomer.getTextName()
									.getText());
							c.setSurname(updateRemoveCustomer.getTextSurName()
									.getText());
							c.setCredit(Integer.valueOf(updateRemoveCustomer
									.getTextCredit().getText()));
							updateCustomer(c);
							adminMenuPanel.setVisible(true);
							updateRemoveCustomer.setVisible(false);
						}
					}
				});

		updateRemoveCustomer
				.addActionListenerToRemoveCustomerBtn(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!updateRemoveCustomer.getJlist().isSelectionEmpty()) {
							int dialogButton = JOptionPane.YES_NO_OPTION;
							int result = JOptionPane.showConfirmDialog(null,
									"Are you sure?", "Warning", dialogButton);
							if (result == JOptionPane.YES_OPTION) {
								String[] s = updateRemoveCustomer.getJlist()
										.getSelectedValue().toString()
										.split("-");
								Customer c = getCustomerById(Integer
										.valueOf(s[0]));
								removeCustomer(c);
								adminMenuPanel.setVisible(true);
								updateRemoveCustomer.setVisible(false);

							}
						}

					}
				});

		updateRemoveTitle
				.addActionListenerToRemoveTitleBtn(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!updateRemoveTitle.getJlist().isSelectionEmpty()) {
							int dialogButton = JOptionPane.YES_NO_OPTION;
							int result = JOptionPane.showConfirmDialog(null,
									"Are you sure?", "Warning", dialogButton);
							if (result == JOptionPane.YES_OPTION) {
								String[] s = updateRemoveTitle.getJlist()
										.getSelectedValue().toString()
										.split("-");
								Title t = getTitleById(Integer.valueOf(s[0]));
								removeTitle(t);
								adminMenuPanel.setVisible(true);
								updateRemoveTitle.setVisible(false);

							}
						}
					}
				});

		updateRemoveTitle
				.addActionListenerToUpdateTitleBtn(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!updateRemoveTitle.getJlist().isSelectionEmpty()) {
							String[] s = updateRemoveTitle.getJlist()
									.getSelectedValue().toString().split("-");
							Title t = getTitleById(Integer.valueOf(s[0]));
							t.setTitle(updateRemoveTitle.getTextTitle()
									.getText());
							t.setPrice(Integer.valueOf(updateRemoveTitle
									.getTextPrice().getText()));
							t.setDesc(updateRemoveTitle.getTextArea().getText());
							updateTitle(t);
							adminMenuPanel.setVisible(true);
							updateRemoveTitle.setVisible(false);
						}

					}
				});

		manageOrderItem.addActionListenerToManageSaveBtn(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] s1 = manageOrderItem.getjCustomlist()
						.getSelectedValue().toString().split("-");
				String[] s2 = manageOrderItem.getjItemList().getSelectedValue()
						.toString().split("-");
				Integer i = manageOrderItem.getComboBox().getSelectedIndex();
				OrderStatus status = null;
				if (i == 0)
					status = OrderStatus.PREPARING;
				else if (i == 1)
					status = OrderStatus.SHIPPED;
				else
					status = OrderStatus.DELIVERED;
				updateOrderStatus(Integer.valueOf(s1[0]),
						Integer.valueOf(s2[0]), status);
				adminMenuPanel.setVisible(true);
				manageOrderItem.setVisible(false);
			}
		});

		updateRemoveCustomer
				.addListSelectionListenerToUpdateCustomerList(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent arg0) {
						if (!updateRemoveCustomer.getJlist().isSelectionEmpty()) {
							String[] s = updateRemoveCustomer.getJlist()
									.getSelectedValue().toString().split("-");
							Customer c = getCustomerById(Integer.valueOf(s[0]));
							updateRemoveCustomer.getTextName().setText(
									c.getName());
							updateRemoveCustomer.getTextSurName().setText(
									c.getSurname());
							updateRemoveCustomer.getTextCredit().setText(
									c.getCredit().toString());
						}
					}
				});

		updateRemoveTitle
				.addListSelectionListenerToUpdateItemList(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent arg0) {
						if (!updateRemoveTitle.getJlist().isSelectionEmpty()) {
							String[] s = updateRemoveTitle.getJlist()
									.getSelectedValue().toString().split("-");
							Title t = getTitleById(Integer.valueOf(s[0]));
							updateRemoveTitle.getTextTitle().setText(
									t.getTitle());
							updateRemoveTitle.getTextPrice().setText(
									t.getPrice().toString());
							updateRemoveTitle.getTextArea()
									.setText(t.getDesc());
						}
					}
				});

		manageOrderItem
				.addListSelectionListenerToCustomList(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						if (!manageOrderItem.getjCustomlist()
								.isSelectionEmpty()) {
							String[] s = manageOrderItem.getjCustomlist()
									.getSelectedValue().toString().split("-");
							Customer c = getCustomerById(Integer.valueOf(s[0]));
							manageOrderItem.getjItemList().setListData(
									generateOrderArray(c.getOrders()));
						}

					}
				});

		manageOrderItem
				.addListSelectionListenerToItemList(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent arg0) {
						if (!manageOrderItem.getjItemList().isSelectionEmpty()) {
							String[] s1 = manageOrderItem.getjCustomlist()
									.getSelectedValue().toString().split("-");
							String[] s2 = manageOrderItem.getjItemList()
									.getSelectedValue().toString().split("-");
							Order o = getOrderById(Integer.valueOf(s1[0]),
									Integer.valueOf(s2[0]));
							if (o.getOrderStatus()
									.equals(OrderStatus.PREPARING)) {
								manageOrderItem.getComboBox().setSelectedIndex(
										0);
							} else if (o.getOrderStatus().equals(
									OrderStatus.SHIPPED)) {
								manageOrderItem.getComboBox().setSelectedIndex(
										1);
							} else if (o.getOrderStatus().equals(
									OrderStatus.DELIVERED)) {
								manageOrderItem.getComboBox().setSelectedIndex(
										2);
							}
						}
					}
				});

		customerPanel
				.addListSelectionListenerToItemList(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent arg0) {
						if (!customerPanel.getItemList().isSelectionEmpty()) {
							String[] s = customerPanel.getItemList()
									.getSelectedValue().toString().split("-");
							Title t = getTitleById(Integer.valueOf(s[0]));
							customerPanel.getItemTitle().setText(t.getTitle());
							customerPanel.getItemPrice().setText(
									t.getPrice().toString());
							customerPanel.getItemDesc().setText(t.getDesc());
						}
					}
				});

		customerPanel
				.addListSelectionListenerToPurchesedItemList(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent arg0) {
						if (!customerPanel.getPurchesedItemList()
								.isSelectionEmpty()) {
							String[] s = customerPanel.getPurchesedItemList()
									.getSelectedValue().toString().split("-");
							Order o = getOrderById(currentCustomer.getId(),
									Integer.valueOf(s[0]));
							customerPanel.getPurchasedTitle().setText(
									o.getTitle().getTitle());
							customerPanel.getPurchasedPrice().setText(
									o.getTitle().getPrice().toString());
							customerPanel.getPurchasedDesc().setText(
									o.getTitle().getDesc());
							customerPanel.getPurchasedStatus().setText(
									o.getOrderStatus().name());

						}
					}
				});

		customerPanel.addActionListenerToBuyBtn(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] s = customerPanel.getItemList().getSelectedValue()
						.toString().split("-");
				Title t = getTitleById(Integer.valueOf(s[0]));
				Order o = new Order(t, OrderStatus.PREPARING);
				currentCustomer.addOrder(o);
				actionListener.actionPerformed(null);
			}
		});

		adminLogin.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPage.setVisible(true);
				adminLogin.setVisible(false);
			}
		});

		customerLogin.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPage.setVisible(true);
				customerLogin.setVisible(false);
			}
		});

		adminMenuPanel.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminLogin.setVisible(true);
				adminMenuPanel.setVisible(false);
			}
		});

		addCustomerPanel.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMenuPanel.setVisible(true);
				addCustomerPanel.setVisible(false);
			}
		});

		addTitlePanel.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMenuPanel.setVisible(true);
				addTitlePanel.setVisible(false);
			}
		});

		manageOrderItem.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMenuPanel.setVisible(true);
				manageOrderItem.setVisible(false);
			}
		});

		updateRemoveCustomer.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMenuPanel.setVisible(true);
				updateRemoveCustomer.setVisible(false);
			}
		});

		updateRemoveTitle.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminMenuPanel.setVisible(true);
				updateRemoveTitle.setVisible(false);
			}
		});

		customerPanel.addBackButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerLogin.setVisible(true);
				customerPanel.setVisible(false);
			}
		});

	}

	private Customer getCustomerById(Integer id) {
		Customer result = null;
		for (Customer c : customers) {
			if (c.getId() == id) {
				result = c;
			}
		}
		return result;
	}

	private Title getTitleById(Integer id) {
		Title result = null;
		for (Title t : titles) {
			if (t.getId() == id) {
				result = t;
			}
		}
		return result;
	}

	private Order getOrderById(Integer custId, Integer orderId) {
		Order result = null;
		for (Order o : getCustomerById(custId).getOrders()) {
			if (o.getId() == orderId) {
				result = o;
			}
		}
		return result;
	}

	public Boolean validateAdmin(String name, String surname) {
		Boolean result = false;
		if ("".equals(name) && "".equals(surname)) {
			result = true;
		}
		return result;
	}

	public Boolean validateCustomer(String name, String surname) {
		Boolean result = false;
		for (Customer c : customers) {
			if (c.getName().equals(name) && c.getSurname().equals(surname)) {
				result = true;
				currentCustomer = c;
			}
		}
		return result;
	}

	public void addCustomer(Customer customer) {
		customer.setId(customerIdCount);
		customerIdCount++;
		customers.add(customer);
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	public void updateCustomer(Customer customer) {
		for (Customer c : customers) {
			if (c.getId() == customer.getId()) {
				c.setName(customer.getName());
				c.setSurname(customer.getSurname());
				c.setCredit(customer.getCredit());
			}
		}
	}

	public void addTitle(Title title) {
		title.setId(titleIdCount);
		titleIdCount++;
		titles.add(title);
	}

	public void removeTitle(Title title) {
		titles.remove(title);
	}

	public void updateTitle(Title title) {
		for (Title t : titles) {
			if (t.getId() == title.getId()) {
				t = title;
			}
		}
	}

	public void updateOrderStatus(Order order) {
		for (Customer c : customers) {
			if (c.getId() == order.getCustomerId()) {
				for (Order o : c.getOrders()) {
					if (o.getId() == order.getId()) {
						o = order;
					}
				}
			}
		}
	}

	public ArrayList<String> getStatus() {
		OrderStatus[] orders = OrderStatus.values();
		ArrayList<String> states = new ArrayList<String>();

		for (int i = 0; i < orders.length; i++) {
			states.add(orders[i].name());
		}

		return states;
	}

	private Object[] generateCustomerArray() {
		ArrayList<String> result = new ArrayList<String>();
		for (Customer c : customers) {
			String s = c.getId() + "-" + c.getName() + " " + c.getSurname();
			result.add(s);
		}
		return result.toArray();
	}

	private Object[] generateTitleArray() {
		ArrayList<String> result = new ArrayList<String>();
		for (Title t : titles) {
			String s = t.getId() + "-" + t.getTitle();
			result.add(s);
		}
		return result.toArray();
	}

	private Object[] generateOrderArray(ArrayList<Order> orders) {
		ArrayList<String> result = new ArrayList<String>();
		for (Order o : orders) {
			String s = o.getId() + "-" + o.getTitle().getTitle();
			result.add(s);
		}
		return result.toArray();
	}

	private void updateOrderStatus(Integer cId, Integer oId, OrderStatus status) {
		for (Customer c : customers) {
			if (c.getId() == cId) {
				for (Order o : c.getOrders()) {
					if (o.getId() == oId) {
						o.setOrderStatus(status);
					}
				}
			}
		}
	}

}
