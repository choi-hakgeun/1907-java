package semi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class OrderUpdate extends JInternalFrame {
	OrderDao dao = new OrderDao();
	
	
	String header[] = {"주문번호", "음식명", "주문수량", "주문날짜", "주문가격", "주문자아이디"};
	DefaultTableModel model = new DefaultTableModel(header, 0);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");	
	
	int oNum;
	
	private JLabel lblOrderHistoryList;
	private JScrollPane scrollPane;
	private JLabel lblOrderHistoryManagement;
	private JTextField toNum;
	private JButton btnNewButton;
	private JLabel label;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JTextField tmId;
	private JLabel label_2;
	private JTextField toDate;
	private JLabel label_3;
	private JTextField toName;
	private JLabel label_4;
	private JTextField toea;
	private JLabel label_5;
	private JTextField toPrice;
	private JButton btnNewButton_1;
	private JButton button;
	private JLabel status;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUpdate frame = new OrderUpdate();
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
	public OrderUpdate() {
				
		setVisible(true);
		
		setTitle("\uC8FC\uBB38\uB0B4\uC5ED\uAD00\uB9AC");
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		getContentPane().add(getLblOrderHistoryList());
		getContentPane().add(getScrollPane());
		getContentPane().add(getLabel_1());
		getContentPane().add(getToNum());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getLabel_2());
		getContentPane().add(getSeparator());
		getContentPane().add(getLabel_1_1());
		getContentPane().add(getTmId());
		getContentPane().add(getLabel_2_1());
		getContentPane().add(getToDate());
		getContentPane().add(getLabel_3());
		getContentPane().add(getToName());
		getContentPane().add(getLabel_4());
		getContentPane().add(getToea());
		getContentPane().add(getLabel_5());
		getContentPane().add(getToPrice());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getButton());
		getContentPane().add(getStatus());
		
		List<OrderVo> list = dao.OrderList();					
		
		try {
			Vector row = new Vector(list.size());
			
			for(int i=1; i< list.size(); i++) {			
					OrderVo vo = list.get(i);
					model.addRow(new Object[] {
							vo.getoNum(), vo.getoName(), vo.getOea(), 
							vo.getoDate(), vo.getoPrice(), vo.getmId()
					});

			}// for end
			table.setModel(model);
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private JLabel getLblOrderHistoryList() {
		if (lblOrderHistoryList == null) {
			lblOrderHistoryList = new JLabel("Order History List");
			lblOrderHistoryList.setHorizontalAlignment(SwingConstants.CENTER);
			lblOrderHistoryList.setBounds(12, 10, 298, 15);
		}
		return lblOrderHistoryList;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 35, 298, 326);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JLabel getLabel_1() {
		if (lblOrderHistoryManagement == null) {
			lblOrderHistoryManagement = new JLabel("Order History Management");
			lblOrderHistoryManagement.setHorizontalAlignment(SwingConstants.CENTER);
			lblOrderHistoryManagement.setBounds(352, 10, 220, 15);
		}
		return lblOrderHistoryManagement;
	}
	private JTextField getToNum() {
		if (toNum == null) {
			toNum = new JTextField();
			toNum.setBounds(391, 34, 116, 21);
			toNum.setColumns(10);
		}
		return toNum;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					model.setNumRows(0);
					String find = toNum.getText();
					List<OrderVo> list = dao.select(find);					
					
					for(OrderVo vo : list) {						
					    model.addRow(new Object[] {
					    		vo.getoNum(), vo.getoName(), vo.getOea(), 
					    		vo.getoDate(), vo.getoPrice(), vo.getmId()
					    });
					    table.setModel(model);
					}
					
					
					int oNum = Integer.parseInt(toNum.getText());
					OrderVo vo = dao.search(oNum);
					if( vo==null) {
						status.setText("주문번호를 검색하여주세요.");
					}else {
						tmId.setText(vo.getmId());
						toDate.setText(sdf.format(vo.getoDate()));
						toName.setText(vo.getoName());
						toea.setText(String.valueOf(vo.getOea()));
						toPrice.setText(String.valueOf(vo.getoPrice()));
					}
					
				}
			});
			btnNewButton.setBounds(512, 33, 60, 23);
		}
		return btnNewButton;
	}
	private JLabel getLabel_2() {
		if (label == null) {
			label = new JLabel("\uC8FC \uBB38  \uBC88 \uD638");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(321, 37, 67, 15);
		}
		return label;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(322, 62, 250, 2);
		}
		return separator;
	}
	private JLabel getLabel_1_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC544   \uC774    \uB514");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(322, 74, 67, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTmId() {
		if (tmId == null) {
			tmId = new JTextField();
			tmId.setBounds(391, 71, 181, 21);
			tmId.setColumns(10);
		}
		return tmId;
	}
	private JLabel getLabel_2_1() {
		if (label_2 == null) {
			label_2 = new JLabel("\uC8FC \uBB38  \uB0A0 \uC9DC");
			label_2.setBounds(322, 130, 67, 15);
		}
		return label_2;
	}
	private JTextField getToDate() {
		if (toDate == null) {
			toDate = new JTextField();
			toDate.setColumns(10);
			toDate.setBounds(391, 127, 181, 21);
		}
		return toDate;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("\uC8FC\uBB38 \uC0C1\uD488\uBA85");
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBounds(322, 158, 67, 15);
		}
		return label_3;
	}
	private JTextField getToName() {
		if (toName == null) {
			toName = new JTextField();
			toName.setColumns(10);
			toName.setBounds(391, 155, 181, 21);
		}
		return toName;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("\uC8FC \uBB38  \uC218 \uB7C9");
			label_4.setHorizontalAlignment(SwingConstants.CENTER);
			label_4.setBounds(322, 189, 67, 15);
		}
		return label_4;
	}
	private JTextField getToea() {
		if (toea == null) {
			toea = new JTextField();
			toea.setColumns(10);
			toea.setBounds(391, 186, 181, 21);
		}
		return toea;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("\uC8FC \uBB38  \uAC00 \uACA9");
			label_5.setBounds(322, 217, 67, 15);
		}
		return label_5;
	}
	private JTextField getToPrice() {
		if (toPrice == null) {
			toPrice = new JTextField();
			toPrice.setColumns(10);
			toPrice.setBounds(391, 214, 181, 21);
		}
		return toPrice;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uB0B4\uC5ED\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					OrderVo vo = new OrderVo();	
					
					if(tmId.getText().equals("") && toName.getText().equals("") // 공백체크 
					  && toea.getText().equals("") && toPrice.getText().equals("")) {
						status.setText("수정 내용 중 공백이 있습니다.");
					}else {
						try {
							vo.setmId(tmId.getText() );	
							vo.setoDate(sdf.parse(toDate.getText()) );
							vo.setoName(toName.getText());						
							
							vo.setoPrice(Integer.parseInt(toPrice.getText()) );
							
							int i = Integer.parseInt(toea.getText());//수량 2자리 체크
							if(i > 99) {
								status.setText("수량은 두자리까지 수정이 가능합니다.");
							}else {
								vo.setOea(i);								
								int cnt = dao.update(vo);							
								if(cnt>0) {
									status.setText("정상적으로 수정되었습니다.");
								}else {
									status.setText("수량과 주문금액은 숫자만 입력이 가능합니다.");
								}								
							}
							
						}catch(Exception ex){
							ex.printStackTrace();
						}
						
					}catch(Exception ex){
						ex.printStackTrace();
					}
				}
			});
			btnNewButton_1.setBounds(391, 245, 85, 40);
		}
		return btnNewButton_1;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("\uB0B4\uC5ED\uC0AD\uC81C");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int oNum = Integer.parseInt(toNum.getText());
					int cnt = dao.delete(oNum);
					
					if(cnt>0) {
						status.setText("주문내역이 삭제되었습니다.");						
					}else {
						status.setText("주문내역 삭제 중 오류가 발생하였습니다.");
					}					
					toNum.setText("");
					tmId.setText("");
					toDate.setText("");
					toName.setText("");
					toea.setText("");
					toPrice.setText("");
					
				}
			});
			button.setBounds(488, 245, 85, 40);
		}
		return button;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uC8FC\uBB38\uBC88\uD638\uB97C \uAC80\uC0C9\uD558\uC5EC \uC8FC\uC138\uC694.");
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(175, 238, 238));
			status.setBounds(322, 295, 250, 66);
		}
		return status;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
			status = new JLabel("\uC8FC\uBB38\uBC88\uD638\uB97C \uAC80\uC0C9\uD558\uC5EC \uC8FC\uC138\uC694.");
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBackground(new Color(175, 238, 238));
			status.setBounds(322, 295, 250, 66);
		}
		return status;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
