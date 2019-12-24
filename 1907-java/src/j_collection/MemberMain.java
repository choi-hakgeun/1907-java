package j_collection;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;

public class MemberMain extends JFrame {
	
	static String idcheck = "\\w{4,10}";//패턴, 무결성체크
	static String pwdcheck = "[\\w!$]{4,10}";
	static String namecheck = "[가-힣]{4,10}";
	static String phonecheck = "\\d{2,3}-\\d{3,4}-\\{4}";
	
	Map<String, List<ScoreVo>> map = new HashMap<String, List<ScoreVo>>();
	
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
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;

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
		setBounds(100, 100, 903, 502);
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
			String tempSerial = sdf.format(new Date()) +"-"+ MemberMain.iSerial;
			ProductVo vo= new ProductVo(tempSerial, "pCode"+i, "pName"+i, 3000, new Date());
			piList.add(vo);
			peList.add(vo);
			MemberMain.iSerial++;
			MemberMain.eSerial++;
		}
		
		//System.out.println(piList.size());
		//System.out.println(peList.size());
		
		//성적관리 sample
		ScoreVo sVo = new ScoreVo("1", "kim", "중간", 1,90,90,90);
		List<ScoreVo> list1 = new ArrayList<ScoreVo>();
		list1.add(sVo);
		list1.add(new ScoreVo("1", "kim", "기말", 1, 80,70,60));
		list1.add(new ScoreVo("1", "kim", "기말", 1, 60,80,50));
		
		map.put("1", list1);
		
		//---
		list1 = new ArrayList<ScoreVo>();
		list1.add(new ScoreVo("2", "lee", "중간", 3, 50,60,50));
		list1.add(new ScoreVo("2", "lee", "기말", 3, 40,30,40));
		
		map.put("2", list1);
		
		//---
		list1 = new ArrayList<ScoreVo>();
		list1.add(new ScoreVo("3", "hong", "중간", 2, 10,10,10));
		list1.add(new ScoreVo("3", "hong", "기말", 2, 20,30,40));
		list1.add(new ScoreVo("3", "hong", "중간", 3, 80,90,85));
		
		map.put("3", list1);
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
			menuBar.add(getMnNewMenu_2());
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
					m.toFront();
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
					m.toFront();
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
					m.toFront();
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
					panal.toFront();
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
					panal.toFront();
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
					panal.toFront();
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
					panal.toFront();
				}
			});
		}
		return mntmNewMenuItem_6;
	}
	private JMenu getMnNewMenu_2() {
		if (mnNewMenu_2 == null) {
			mnNewMenu_2 = new JMenu("성적관리");
			mnNewMenu_2.add(getMntmNewMenuItem_7());
			mnNewMenu_2.add(getMntmNewMenuItem_8());
		}
		return mnNewMenu_2;
	}
	private JMenuItem getMntmNewMenuItem_7() {
		if (mntmNewMenuItem_7 == null) {
			mntmNewMenuItem_7 = new JMenuItem("입력");
			mntmNewMenuItem_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ScoreInput panal = new ScoreInput(map);
					contentPane.add(panal);
					panal.toFront();
				}
			});
		}
		return mntmNewMenuItem_7;
	}
	private JMenuItem getMntmNewMenuItem_8() {
		if (mntmNewMenuItem_8 == null) {
			mntmNewMenuItem_8 = new JMenuItem("조회");
			mntmNewMenuItem_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ScoreSearch panal = new ScoreSearch(map);
					contentPane.add(panal);
					panal.toFront();
				}
			});
		}
		return mntmNewMenuItem_8;
	}
}
