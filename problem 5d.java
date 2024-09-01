public class Problem5d {
    public static void main(String[] args) {
        // Directly inputthe value 3 to 'n'
        int n = 3;

        int i, j, s;

        // Upper part of the diamond
        for (i = n; i >= 1; i--) {
            // Print leading stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //For printing spaces in between
            if (n - i > 0) {
                for (s = 1; s <= (n - i) * 2; s++) {
                    System.out.print(" ");
                }
            }

            // Print trailing stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower part of the diamond
        for (i = 2; i <= n; i++) {
            // Print leading stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // For printimg spaces between
            if (n - i > 0) {
                for (s = 1; s <= (n - i) * 2; s++) {
                    System.out.print(" ");
                }
            }

            // Print trailing stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
