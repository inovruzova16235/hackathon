 import java.util.Scanner;

public class Ackley{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res[] = new double[30];
        double arr[] = new double[30];
        double finalY[] = new double[30];
        double finalX[] = new double[30];

        System.out.println("Please enter coefficients a,b,c accordingly");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        for(int j=0;j<30;j++) {
            double sum1 = 0;
            double sum2 = 0;
            System.out.println("Please, enter first term: 1!");
            double firstTerm = sc.nextDouble();
            finalX[j] = arr[0] = firstTerm;
            for (int i = 1; i < 30; i++) {
                arr[i]=arr[i-1]+1.2;
            }
            for (int i = 0; i < 30; i++) {
                sum1 = sum1 + (arr[i]) * (arr[i]);
                sum2 = sum2 + Math.cos(c * (arr[i]));
            }
            double res1 = -1 * a * Math.exp(-1 * b * (Math.sqrt(((double) 1 / 30) * sum1))) - Math.exp(((double) 1 / 30) * sum2) + a + Math.exp(1);
            System.out.println(res1);
            finalY[j] = res1;
            res1=0;

        }
    }

}