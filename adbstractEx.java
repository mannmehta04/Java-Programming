abstract class Employee{
    int id,sal;

    Employee(){
        id = 0;
        sal = 0;
    }

    Employee(int id, int sal){
        this.id = id;
        this.sal = sal;
    }

    abstract void disp();

    int getSal(){
        return sal;
    }
}

class Manager extends Employee{

    String dept;

    Manager(){
        dept = null;
    }

    Manager(int id, int sal, String dept){
        super(id, sal);
        this.dept = dept;
    }

    void disp() {
        System.out.println("ID: " + id);
        System.out.println("Salary: " + sal);
        System.out.println("Manager of " + dept + " department.");
    }
}

class HR extends Employee{
    int exp;

    HR(){
        exp = 0;
    }

    HR(int id, int sal, int exp){
        super(id, sal);
        this.exp = exp;
    }

    void disp(){
        System.out.println("ID: " + id);
        System.out.println("Salary: " + sal);
        System.out.println("HR with experience of " + exp + " years.");
    }
}

class adbstractEx {
    public static void main(String[] args){
        System.out.println("HR Details:");
        HR h1 = new HR(1, 200000, 5);
        h1.disp();

        System.out.println("Manager Details:");
        Manager m1 = new Manager(2, 350000, "Computer");
        m1.disp();
    }
}