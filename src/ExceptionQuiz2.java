
class Error extends Exception{
	
}
public class ExceptionQuiz2 {
	void method() throws Exception {
		throw new Error();
	}
	public static void main(String[] args) {
		ExceptionQuiz2 obj = new ExceptionQuiz2();
		try {
			obj.method();
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("Continue");
	}
}
