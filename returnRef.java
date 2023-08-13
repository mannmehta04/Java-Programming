class student{
    int id;
    String name;
    int cpi;
    public student(){
        id=0;
        name=null;
        cpi=0;
    }
    public student(int i,String s,int c) throws Exception{
        id=i;
        name=s;
        try{
            if(c > 10) throw new Exception();
            cpi=c;
        }
        catch(Exception e){
            throw e;
        }
    }
    public void print(){
        System.out.println("Student id is:= " + id);
        System.out.println("Student name is:= " + name);
        System.out.println("Student cpi is:= " + cpi);
    }
}

class returnRef {
    public static student create_student(int i,String s,int c){
        student s1 = new student();
        try{
            return new student(i,s,c);
        }
        catch(Exception e){
            System.out.println("Exception generated ::::::: " + e );
            return s1;
        }
        
    }
    public  static void show_student(student obj){
        obj.print();
    }
    public static void main(String[] args) {
        student s ;
        
            s = create_student(13,"Joshepin",10);
            show_student(s);
        
    }
}

