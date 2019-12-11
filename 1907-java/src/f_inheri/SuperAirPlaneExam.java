package f_inheri;

public class SuperAirPlaneExam {

	public static void main(String[] args) {
		SuperAirPlane s = new SuperAirPlane();
		s.takeoff();
		s.fly();
		s.flyMode = SuperAirPlane.SUPERSONIC;
		s.fly();
		s.flyMode = SuperAirPlane.NORMAL;
		s.fly();
		s.land();
	}

}
