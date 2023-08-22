class student{

    String name;
    String id;

    student(){
        name=null;
        id=null;
    }

    student(String name, String id){
        this.name = name;
        this.id = id;
    }
}

class details extends student{

    int rank;
    double spi;

    details(){
        rank = 0;
        spi = 0;
    }

    details(String name, String id, int rank, double spi){
        super(name, id);
        this.rank = rank;
        this.spi = spi;
    }

    void display(){
        System.out.println("Student Details:");
        System.out.println("Name: "+ name);
        System.out.println("Id: "+ id);
        System.out.println("Rank: "+ rank);
        System.out.println("SPI: "+ spi + "\n");
    }

    void display(details arr[]){
        for(int i=0; i<arr.length;i++){
            arr[i].display();
        }
    }

    void update(double spi){
        this.spi = spi;
        System.out.println("Your Spi updated to " + spi);
    }

    boolean exists(String name){
        if(this.name.equals(name))
            return true;
        else
            return false;
    }

    int getRank(){
        return rank;
    }

    double getSpi(){
        return spi;
    }

    void searchStatic(details arr[]){
        System.out.println("8.5 SPI Students:\n");
        for(int i=0;i<arr.length;i++){
            if(arr[i].getSpi() == 8.5){
                arr[i].display();
            }
        }
    }

    void searchRank(details arr[]){
        System.out.println("Top 2 Students:\n");
        for(int i=0;i<arr.length;i++){
            if(arr[i].getRank() < 3){
                arr[i].display();
            }
        }
    }
}

class studentInfo{
    public static void main(String[] args){
        System.out.println();
        // details s = new details("Mann", "22CP312", 1, 9.2);
        // s.display();

        details[] s1 = new details[4];
        details list = new details();

        s1[0] = new details("Mann", "22CP312", 3, 9.2);
        s1[1] = new details("Karma", "22CP304", 4, 8.5);
        s1[2] = new details("Priya", "22CP302", 1, 9.5);
        s1[3] = new details("Shivraj", "22CP303", 2, 9.7);

        list.searchStatic(s1);
        list.searchRank(s1);

        // s1[0].display();
    }
}