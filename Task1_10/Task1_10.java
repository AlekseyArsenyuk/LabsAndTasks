import java.util.Arrays;

public class Task1_10 {
    public static void main(String[] args) {
        remainder(3, 4);                                    //task1
        triArea(10, 10);                        //task2
        animals(2, 3, 5);                  //task3
        profitableGamble(0.9, 3, 2);        //task4
        operation(24, 26, 2);                     //task5
        ctoa('[');                                  //task6
        addUpTo(10);                                 //task7
        nextEdge(5, 7);                                    //task8
        sumOfCubes(new int[]{});                          //task9;
        abcmath(42, 5, 0);                        //task10;
        repeat("nice", 4);                        //task11;
        differenceMaxMin();                                //task12;
        isAvgWhole();                                      //task13;
        cumulativeSum();                                   //task14;
        getDecimalPlaces("3.1");                       //task15;
        Fibonacci(3);                                   //task16;
        isValid("59001");                            //task17;
        isStrangePair("ratio", "orator");                  //task18;
        isPrefix("automation", "auto-");       //task19.1;
        isSuffix("vocation", "-logy");         //task19.2;

        // task20
        System.out.println("hexLattice(1)\n" + hexLattice(1));
        System.out.println("hexLattice(7)\n" + hexLattice(7));
        System.out.println("hexLattice(19)\n" + hexLattice(19));
        System.out.println("hexLattice(21)\n" + hexLattice(21));
    }


    public static int remainder(int num1, int num2) {
        System.out.println("Task1");
        System.out.println(num1 % num2);
        return num1 % num2;
    }

    public static int triArea(int base, int height) {
        System.out.println("\nTask2:");
        System.out.println((base * height) / 2);
        return (base * height) / 2;
    }


    public static int animals(int chickens, int cows, int pigs) {
        System.out.println("\nTask3:");
        int all;
        all = (2 * chickens) + (4 * pigs) + (4 * cows);
        System.out.println("Количество ног: " + all);
        return all;
    }


    public static boolean profitableGamble(double prob, double prize, double pay) {
        System.out.println("\nTask4:");
        if (prob * prize > pay) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }


    public static String operation(int a, int b, int N) {
        System.out.println("\nTask5:");
        if (a + b == N) {
            System.out.println("added");
            return "added";
        } else if (a - b == N || b - a == N) {
            System.out.println("subtracted");
            return "subtracted";
        } else if (a * b == N) {
            System.out.println("multiply");
            return "multiply";
        } else if (a / b == N || b / a == N) {
            System.out.println("division");
            return "division";
        } else {
            System.out.println("none");
            return "none";
        }
    }


    public static int ctoa(char symbol) {
        System.out.println("\nTask6:");
        int ascii = symbol;
        System.out.println(ascii);
        return ascii;
    }


    public static int addUpTo(int num1) {
        System.out.println("\nTask7: ");
        Integer sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
        return sum;
    }


    public static int nextEdge(int num1, int num2) {
        System.out.println("\nTask8: ");
        double edge;
        // Теорема косинусов a2 = b2 + c2 - 2bc * cosγ
        edge = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2) - ((2 * num1 * num2) * Math.cos(179)));
        System.out.println((int) edge);
        return (int) edge;
    }


    public static int sumOfCubes(int[] numArray) {
        System.out.println("\nTask9: ");
        double sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += Math.pow(numArray[i], 3);
        }
        System.out.println((int) sum);
        return (int) sum;
    }

    public static boolean abcmath(int a, int b, int c) {
        System.out.println("\nTask10: ");

        for (int i = 1; i <= b; i++) {
            a += a;
        }
        if (c != 0) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    /**
     * PART 2
     */

    public static String repeat(String str, Integer num) {
        System.out.println("\nTask11");
        str = str.replaceAll(".", "$0".repeat(num));
        System.out.println(str);
        return str;
    }

    public static int differenceMaxMin() {
        System.out.println("\nTask12");
        Integer mass[] = {10, 4, 1, 4, -10, -50, 32, 21};
        Arrays.sort(mass);
        System.out.println(mass[mass.length - 1] - mass[0]);
        return mass[mass.length - 1] - mass[0];
    }

    public static void isAvgWhole() {
        System.out.println("\nTask13");
        Integer[] mass = {9, 2, 2, 5};
        double sum = 0;
        double avg;
        for (int i = 0; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        avg = sum / mass.length;
        if (avg % 1 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void cumulativeSum() {
        System.out.println("\nTask14");
        Integer mass[] = {3, 3, -2, 408, 3, 3};
        for (int i = 1; i < mass.length; i++) {
            mass[i] += mass[i - 1];
        }
        System.out.println(Arrays.deepToString(mass));
    }

    public static void getDecimalPlaces(String str) {
        System.out.println("\nTask15");
        if (str.contains(".")) {
            str = str.substring(str.lastIndexOf('.') + 1);
            System.out.println(str.length());
        } else {
            System.out.println("0");
        }
    }

    public static void Fibonacci(Integer n) {
        System.out.println("\nTask16");
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(b);
    }

    public static void isValid(String word) {
        System.out.println("\nTask17");
        Integer num;
        num = word.length();
        if (num == 5) {
            System.out.println(word.matches("[\\d]+"));
        } else {
            System.out.println("False");
        }
    }

    public static void isStrangePair(String str1, String str2) {
        System.out.println("\nTask18");
        char[] strToArray1 = str1.toCharArray();
        char[] strToArray2 = str2.toCharArray();
        if (str1.length() != 0 && str2.length() != 0) {
            if (strToArray1[0] == strToArray2[strToArray2.length - 1]
                    && strToArray1[strToArray1.length - 1] == strToArray2[0]) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("False");
        }
    }

    public static void isPrefix(String word, String prefix) {
        System.out.println("\nTask 19.1");
        String strNew = prefix.replace("-", "");
        System.out.println(word.matches(strNew + "(.*)"));
    }

    public static void isSuffix(String word, String suffix) {
        System.out.println("\nTask 19.2");
        String strNew = suffix.replace("-", "");
        System.out.println(word.matches("(.*)" + strNew));
    }


    public static String hexLattice(int number) {
        System.out.println("\nTask 20");
        float N_float = (float) ((3 + Math.sqrt(12 * number - 3)) / 6);
        int N = (int) N_float;
        if (Math.abs(N_float - N) > 0)
            return "Invalid";

        String result = "";
        int n_lines = 2 * N - 1;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N - i - 1; j++)
                result += " ";
            for (int j = 0; j < N + i; j++)
                result += " 0";
            for (int j = 0; j < N - i; j++)
                result += " ";
            result += "\n";
        }
        for (int i = N; i < n_lines; ++i) {
            for (int j = 0; j < i - N + 1; j++)
                result += " ";
            for (int j = 0; j < n_lines - i + N - 1; j++)
                result += " 0";
            for (int j = 0; j < i - N + 2; j++)
                result += " ";
            result += "\n";
        }
        return result;
    }
}
