
public class JPRM2 {

	public static void main(String[] args) {
		String cstr = "ABCBD";
		String sstr = "AB BD";
		int len = cstr.length();
		String nstr = "";
		String mstr = "";
		char ch;
		int n = 0;
		for(int i=0;i<len;i++) {
			if(sstr.charAt(i)==cstr.charAt(i)) {
				n = n + 4;
			}
			else if(sstr.charAt(i)!=cstr.charAt(i) && sstr.charAt(i)!=' ') {
				n = n - 1;
			}
			else if(sstr.charAt(i)==' ') {
				n = n + 0;
			}
		}
		System.out.print(n);
	}

}
