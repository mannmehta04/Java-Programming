import java.util.Vector;
import java.util.Collections;

class cricketer{
	// stat = 0 - batsman, 1 - bowler, 2 - allrounder
	int pid, stat, age;
	String name;
	Vector<Integer> ranked = new Vector<Integer>();

	cricketer(){
		pid = stat = -1;
		name = null;
	}

	cricketer(int pid, int stat, int age, String name){
		this.pid = pid;
		this.stat = stat;
		this.age = age;
		this.name = name;
	}

	String getForm(int form){
		if(form == 0)
			return "T20";
		else if(form == 1)
			return "ODI";
		else
			return "TEST";
	}
}

abstract class performance extends cricketer{

	//form = 0 - ODI, 1 - T20, 2 - TEST
	int form, wickets, catches, runs, balls;

	performance(){
		super();
		form = wickets = catches = runs = -1;
	}

	performance(int pid, int stat, int age, String name, int form, int wickets, int catches, int runs, int balls){
		super(pid, stat, age, name);
		this.form = form;
		this.wickets = wickets;
		this.catches = catches;
		this.runs = runs;
		this.balls = balls;
	}
	
	abstract double calculateStrikeRate();
	abstract double calculateWicketHaul();
	abstract int calculateRank();
	abstract void displayInfo();
	abstract void displayStat();
}

class t20 extends performance{
	int rank, overs, sixes;
	double strikeRate, wicketHauls;

	t20(){
		super();
		rank = sixes = -1;
		overs = 20;
	}

	t20(int pid, int stat, int age, String name, int from, int wickets, int catches, int runs, int balls, int sixes){
		super(pid, stat, age, name, from, wickets, catches, runs, balls);
		this.sixes = sixes;
	}

	@Override
	double calculateStrikeRate() {
		return((runs / (double) balls) * 100);
	}

	@Override
	double calculateWicketHaul() {
		return((wickets / (double) overs) * 100);
	}

	@Override
	int calculateRank() {
		double strikeRateWeight = 0.5; 	// Weight for strike rate
		double runsWeight = 0.4;       	// Weight for runs
        double wicketWeight = 0.3;      // Weight for form
        double oversWeight = 0.2;      	// Weight for overs
        double sixesWeight = 0.4;      	// Weight for sixes
        
        double rank = (strikeRate * strikeRateWeight)
					+ (runs * runsWeight)
                    + (wickets * wicketWeight)
                    + (overs * oversWeight)
                    + (sixes * sixesWeight);
        rank = Math.ceil(rank);
		ranked.add((int)rank);
		Collections.sort(ranked);
		return ranked.indexOf((int)rank)+1;
	}

	@Override
	void displayInfo() {
		System.out.println();
		System.out.println("Selected Player Details: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Playing Format: "+getForm(form));
	}

	@Override
	void displayStat() {
		System.out.println();
		System.out.println("Selected Player Details: ");
		System.out.println("Name: "+name);
		System.out.println("Rank: "+ calculateRank());
		System.out.println("Runs: "+ runs);
		System.out.println("Wicket: "+ wickets);
		System.out.println("Catches: "+ catches);
		System.out.println("Sixes Hit: "+ sixes);
		System.out.println("Strike Rate: "+ calculateStrikeRate());
		System.out.println("Wicket Taking Ratio: "+ calculateWicketHaul());
	}
	
}

class odi extends performance{
	int rank, overs, century;
	double strikeRate, wicketHauls;

	odi(){
		super();
		rank = century = -1;
		overs = 50;
	}

	odi(int pid, int stat, int age, String name, int from, int wickets, int catches, int runs, int balls, int century){
		super(pid, stat, age, name, from, wickets, catches, balls, runs);
		this.century = century;
	}

	@Override
	double calculateStrikeRate() {
		return((runs / (double) balls) * 100);
	}

