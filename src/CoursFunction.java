
public class CoursFunction {
    public static void main(String[] args) {

        // System.out.print("HW");

        // variables primitives
        // int, float, double, char, boolean
        int i;
        i = 1;
        float f /* = 0.1 */;
        double d = 0.1;
        char c = 'c';
        boolean b = false;

        // String
        String s;

        System.out.println("i = " + i + ".");
        System.out.println("c = " + c + ".");

        // boucle For

        for (int j = 0; j < 5; j++) {
            System.out.println(j++);
            // break;
        }

        int[] tabInt = { 2, 3, 4 };

        for (int j : tabInt) {
            System.out.println(j);
        }

        // while
        int j = 0;
        while (j < 5) {
            System.out.println("ok : " + j);
            j++;
        }

        int k = 0;
        do {
            System.out.println("ok k : " + k);
        } while (k != 0);

        int l = 0;
        if (l == 0) {
            System.out.println("if l " + l);
            l++;
        } else if (l == 1) {

        } else {
            System.out.println("else l " + l);
        }

        int m = 1;
        switch (m) {
            case 1:
                System.out.print("1");
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
            case 4:
                System.out.print("4");
            default:
                System.out.print("Default");
        }

        int[] tabInt2 = new int[100];
        tabInt2[0] = 1;
        System.out.println(tabInt2);
        // declarer tableau de int a 100 éléments
        // remplir ce tableau de valeur de 0 à 99
        // print chaque nb pair du tableau

        for (int ii = 0; ii < tabInt2.length; ii++) {
            tabInt2[ii] = ii;
            // System.out.println("TabInt2[" + ii + "] : " + tabInt2[ii]);
        }

        for (int iii : tabInt2) {
            if (iii % 2 == 0) {
                System.out.println("TabInt2[" + iii + "] : " + iii);
            }
        }

        System.out.println(add(4, 5, 18));
        System.out.println(multiplication(4, 5));
        System.out.println(soustraction(48, 0));
        System.out.println(division(48, 0));
    }

    public static int add(int a, int b) {
        return a + b;

    }

    public static int add(int a, int b, int c) {
        return a + b + c;

    }

    public static int multiplication(int a, int b) {
        return a * b;

    }

    public static int soustraction(int a, int b) {
        return a - b;

    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Impossible de diviser par 0");
        }
        return (double) a / b;
    }

}
