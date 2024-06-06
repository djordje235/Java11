
public class K2 implements I2,I3{
	public K2() {
		interfejs2();
    	interfejs3();
	}

	@Override
	public void interfejs2() {
		System.out.println("K2 implementira I2");
		
	}


	@Override
	public void interfejs3() {
		System.out.println("K2 implementira I3");
		
	}
}
