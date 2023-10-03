public class f1 {
	public static void main(String[] args){
		System.out.println("hello 1");
		f2.main(args);
	}
}

class f2 {
	public static void main(String[] args){
		System.out.println("hello 2");
	}
}

