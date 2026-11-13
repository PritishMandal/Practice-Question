import java.util.Scanner;

public class sum {
    public static void main(String[] args){
      
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("value of a: ");
                 int a = sc.nextInt();

            System.out.print("value of b: ");
                 int b = sc.nextInt();

                int sum = a + b;

        
            System.out.println("Sum is: "+ sum);

            sc.close();
        }
             
            

        }
    }
    

