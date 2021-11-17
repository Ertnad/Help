import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Logic logic = new Logic();

        Scanner scanner = new Scanner(System.in);

        printResultForTest();

        System.out.println("Введите длину массива: ");
        int l = scanner.nextInt();

        if (l > 1) {
            int[] arr = new int[l];
            System.out.println("Введите элементы массива: ");

            for (int i = 0; i < l; i++) {
                arr[i] = scanner.nextInt();
            }

            logic.Output(arr);
            logic.Solution(arr);
        }

        else{
            System.out.println("Некорректное условие ");
        }
    }

    private static void printResultForTest() {

        Logic logic = new Logic();

        Test[] tests = new Test[4];
        tests[0] = new Test(new int[]{0, 1, 2, 0, -1, -2});
        tests[1] = new Test(new int[]{-1, -7, -2, -5, -3, -8});
        tests[2] = new Test(new int[]{1, 1, 1, 1});
        tests[3] = new Test(new int[]{0, -1, 0, -3, 0, -2, 0, -4});

        for (Test aCase : tests) {
           int[] array = aCase.getArray();
           logic.Output(array);
           logic.Solution(array);
        }
    }

}
