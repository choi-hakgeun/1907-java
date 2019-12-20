package j_collection;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.awt.event.ActionEvent;

public class MemberMain extends JFrame {
	
	static String idcheck = "\\w{4,10}";//패턴, 무결성체크
	static String pwdcheck = "[\\w!$]{4,10}";
	static String namecheck = "[가-힣]{4,10}";
	static String phonecheck = "\\d{2,3}-\\d{3,4}-\\{4}";
	
	List<MemberVo> list = new ArrayList<MemberVo>();//리스트 컬렉션 필드 생성
	
	Set<ProductVo> piList = new HashSet<ProductVo>();//입고
	Set<ProductVo> peList = new HashSet<ProductVo>();//출고
	
	static int iSerial = 1; //입고의 순번
	static int eSerial = 1; //출고의 순번
	
	

	private JDesktopPane contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMain frame = new MemberMain();
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
	public MemberMain() {
		setTitle("\uD68C\uC6D0\uAD00\uB9AC");//회원관리		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 387);
		setJMenuBar(getMenuBar_1());
		contentPane = new JDesktopPane();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//sample data insert
		for(int i = 0; i<500; i++) {
			MemberVo vo = new MemberVo("no"+i, "pwe"+i, "name" +i, "010-1111-" +i);
			list.add(vo);//리스트는 반드시 생성된 후에 사용해야함.
		}
		//입고 sample data
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i = 0; i<100 ; i++) {
			String tempSerial = sdf.format(new Date()) + MemberMain.iSerial;
			ProductVo vo= new ProductVo(tempSerial, "pCode"+i, "pName"+i, 3000, new Date());
			piList.add(vo);
			peList.add(vo);
			MemberMain.iSerial++;
			MemberMain.eSerial++;
		}
		
		//System.out.println(piList.size());
		//System.out.println(peList.size());
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uD68C\uC6D0\uAD00\uB9AC");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("\uC785\uB825");//입력
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					MemberInput m = new MemberInput(list); //콜바이 레퍼런스 - 주소만 이동됨
					contentPane.add(m);
				}
			});
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("\uC870\uD68C");//검색
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberSearch m = new MemberSearch(list);
					contentPane.add(m);
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("\uC218\uC815 \uC0AD\uC81C");//수정삭제
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					MemberModify m = new MemberModify(list);
					contentPane.add(m);
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("자제관리");
			mnNewMenu_1.add(getMntmNewMenuItem_3());
			mnNewMenu_1.add(getMntmNewMenuItem_4());
			mnNewMenu_1.add(getMntmNewMenuItem_5());
			mnNewMenu_1.add(getMntmNewMenuItem_6());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("입고");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					ProductInput panal = new ProductInput(piList);
					contentPane.add(panal);
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("출고");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductOutput panal = new ProductOutput(peList);
					contentPane.add(panal);
				}
			});
			
			
		}
		return mntmNewMenuItem_4;
	}
	private JMenuItem getMntmNewMenuItem_5() {
		if (mntmNewMenuItem_5 == null) {
			mntmNewMenuItem_5 = new JMenuItem("조회");
			mntmNewMenuItem_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductSearch panal = new ProductSearch(piList, peList);
					contentPane.add(panal);
				}
			});
			
			
		}
		return mntmNewMenuItem_5;
	}
	private JMenuItem getMntmNewMenuItem_6() {
		if (mntmNewMenuItem_6 == null) {
			mntmNewMenuItem_6 = new JMenuItem("수정 삭제");
			mntmNewMenuItem_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ProductModify panal = new ProductModify(piList, peList);
					contentPane.add(panal);
				}
			});
		}
		return mntmNewMenuItem_6;
	}
}
