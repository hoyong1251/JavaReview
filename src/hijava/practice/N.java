package hijava.practice;

public class N {
	
	int x = 10;
	int y=20;
	
	public void swap() {
		int tmp = this.x;
		this.x = this.y;
		this.y = tmp;
	}

	public static void main(String[] args) {
		N n = new N();
		System.out.println("x="+n.x);
		System.out.println("y="+n.y);
		
		n.swap();
		System.out.println("===============");
		
		System.out.println("x="+n.x);
		System.out.println("y="+n.y);
	}

}
