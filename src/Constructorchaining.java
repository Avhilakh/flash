class Superclass{
//	Superclass(){
//		System.out.println("Parent Constructr");
//	}
//	Superclass(String nstr){
//		System.out.println("Parent String Constructr");
//	}
//
}
class Childclass extends Superclass{
//	Childclass(String str){
//		super("b");
//		System.out.println("Child Constructr");
//	}
//	Childclass(){
//		this("");
//		System.out.println("Child Default Constructr");
//	}
//	Childclass(int x){
//		super("");
//		System.out.println("Child Default Constructr");
//	}
}

public class Constructorchaining {
	public static void main(String[] args) {
		Childclass obj = new Childclass();
	}
}
