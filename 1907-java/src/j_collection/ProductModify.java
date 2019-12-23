package j_collection;

import java.awt.EventQueue;
import java.util.Date;
import java.util.Set;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class ProductModify extends JInternalFrame {
	Set<ProductVo> piList;
	Set<ProductVo> peList;
	Set<ProductVo> list; //검색, 수정 삭제에서 사용해야함.
	
	ButtonGroup group = new ButtonGroup();
	ProductVo oldVo;
	
	private JLabel lblNewLabel;
	private JRadioButton ImBtn;
	private JRadioButton ExBtn;
	private JLabel lblNewLabel_1;
	private JTextField serial;
	private JButton btnNewButton;
	private JSeparator separator;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField pCode;
	private JTextField pName;
	private JTextField ea;
	private JTextField nal;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_6;
	private JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductModify frame = new ProductModify();
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
	public ProductModify() {
		super("제품 수정|삭제", false, true, true, true);
		setVisible(true);
		
		setBounds(1031, 30, 311, 283);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getImBtn());
		getContentPane().add(getExBtn());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getSerial());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getSeparator());
		getContentPane().add(getLblNewLabel_2());
		getContentPane().add(getLblNewLabel_3());
		getContentPane().add(getLblNewLabel_4());
		getContentPane().add(getLblNewLabel_5());
		getContentPane().add(getPCode());
		getContentPane().add(getPName());
		getContentPane().add(getEa());
		getContentPane().add(getNal());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getLblNewLabel_6());
		getContentPane().add(getStatus());

	}
	public ProductModify(Set<ProductVo> pi, Set<ProductVo> pe) {
		this();
		this.piList = pi;
		this.peList = pe;
		setBounds(100, 100, 450, 400);
		
	}
	public void search() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
		//Set<ProductVo> list = null; 지역변수 선언시 필드로 안가 널포인트 에러뜸.
		
		ProductVo find = new ProductVo(); //검색어(시리얼, 제품코드, 제품명)
		
		if( ImBtn.isSelected()) {
			list = piList;
		}else {
			list = peList;
		}
		String s = serial.getText();
		oldVo  = null;
		status.setText("자료를 검색중입니다..");
		
		for(ProductVo vo : list) {
			if(vo.getSerial().equals(s)) {
				oldVo = vo;
				pCode.setText(vo.getpCode());
				pName.setText(vo.getpName());
				ea.setText(String.valueOf(vo.getEa()) );//vo.getEx()+""
				nal.setText(sdf.format(vo.getNal()));
				status.setText("자료를 찾았습니다.");
				break;
			}
		}
		if(oldVo == null) {
			pCode.setText("");
			pName.setText("");
			ea.setText("");
			nal.setText("");
			status.setText("자료가 없습니다.");
		}
	}
	
	public void update() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if( oldVo != null) {
			try {
				String s = serial.getText();
				String pC = pCode.getText();
				String pN = pName.getText();
				int e = Integer.parseInt(ea.getText());
				Date n = sdf.parse(nal.getText());
				
				list.remove(oldVo);
				ProductVo newVo = new ProductVo(s, pC, pN, e, n);
				list.add(newVo);			
				
				status.setText("자료가 수정되었습니다.");
				serial.requestFocus();
				serial.selectAll();
				
			}catch(ParseException ex2) {
				status.setText("날짜 형식은 yyyy-MM-dd 로 해주세요.");
				nal.requestFocus();
				nal.selectAll();
			}
			catch(NumberFormatException ex3) {
				status.setText("수량을 확인해주세요");
				ea.requestFocus();
				ea.selectAll();
			}
		}else {
			status.setText("먼저 검색해주세요");
		}
		
	}
	
	public void delete() {
		if(oldVo != null) {
			System.out.println(oldVo.toString());
			list.remove(oldVo);
			pCode.setText("");
			pName.setText("");
			ea.setText("");
			nal.setText("");
			status.setText("자료가 삭제되었습니다.");
		}else {
			status.setText("먼저 검색후 삭제하시기 바랍니다.");
		}
	
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uAD6C\uBD84");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	private JRadioButton getImBtn() {
		if (ImBtn == null) {
			ImBtn = new JRadioButton("\uC785\uACE0");
			ImBtn.setBounds(77, 6, 57, 23);
			group.add(ImBtn);
			ImBtn.setSelected(true);
		}
		return ImBtn;
	}
	private JRadioButton getExBtn() {
		if (ExBtn == null) {
			ExBtn = new JRadioButton("\uCD9C\uACE0");
			ExBtn.setBounds(131, 6, 57, 23);
			group.add(ExBtn);
		}
		return ExBtn;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC2DC\uB9AC\uC5BC");
			lblNewLabel_1.setBounds(12, 35, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getSerial() {
		if (serial == null) {
			serial = new JTextField();
			serial.setBounds(72, 32, 116, 21);
			serial.setColumns(10);
		}
		return serial;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			btnNewButton.setBounds(200, 31, 69, 23);
		}
		return btnNewButton;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 63, 257, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel_2.setBounds(12, 75, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_3.setBounds(12, 100, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("\uC218\uB7C9");
			lblNewLabel_4.setBounds(12, 125, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("\uB0A0\uC9DC");
			lblNewLabel_5.setBounds(12, 150, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getPCode() {
		if (pCode == null) {
			pCode = new JTextField();
			pCode.setBounds(72, 72, 197, 21);
			pCode.setColumns(10);
		}
		return pCode;
	}
	private JTextField getPName() {
		if (pName == null) {
			pName = new JTextField();
			pName.setBounds(72, 97, 197, 21);
			pName.setColumns(10);
		}
		return pName;
	}
	private JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setBounds(72, 122, 197, 21);
			ea.setColumns(10);
		}
		return ea;
	}
	private JTextField getNal() {
		if (nal == null) {
			nal = new JTextField();
			nal.setBounds(72, 147, 197, 21);
			nal.setColumns(10);
		}
		return nal;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					update();
				}
			});
			btnNewButton_1.setBounds(72, 175, 96, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC0AD\uC81C");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					delete();					
				}
			});
			btnNewButton_2.setBounds(173, 175, 96, 23);
		}
		return btnNewButton_2;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("\uD074\uB9AD");
			lblNewLabel_6.setBounds(12, 179, 57, 15);
		}
		return lblNewLabel_6;
	}
	private JLabel getStatus() {
		if (status == null) {
			status = new JLabel("New label");
			status.setBackground(Color.YELLOW);
			status.setOpaque(true);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setBounds(12, 204, 257, 23);
		}
		return status;
	}
}
