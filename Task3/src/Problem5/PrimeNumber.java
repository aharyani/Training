package Problem5;

public class PrimeNumber {

    static void primeNumber(int num) {
        int flag;
        int count = 0;
        for (int i = 2; i < num; i++) {
            flag = 1;

            for (int j = 2; j < i; j++) {
                System.out.println(i+"  "+ j + "   ");
                if (i % j == 0) {

                    flag = 0;
                    break;
                }
                System.out.println(j);
            }
            if (flag == 1) {
                count++;
            }
        }
        System.out.println("Total Prime Number till "+ (num-1) +" is "+ count);
    }
}