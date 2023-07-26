import java.util.Scanner;

class matrix{
    int matrixArr[][];
    int m,n;
    Scanner scan = new Scanner(System.in);

    matrix(){
        m=0;
        n=0;
        matrixArr = new int[m][n];
    }

    matrix(int m, int n){
        this.m = m;
        this.n = n;
        matrixArr = new int[m][n];
    }

    void getData(){
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                System.out.print("Matrix ["+i+"]["+j+"]=");
                matrixArr[i][j] = scan.nextInt();
            }
        }
        System.out.println();
    }

    void add_matrix(matrix m1, matrix m2){
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                this.matrixArr[i][j]=m1.matrixArr[i][j]+m2.matrixArr[i][j];
            }
        }
    }

    void find_transpose(matrix m1){
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                this.matrixArr[i][j]=m1.matrixArr[i][j];
            }
        }
    }

    void display(){
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                System.out.print("Matrix ["+i+"]["+j+"]="+this.matrixArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class matrixTranspose {
    public static void main(String[] args){
        matrix m1 = new matrix(2, 2);
        matrix m2 = new matrix(2, 2);
        matrix m3 = new matrix(2, 2);

        m1.getData();
        m2.getData();

        m3.find_transpose(m1);
        m3.display();

        m3.add_matrix(m1, m2);
        m3.display();
    }
}