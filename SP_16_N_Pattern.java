import java.util.*;

public class SP_16_N_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               
                if (j == 1 || j == n || j == i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*
 
For n = 6 --> 

*         * 
* *       * 
*   *     * 
*     *   * 
*       * * 
*         * 


consider NxN matrix (n=4) =>

| * |   |   | * |
| * | * |   | * |
| * |   | * | * |
| * |   |   | * |

*/