import java.lang.Math;

class quad{
    int a, b, c;
    double d, root1, root2;

    quad(){
       a = b = c = 0;
    }

    quad(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void calculate(){
        int t =0;
        try{
             t = ((b*b) - (4*a*c));
            if(t<0){
                throw new Exception();
            }
        }
        catch(Exception e){
            System.out.println("No real Roots");
        }
        t = Math.abs(t);
        double d = Math.sqrt(t);
        root1 = (-b + d)/2*a;
        root2 = (-b - d)/2*a;
        System.out.println("Root 1: " + root1 + " Root 2:" + root2);
    }
}

class quadEq {
    public static void main(String[] main){
        quad equation = new quad(2, 1, 1);
        equation.calculate();
    }
}
