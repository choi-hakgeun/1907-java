package f_inheri;

public class SuperAirPlaneExam {

	public static void main(String[] args) {
		SuperAirPlane s = new SuperAirPlane();
		s.takeoff();
		s.fly();
		s.flyMode = SuperAirPlane.SUPERSONIC;//2
		s.fly();//2
		s.flyMode = SuperAirPlane.NORMAL;//1
		s.fly();//1
		s.land();
	}

}
