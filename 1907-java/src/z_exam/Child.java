package z_exam;

public class Child extends MyClass {
	
	public MyClass method1(MyClass mc) {//다형성을 왜 사용하는지
		MyClass m = new MyClass();
		return m;
	}
	
    public Child method2(Child d) {
    	Child myC = new Child();
    	return myC;
    }
	public static void main(String[] args) {
		MyClass mc = new Child(); 
		Child c = (Child)mc;
		
		Child c2 = new Child();
		
		c2.method1(mc); //MyClass mc = mc;, MyClass mc = c2;
		c2.method2(c);
		
		c2.method2(mc); 
		//Child c = mc; mc는 부모형, c는 자식형 자식형의 변수에 부모타입의 변수를 대입할수없다.
		c2.method2(c);
		MyClass s = new Child();
		mc.method1(new s());
	}
	//상속을 통해 다형성을 구현
	//다형성 부모타입의 변수에 자식클래스를 생성하여 대입하는형태,
	//추후 자식클래스의 맴버들을 사용할 때는 자식클래스 타입으로 캐스팅해야함.
	
	//다형화를 사용하는 이유는 자식타입과 부모타입의 메서드를 모두 사용하기위해?
	
	//여러형태의 자식클래스가 파생되어 생성되었을 때 부모타입의 매개변수를 갖는 메서드
	//하나만으로 모든 자식클래스를 전달받아 사용하기위해
}
