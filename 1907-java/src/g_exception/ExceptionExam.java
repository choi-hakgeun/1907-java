package g_exception;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ExceptionExam {

	public static void main(String[] args) {
		// nullPointerException
		String data = "";
		try { // try catch는 어센딩 형태로 실행되어야함.
			System.out.println(data.toString());
			System.out.println("오류가 없는 경우 실행됨.");

		} catch (NullPointerException ex2) { // (Exception ex) 오류종류의 상관없이 사용됨.

			System.out.println("Null Pointer Error !!!");
			ex2.printStackTrace(); // 오류메세지가 콘솔에 출력

		} catch (Exception ex) { // 오류종류의 상관없이 사용됨.
			System.out.println("Null Pointer Error !!!");

		} finally {
			System.out.println("오류발생과 상관없이 무조건 실행.");
		}

		// ArrayIndexOutOfBoundsException(첨자오류)
		int[] s = { 1, 2, 3 };

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(s[i]);
			}

			System.out.println(data.toString());
			System.out.println("오류없음");

		} catch (ArrayIndexOutOfBoundsException ex) {

			System.out.println(data.toString());
			System.out.println("첨자오류");

		} catch (Exception ex) {
			ex.printStackTrace();

			System.out.println("Exception ex2");
			System.out.println(data.toString());
			
		} finally {
			System.out.println("상관없음");
		}
		// NumberFormatException
		try {
			data = "123 ";
			int su = Integer.parseInt(data);// (o)
		}catch(NumberFormatException ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("다음 처리가 진행됨.");
		}	
		

		// ClassCastException(형변환 오류)
		try {
			Car myCar = new Car();
			SportsCar c = (SportsCar)myCar;
		}catch(Exception ex) {
			System.out.println("형 변환 오류가 발생");
		}finally {
			System.out.println("끝~~~~");
		}

	}

}
