
public class Thiskey {
	String type;
	int modelno;
	Thiskey(){}
	Thiskey(Thiskey t1){
		type = "intel";
		System.out.println(this.type);
	}

//	Thiskey(String name, int age) {
//		this(6);// calling another constructor should be first line
//		this(6); you can make only one call to this inside constructor.
//		this.name = name;
//		this.age = age;
//	}
//
//	Thiskey(String name) {
//		this.name = name;
//		age = -1;
//	}
//
//	Thiskey(int age) {
//		name = "unknown";
//		age = age;
//	}

	public static void main(String[] args) {
//		Thiskey obj = new Thiskey("Monica",25);
//		System.out.println(obj.name+":"+obj.age);
//		Thiskey obj1 = new Thiskey("rOHIT");
//		System.out.println(obj1.name+":"+obj1.age);
//		Thiskey obj2 = new Thiskey(258);
//		System.out.println(obj2.name+":"+obj2.age);
		Thiskey obj3 = new Thiskey();
		obj3.type = "AMD";
		Thiskey obj4 = new Thiskey(obj3);
	}

}
