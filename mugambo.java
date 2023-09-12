class ACitizen {
	protected static String name;
	public ACitizen(String s){
		name = s;
	}
	protected String getName(){
		return name;
	}
	
	public static void report(){ 
    	System.out.println("I am" + name);
	}
}

public class mugambo extends ACitizen{
	public static String name;
	public mugambo(String alias, ACitizen c){
		super(c.getName());
		// this.name = alias;
		// this.report();
	}
	public static void report(){ 
		System.out.println("I am" + name);
	}
	public static void main(String[] args) {
		// ACitizen oldme = new ACitizen("Mugambo");
		// ACitizen newme = new mugambo("Durjan Singh", oldme);
		// mugambo m = (mugambo)oldme;
		// newme.report();
	}
}