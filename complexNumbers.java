class complex{
    int i, r;
    complex(){
        i=0;
        r=0;
    }

    complex(int i, int r){
        this.i = i;
        this.r = r;
    }

    complex addNumbers(complex num2){
        complex c = new complex();

        c.i = i + num2.i;
        c.r = r + num2.r;

        return c;
    }

    void display(){
        System.out.println("\nCurrent Data: "+i+" "+r+"\n");
    }
}

class complexNumbers{
    public static void main(String[] args){
        complex c1 = new complex(2,3);
        complex c2 = new complex(3,7);

        complex ans = c1.addNumbers(c2);
        ans.display();
    }
}