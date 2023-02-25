import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int [] number1 = new int [3];
        number1[0]=1;
        number1[1]=2;
        number1[2]=3;
        double[] number2 = {1.57, 7.654, 9.986};
        byte[] number3 = {3, 2, 6, 8};

        }

    public static void task2() {
        System.out.println("Задача 2");
        int [] number1 = new int [3];
        number1[0]=1;
        number1[1]=2;
        number1[2]=3;
        double[] number2 = {1.57, 7.654, 9.986};
        byte[] number3 = {3, 2, 6, 8};
        System.out.println(number1[0] + "," + number1[1] + "," + number1[2]);
        System.out.println(number2[0] + "," + number2[1] + "," + number2[2]);
        System.out.println(number3[0] + "," + number3[1] + "," + number3 [2] + "," + number3[3]);

    }

    public static void task3() {
        System.out.println("Задача 3");
        int [] number1 = new int [3];
        number1[0]=1;
        number1[1]=2;
        number1[2]=3;
        double[] number2 = {1.57, 7.654, 9.986};
        byte[] number3 = {3, 2, 6, 8};

        for (int i = number1.length - 1; i >=0 ; i--) {
            System.out.print(number1[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = number2.length - 1; i >=0 ; i--) {
            System.out.print(number2[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = number3.length - 1; i >=0 ; i--) {
            System.out.print(number3[i]);
            if (i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int [] number1 = new int [3];
        number1[0]=1;
        number1[1]=2;
        number1[2]=3;

        for (int i = 0; i < number1.length; i++) {
            if (number1[i] % 2 != 0){
                number1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number1));
    }

}