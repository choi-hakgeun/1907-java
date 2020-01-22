package semi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class OrderInsert extends JInternalFrame {
	OrderDao dao = new OrderDao();
	Connection conn;
	String header[] = { "�???", "�?�?"};
	String header1[] = { "�???", "�?�?", "????"};
	DefaultTableModel model = new DefaultTableModel(header,0);
	DefaultTableModel model2 = new DefaultTableModel(header1,0);
	int tot;
	
	
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTextField tmId;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JLabel status;
	private JTable table_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderInsert frame = new OrderInsert();
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
	public OrderInsert() {
		super("�??? ????", false, true, true, true);
		setVisible(true);
		
		setTitle("\uC8FC\uBB38\uC811\uC218");
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getScrollPane());
		getContentPane().add(getScrollPane_1());
		getContentPane().add(getTmId());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getButton());
		getContentPane().add(getButton_1());
		getContentPane().add(getStatus());		
		
		
		
		List<FoodVo> list = dao.menu();
		try {									
			Vector row = new Vector(list.size());
			
            for(int i=1; i<=list.size(); i++) {
            	if(i<list.size()) {
            		FoodVo vo = list.get(i);
            		model.addRow(new Object[]{vo.getfName(), vo.getSalPrice()});
            		table.setModel(model);            		
            	}
			}
//			FoodVo vo = list.get(0); // select 결과 �? 첫�?�? ???? �???, �?�? ??보�? ?�겨???? vo
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		table_1.setModel(model2);
		
	}		
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uBA54\uB274\uC120\uD0DD");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 35, 220, 326);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(352, 35, 220, 266);
			scrollPane_1.setViewportView(getTable_1());
		}
		return scrollPane_1;
	}
	private JTextField getTmId() {//�?그�?��???��?? 매�?�??? �??????? 매�?�????? ?�기
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setHorizontalAlignment(SwingConstants.CENTER);
			tmId.setEnabled(false);
			tmId.setText("\uD68C\uC6D0 ID");
			tmId.setBounds(352, 7, 116, 21);
			tmId.setColumns(10);
			//getcid
		}
		return tmId;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uB2D8\uC758 \uC8FC\uBB38\uB0B4\uC6A9");
			lblNewLabel_1.setBounds(470, 10, 102, 15);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uBA54\uB274\uCD94\uAC00");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {					
					
					int row = table.getSelectedRow();
					Vector vc = model.getDataVector();
					
					Vector rowVC = (Vector) vc.get(row);
					
					rowVC.addElement(1); // �??? �?�?
					
					model2.addRow(rowVC);
					table_1.setModel(model2);
					
					// �?�? ?��? 구�??�?
					Integer num = (Integer) model.getValueAt(row, 1);
					tot += num;
					System.out.println(num);
					System.out.println(tot);
					//table_1.addColumnSelectionInterval(row, col);					
				}
			});
			btnNewButton.setBounds(244, 34, 96, 60);
		}
		return btnNewButton;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uBA54\uB274\uC0AD\uC81C");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {									
					
					int row = table_1.getSelectedRow();
					if(row == -1) {
						status.setText("취�???? �??��?? ?????? 주�?��??");
					}else {
						// 취�???? ???? �??? 빼기
						Integer num = (Integer) model2.getValueAt(row, 1);
						tot -= num;
						
						model2.removeRow(row);
						table_1.setModel(model2);
						
						System.out.println(tot);
						status.setText("�??��? 취�???????��????.");
					}
				}
			});
			button.setBounds(244, 104, 96, 60);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("\uC8FC\uBB38\uD558\uAE30");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						OrderVo vo = new OrderVo();
						vo.setmId(tmId.getText());
						boolean result = false; // 주문 ?��???? ???? ???��?��??�? ????
						
						Vector vc = model2.getDataVector();//루�???? ???? List�? �?�?						
						for(int i = 0; i < vc.size() ;i++) {
							
							//for(int j=0; j < 3; j++) {
								vo.setoName((String)table_1.getValueAt(i, 0));
								vo.setoPrice((Integer)table_1.getValueAt(i, 1));						
								vo.setOea((Integer)table_1.getValueAt(i, 2));						
							//}
								int cnt = dao.insert(vo);
								
								if(cnt > 0) {
									result = true;
								}
								else {
									result = false;
									break;						
								}
									
								System.out.println(vo.getoName());
								System.out.println(vo.getoPrice());
								System.out.println(vo.getOea());
						}
						
						if(result) {
							dao.conn.commit();
							status.setText("주문?? ??�??????��????.");
						}else {
							dao.conn.rollback(); // ?��?��?? ???��???��? ????�??? �?
							status.setText("카�?��?��?? 문�???�주?��??.");
						}
						
					}catch(Exception ex) {
						ex.printStackTrace();
					}
					
				}
			});
			button_1.setBounds(244, 241, 96, 60);
		}
		return button_1;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uBA54\uB274\uB97C \uC120\uD0DD\uD558\uC5EC \uCD94\uAC00\uD558\uC2DC\uACE0 \uC8FC\uBB38\uD558\uAE30 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694.");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(175, 238, 238));
			status.setOpaque(true);
			status.setBounds(244, 311, 328, 50);
		}
		return status;
	}
	private JTable getTable_1() {		
		if (table_1 == null) {
			table_1 = new JTable();
		}
		return table_1;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