	@Override
	double calculateWicketHaul() {
		return((wickets / (double) overs) * 100);
	}

	@Override
	int calculateRank() {
		double strikeRateWeight = 0.3; 	// Weight for strike rate
		double runsWeight = 0.3;      	// Weight for runs
        double wicketWeight = 0.3;    	// Weight for form
        double oversWeight = 0.5;      	// Weight for overs
        double centuryWeight = 0.4;		// Weight for sixes
        
        double rank = (strikeRate * strikeRateWeight)
					+ (runs * runsWeight)
                    + (wickets * wicketWeight)
                    + (overs * oversWeight)
                    + (century * centuryWeight);
        rank = Math.ceil(rank);
		ranked.add((int)rank);
		Collections.sort(ranked);
		return ranked.indexOf((int)rank)+1;
	}

	@Override
	void displayInfo() {
		System.out.println("Selected Player Details: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Playing Format: "+getForm(form));
	}

	@Override
	void displayStat() {
		System.out.println("Selected Player Details: ");
		System.out.println("Name: "+name);
		System.out.println("Rank: "+ calculateRank());
		System.out.println("Runs: "+ runs);
		System.out.println("Wicket: "+ wickets);
		System.out.println("Catches: "+ catches);
		System.out.println("Centuries: "+ century);
		System.out.println("Strike Rate: "+ calculateStrikeRate());
		System.out.println("Wicket Taking Ratio: "+ calculateWicketHaul());
	}

}

class test extends performance{
	int rank, overs, maidenOvers;
	double strikeRate, wicketHauls;

	test(){
		super();
		rank = maidenOvers = -1;
		overs = 450;
	}

	test(int pid, int stat, int age, String name, int from, int wickets, int catches, int runs, int balls, int maidenOvers){
		super(pid, stat, age, name, from, wickets, catches, balls, runs);
		this.maidenOvers = maidenOvers;
	}

	@Override
	double calculateStrikeRate() {
		return((runs / (double) balls) * 100);
	}

	@Override
	double calculateWicketHaul() {
		return((wickets / (double) overs) * 100);
	}

	@Override
	int calculateRank() {
		double strikeRateWeight = 0.2; 	// Weight for strike rate
		double runsWeight = 0.2;       	// Weight for runs
        double wicketWeight = 0.3;		// Weight for form
        double oversWeight = 0.9;      	// Weight for overs
        double maidenOversWeight = 0.4;	// Weight for sixes
        
        double rank = (strikeRate * strikeRateWeight)
					+ (runs * runsWeight)
                    + (wickets * wicketWeight)
                    + (overs * oversWeight)
                    + (maidenOvers * maidenOversWeight);
        rank = Math.ceil(rank);
		ranked.add((int)rank);
		Collections.sort(ranked);
		return ranked.indexOf((int)rank)+1;
	}

	@Override
	void displayInfo() {
		System.out.println("Selected Player Details: ");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Playing Format: "+getForm(form));
	}

	@Override
	void displayStat() {
		System.out.println("Selected Player Details: ");
		System.out.println("Name: "+name);
		System.out.println("Rank: "+ calculateRank());
		System.out.println("Runs: "+ runs);
		System.out.println("Wicket: "+ wickets);
		System.out.println("Catches: "+ catches);
		System.out.println("Maiden Overs: "+ maidenOvers);
		System.out.println("Strike Rate: "+ calculateStrikeRate());
		System.out.println("Wicket Taking Ratio: "+ calculateWicketHaul());
	}

}

class cricketData {
	public static void main(String[] args){
		t20 p1 = new t20(01, 0, 32, "Virat Kohli", 0, 0, 28, 5876, 6579 , 298);
		p1.displayInfo();
		p1.displayStat();
	}
}

/* 
	tree structure be like:

		cricketer
			|
		performance
		|	|	|
		t20	odi	test

	particular player information:
		pid, stat, name, form, wickets, catches, runs, sixes
*/