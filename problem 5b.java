class Problem5b { 
    public static void main(String[] args) { 
        int i, j;

        //For the value a=3
        int n = 3; 

        // For rows
        for(i = 1; i <= n; i++) {
            
            // the number of spaces before every star
            for (j = 2 * (n - i); j >= 0; j--) {  
                System.out.print(" ");   
            }   

            // For the number of stars in each row
            for(j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();  
        }
    }
}
