import java.util.Scanner;

class Student{
    int idno;
    int rank;
    Scanner scan = new Scanner(System.in);

    Student(){
        idno = 0;
        rank = 0;
    }

    Student(int idno, int rank){
        this.idno = idno;
        this.rank = rank;
    }

    void dispRank(){
        System.out.println("Enter Rank 1 and Rank 2");
        int range1 = scan.nextInt();
        int range2 = scan.nextInt();

        try{
            if(range1 < 0 && range2 < 0){
                throw new Exception();
            }
            else{
                if(rank > range1 && rank < range2){
                    System.out.println("Id no: " + idno);
                    System.out.println("Rank: " + rank);
                }
            }
        }
        catch(Exception e){
            System.out.println("Ranks cannot be less than Zero.");
        }

        try{
            if(range2<range1){
                throw new UnorderedRanks();
            }
        }
        catch(UnorderedRanks e){
            System.out.println(e.toString());
        }
    }
}

class UnorderedRanks extends Exception{

    String msg;

    UnorderedRanks(){
        super();
        msg = "Ranks Order is Incorrect";
    }

    public String toString(){
        return msg;
    }
}

class Q2_a {
    public static void main(String[] args){
        Student[] s1 = new Student[3];

        s1[0] = new Student(12, 2);
        s1[1] = new Student(13, 5);
        s1[2] = new Student(18, 8);

        s1[0].dispRank();
        s1[1].dispRank();
        s1[2].dispRank();
    }
}
