package f_inheri;

public class SuperAirPlane extends AirPlane { //자식이 만들어지기 전에 항성 부모가 먼저 우선생성됨

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	public SuperAirPlane() {
		super(50);
		System.out.println("초음속 비행기");
	}
	
	@Override
	public void fly() {
		if (flyMode == NORMAL) {
			super.fly();			
		}else{
			System.out.println("초음속비행");
		}
	}

}
