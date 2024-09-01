public class Problem5c { 

    public static void main(String[] args) {
    
        int rows = 3; 
        //row=3 because half of the diamond is of 3 rows a
        
        // forthe upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            
            //for spaces before the stars at decreasing way
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars (increasing for upper half)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }

        //for the lower half of the diamond
        for (int i = 1; i <= rows - 1; i++) {
            
            // for spaces before the stars at increasing way
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Print stars (decreasing for lower half)
            for (int j = 1; j <= 2 * (rows - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            // Moves to next line after each row
        }
    }
}
