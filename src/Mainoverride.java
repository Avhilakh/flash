
class Parent {
	int x;
	int y;
	Parent(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x);
		System.out.println(y);
	}
	public void passbyval(int x, int y) {
		x=x;
		y=y;	
	}
	public void showval() {
		System.out.println(x);
		System.out.println(y);
	}

//	public A method(int a) {
//		System.out.println("not overridden");
//		return new A();
//	}

	int show() {
		return 0;
	}

//	static void methodA() {
//		System.out.println("Parents Method");
//	}
}

class Child extends Parent {

	Child(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public B method(int b) {
		System.out.println("overridden");
		return new B();
	}

	void show(int a) {

	}

	static void methodA() {
		System.out.println("Child Method");
	}
}

public class Mainoverride {
	public static void main(String[] args) {
//		Child obj = new Child();
//		obj.method(1);
//		Parent.methodA();
//		obj.methodA();
//		Child.methodA();
//		A obj2=null;
//		A obj1 = new A();
//		obj1.display(null);
//		System.out.println(obj2);
		Parent obj3 = new Parent(1, 2);
		//obj3.passbyval(3, 4);
		obj3.showval();
	}
}

class A {
	public void display(Object a) {
		System.out.println("Object Displayed");
	}
	public void display(String a1, String a2) {
		System.out.println("Second String Displayed");
	}
	public void display(String a) {
		System.out.println("String Displayed");
	}

	
	public void display(int a) {
		System.out.println("Primitive Displayed");
	}
}

class B extends A {

}
//benefit of overriding
//to achieve dynamic binding we do function overriding
//static method can only overloaded not overrided.