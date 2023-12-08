public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int j : arr) {
            total += j;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

    }

    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int maxMoney = 100_000;
        int minMoney = 200_000;
        for (int j : arr) {
            if (j > maxMoney) {
                maxMoney = j;
            } else if (minMoney > j) {
                minMoney = j;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей %n", minMoney, maxMoney);

    }

    public static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        double theAverageValue = 0;
        for (int j : arr) {
            theAverageValue += (double) j;
        }
        theAverageValue/=arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n",theAverageValue);
    }

    public static void task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}



