import java.util.Scanner;

public class Rastrigin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res[] = new double[30];
        double arr[] = new double[30];
        double finalY[] = new double[30];
        double finalX[] = new double[30];

        for(int j=0;j<5;j++) {
            double sum = 0;
            System.out.println("Please, enter first term!");
            double firstTerm = sc.nextDouble();
            finalX[j] = arr[0] = firstTerm;
            for (int i = 1; i < 30; i++) {
                arr[i]=arr[i-1]+1.2;
            }
            for (int i = 0; i < 30; i++) {
                sum = sum + ((arr[i]*arr[i])-10*Math.cos(2*Math.PI*arr[i]));

            }
            double res1 =10*30+sum;
            System.out.println(res1);
            finalY[j] = res1;
            res1=0;

        }
    }

}
