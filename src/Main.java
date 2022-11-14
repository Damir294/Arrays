public class Main {

    public static void main(String[] args)
    {
        // ЗАдание 1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        double[] arr3 = {72.523, 68.4, 57.9, 80.12};
        System.out.println();
    }

    public static void main(String[] args) {
        // Задание 2

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.println(arr2[i]);
            }
        }

        double[] arr3 = {72.523, 68.4, 57.9, 80.12};
        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.println(arr3[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Задание 3

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.println(arr2[i]);
            }
        }

        double[] arr3 = {72.523, 68.4, 57.9, 80.12};
        for (int i = 3; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.println(arr3[i]);
            }
        }
        System.out.println();
    }

    {
        public static void main(String[] args)
        // Задание 4
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (arr1[i] % 2 == 1) {
                arr1[i] += 1;
            } else {
                arr1[i] = arr1[i];
            }
            if (i < 2) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }
    }
}