package f_inheri;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BankApp extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenu menu_1;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankApp frame = new BankApp();
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
	public BankApp() {
		setTitle("\uC740\uD589\uAD00\uB9AC0.9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_2());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	private JMenuBar getMenuBar_2() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMenu());
			menuBar.add(getMenu_1());
		}
		return menuBar;
	}
	private JMenu getMenu() {
		if (menu == null) {
			menu = new JMenu("\uACC4\uC88C");
			menu.add(getMntmNewMenuItem());
			menu.add(getMntmNewMenuItem_4());
			menu.add(getMntmNewMenuItem_3());
		}
		return menu;
	}
	private JMenu getMenu_1() {
		if (menu_1 == null) {
			menu_1 = new JMenu("\uC785\uCD9C\uAE08");
			menu_1.add(getMntmNewMenuItem_1());
			menu_1.add(getMntmNewMenuItem_2());
		}
		return menu_1;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uACC4\uC88C\uC0DD\uC131");//계정생성
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					AccountCreate ac = new AccountCreate();
					contentPane.add(ac);
					contentPane.updateUI();
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC785\uAE08");//입금
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					Deposit dep = new Deposit();
					contentPane.add(dep);
					contentPane.updateUI();
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uCD9C\uAE08");//출금
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					Withdraw wd = new Withdraw();
					contentPane.add(wd);
					contentPane.updateUI();
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("\uACC4\uC815\uC218\uC815");//계정수정
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					AccountModify am = new AccountModify();
					contentPane.add(am);
					contentPane.updateUI();
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("\uACC4\uC815\uBAA9\uB85D");//계정목록
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					AccountList a1 = new AccountList();
					contentPane.add(a1);
					contentPane.updateUI();
				}
			});
		}
		return mntmNewMenuItem_4;
	}
}
