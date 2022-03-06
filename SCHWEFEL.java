import java.util.Scanner;

public class SCHWEFEL {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x[] = new double[30];
    double a[] = new double[30];
    double b[] = new double[30];
    for(int j = 0; j < 10; j++){  //code for running 30 times
    double firstterm = sc.nextDouble();
    double y = 0;
    double sum = 0;
    a[j] = x[0] = firstterm;
    for(int i = 1; i < 30; i++) { //code for calculationg sum of function
       x[i] = x[i-1] + 1.5; 
        sum += x[i-1] * Math.sin(Math.sqrt(Math.abs(x[i-1])));
    }
    y = 418.9829 * 30 - sum;
    b[j] = y;
    System.out.printf("%.3f ", a[j]);
    System.out.printf("%.3f\n", b[j]);
  }
    }
  }