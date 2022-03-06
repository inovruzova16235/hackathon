import java.util.Scanner;

public class ROSENBROCK {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x[] = new double[30];
    double a[] = new double[30];
    double b[] = new double[30];
    for(int j = 0; j < 30; j++){  //code for running 30 times
    double firstterm = sc.nextDouble();
    double y = 0;
    a[j] = x[0] = firstterm;
    for(int i = 1; i < 29; i++) { //code for calculationg sum of function
       x[i] = x[i-1] + 1.5; 
       y += 100 * Math.pow((x[i] - x[i-1] * x[i-1]), 2) + Math.pow(x[i-1] - 1, 2);
    }
    b[j] = y;
    System.out.printf("%.3f ", a[j]);
    System.out.printf("%.3f\n", b[j]);
  }
    }
  }

