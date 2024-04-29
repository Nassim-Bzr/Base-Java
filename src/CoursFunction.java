public class CoursFunction {
    public static void main(String[] args) {

        // System.out.print("HW");

        // variables primitives
        // int, float, double, char, boolean
        int i; // Déclaration de la variable entière i
        i = 1; // Initialisation de la variable i avec la valeur 1
        float f /* = 0.1 */; // Déclaration de la variable flottante f
        double d = 0.1; // Déclaration et initialisation de la variable double d avec la valeur 0.1
        char c = 'c'; // Déclaration et initialisation de la variable caractère c avec la valeur 'c'
        boolean b = false; // Déclaration et initialisation de la variable booléenne b avec la valeur false

        // String
        String s; // Déclaration de la variable de type String s

        System.out.println("i = " + i + "."); // Affichage de la valeur de i
        System.out.println("c = " + c + "."); // Affichage de la valeur de c

        // boucle For

        for (int j = 0; j < 5; j++) { // Boucle for de 0 à 4
            System.out.println(j++); // Affichage de la valeur de j et incrémentation de j
            // break;
        }

        int[] tabInt = { 2, 3, 4 }; // Déclaration et initialisation d'un tableau d'entiers tabInt

        for (int j : tabInt) { // Boucle for each pour parcourir les éléments du tableau tabInt
            System.out.println(j); // Affichage de chaque élément du tableau
        }

        // while
        int j = 0; // Déclaration et initialisation de la variable j avec la valeur 0
        while (j < 5) { // Boucle while tant que j est inférieur à 5
            System.out.println("ok : " + j); // Affichage de la valeur de j
            j++; // Incrémentation de j
        }

        int k = 0; // Déclaration et initialisation de la variable k avec la valeur 0
        do { // Boucle do-while qui s'exécute au moins une fois
            System.out.println("ok k : " + k); // Affichage de la valeur de k
        } while (k != 0); // Condition de sortie de la boucle

        int l = 0; // Déclaration et initialisation de la variable l avec la valeur 0
        if (l == 0) { // Condition if pour vérifier si l est égal à 0
            System.out.println("if l " + l); // Affichage si la condition est vraie
            l++; // Incrémentation de l
        } else if (l == 1) { // Condition else if pour vérifier si l est égal à 1

        } else { // Condition else pour les autres cas
            System.out.println("else l " + l); // Affichage si les conditions précédentes sont fausses
        }

        int m = 1; // Déclaration et initialisation de la variable m avec la valeur 1
        switch (m) { // Structure switch pour effectuer différentes actions en fonction de la valeur
                     // de m
            case 1: // Cas où m est égal à 1
                System.out.print("1"); // Affichage du texte "1"
            case 2: // Cas où m est égal à 2
                System.out.print("2"); // Affichage du texte "2"
                break; // Sortie du switch
            case 3: // Cas où m est égal à 3
                System.out.print("3"); // Affichage du texte "3"
            case 4: // Cas où m est égal à 4
                System.out.print("4"); // Affichage du texte "4"
            default: // Cas par défaut
                System.out.print("Default"); // Affichage du texte "Default"
        }

        int[] tabInt2 = new int[100]; // Déclaration et création d'un tableau d'entiers tabInt2 avec une taille de 100
        tabInt2[0] = 1; // Assignation de la valeur 1 à la première case du tableau
        System.out.println(tabInt2); // Affichage du tableau

        for (int ii = 0; ii < tabInt2.length; ii++) { // Boucle for pour remplir le tableau de valeurs de 0 à 99
            tabInt2[ii] = ii; // Assignation de la valeur ii à chaque case du tableau
            // System.out.println("TabInt2[" + ii + "] : " + tabInt2[ii]);
        }

        for (int iii : tabInt2) { // Boucle for each pour parcourir les éléments du tableau tabInt2
            if (iii % 2 == 0) { // Condition pour vérifier si l'élément est pair
                System.out.println("TabInt2[" + iii + "] : " + iii); // Affichage des éléments pairs du tableau
            }
        }

        System.out.println(add(4, 5, 18)); // Appel de la méthode add avec 3 arguments et affichage du résultat
        System.out.println(multiplication(4, 5)); // Appel de la méthode multiplication avec 2 arguments et affichage du
                                                  // résultat
        System.out.println(soustraction(48, 0)); // Appel de la méthode soustraction avec 2 arguments et affichage du
                                                 // résultat
        System.out.println(division(48, 0)); // Appel de la méthode division avec 2 arguments et affichage du résultat
    }

    public static int add(int a, int b) { // Méthode pour additionner deux entiers
        return a + b; // Retourne la somme des deux entiers

    }

    public static int add(int a, int b, int c) { // Méthode pour additionner trois entiers
        return a + b + c; // Retourne la somme des trois entiers

    }

    public static int multiplication(int a, int b) { // Méthode pour multiplier deux entiers
        return a * b; // Retourne le produit des deux entiers

    }

    public static int soustraction(int a, int b) { // Méthode pour soustraire deux entiers
        return a - b; // Retourne la différence des deux entiers

    }

    public static double division(int a, int b) { // Méthode pour diviser deux entiers
        if (b == 0) { // Vérifie si le diviseur est égal à 0
            System.out.println("Impossible de diviser par 0"); // Affiche un message d'erreur
        }
        return (double) a / b; // Retourne le quotient des deux entiers en tant que double
    }

    public static void printTab1d(int[] tab1dToPrint) {
        for (int element : tab1dToPrint) {
            System.Out.println(element);
        }
    }
}
