package z_exam;

public class Child extends MyClass {
	
	public MyClass method1(MyClass mc) {//�������� �� ����ϴ���
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
		//Child c = mc; mc�� �θ���, c�� �ڽ��� �ڽ����� ������ �θ�Ÿ���� ������ �����Ҽ�����.
		c2.method2(c);
		MyClass s = new Child();
		mc.method1(new s());
	}
	//����� ���� �������� ����
	//������ �θ�Ÿ���� ������ �ڽ�Ŭ������ �����Ͽ� �����ϴ�����,
	//���� �ڽ�Ŭ������ �ɹ����� ����� ���� �ڽ�Ŭ���� Ÿ������ ĳ�����ؾ���.
	
	//����ȭ�� ����ϴ� ������ �ڽ�Ÿ�԰� �θ�Ÿ���� �޼��带 ��� ����ϱ�����?
	
	//���������� �ڽ�Ŭ������ �Ļ��Ǿ� �����Ǿ��� �� �θ�Ÿ���� �Ű������� ���� �޼���
	//�ϳ������� ��� �ڽ�Ŭ������ ���޹޾� ����ϱ�����
}
