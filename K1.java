
public class K1 implements I1,I2 {
    public K1() {
    	interfejs1();
    	interfejs2();
    }

	@Override
	public void interfejs2() {
		System.out.println("K1 implementira I2");
		
	}

	@Override
	public void interfejs1() {
		System.out.println("K1 implementira I1");
		
	}
    
}
