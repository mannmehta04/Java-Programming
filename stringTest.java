public class stringTest {
	public static void main(String[] args){
		String s1 = "mann";
		String s2 = new String("mann");
		String s3 = new String("mann");
		String s4 = "mann";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println(s2 instanceof String);
	}
}
