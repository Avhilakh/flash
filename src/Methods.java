
public class Methods {

	

	public static void main(String[] args) {
		Initial i1 = new Initial(3,7);
		Initial i2 = new Initial(1,2);
		Initial i3 = new Initial(8,5);
		Methods obj = new Methods();
		i2.changevalue(i1);
		i1.changevalue(i3);
		i3.changevalue(i2);
		
		System.out.println(i1.x+","+i1.y);
		System.out.println(i2.x+","+i2.y);
		System.out.println(i3.x+","+i3.y);
	}

}

class Initial {
	int x;
	int y;

	Initial(int x1, int y1) {
		
			x = x1;
			y = y1;
	}
	public void changevalue(Initial c) {
		this.x = this.x+ c.x;
		this.y = this.y+ c.y;
}

class Change{
	
	}
}