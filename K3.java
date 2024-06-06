
public class K3 implements I1,I3 {
     public K3() {
    	interfejs1();
     	interfejs3();
     }

	@Override
	public void interfejs3() {
		System.out.println("K3 implementira I3");
		
	}

	@Override
	public void interfejs1() {
		System.out.println("K3 implementira I1");
		
	}
     
}
