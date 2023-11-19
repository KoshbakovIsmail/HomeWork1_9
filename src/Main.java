import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArry();
        int totalSum = 0;
        int numberDay = 30;
        int maxSum = arr[0];
        int minSum = arr[0];
        double averageSum = arr[0];
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        test1(totalSum, numberDay, arr);
        test2(totalSum, numberDay, maxSum, minSum, arr);
        test3(totalSum, arr, numberDay, averageSum);
        test4(reverseFullName);
    }

    public static int[] generateRandomArry() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;

        }
        return arr;

    }
    public static void test1(int totalSum, int numberDay, int[] arr) {
        System.out.println("           Задача№1");
        System.out.println(Arrays.toString(arr));
        for (int day = 1; day <= numberDay; day++) {
            System.out.println("День №" + day + " - " + arr[day - 1]);
            totalSum += arr[day - 1];
        }
        System.out.println("Сумма трат за 30 дней Итого - " + totalSum);
    }

    public static void test2(int totalSum, int numberDay, int maxSum, int minSum, int[] arr) {
        System.out.println("           Задача№2");
        System.out.println(Arrays.toString(arr));
        for (int payments = 1; payments <= numberDay; payments++) {
            System.out.println("Выплата №" + payments + " - " + arr[payments - 1]);
            totalSum += arr[payments - 1];
        }
        System.out.println("Сумма выплат за сегоднещней день Итого - " + totalSum);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма выплаты за день - " + maxSum);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма выплаты за день - " + minSum);
    }

    public static void test3(int totalSum, int[] arr, int numberDay, double averageSum) {
        System.out.println("           Задача№3");
        System.out.println(Arrays.toString(arr));

        for (int day = 1; day <= numberDay; day++) {
            System.out.println("день №" + day + " - " + arr[day - 1]);
            totalSum += arr[day - 1];
        }
        System.out.println("Итого - " + totalSum);
        averageSum = Arrays.stream(arr).average().getAsDouble();
        String numberFormat = String.format("%.2f", averageSum);
        System.out.println("Средная сумма трат за месяц - " + numberFormat);
    }

    public static void test4(char[] reverseFullName) {
        System.out.println("           Задача№4");
        System.out.println(Arrays.toString(reverseFullName) + " Ошибка!");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}



