
/**
 * Dylan Klingensmith
 * CH7PC6 - Quarterly Sales Statistics
 * AP Computer Science
 * 1/7/19
 */

import java.util.Scanner;

public class QuarterlySales {

    public static void main(String[] args) {

        //Establish scanner, array, and variables
        double[][] quarterlySales = new double[6][4];

        Scanner keyboard = new Scanner(System.in);
        double input;

        //Get the quarterly sales of six divisions from user
        for (int r = 0; r < quarterlySales.length; r++) {

            for (int c = 0; c < quarterlySales[r].length; c++) {

                System.out.print("\nGet the sales of Division " + (r + 1)
                        + " during Quarter " + (c + 1) + ".");

                input = keyboard.nextDouble();
                
                while (input < 0)   {
                    
                    System.out.println("Do not input a negative value for "
                            + "sales.");
                    input = keyboard.nextDouble();
                    
                }
                
                quarterlySales[r][c] = input;

            }

        }

        //Print the sales figures by division - row major order
        for (int r = 0; r < quarterlySales.length; r++) {

            System.out.println("Division " + (r + 1) + ":");

            for (int c = 0; c < quarterlySales[r].length; c++) {

                System.out.println("Q" + (c + 1) + "\t$" + quarterlySales[r][c]);

            }

        }
        
        System.out.println("");

        //Print the total sales of the company by quarter - column major order
        for (int c = 0; c < quarterlySales[0].length; c++) {

            int total = 0;

            for (int r = 0; r < quarterlySales.length; r++) {

                total += quarterlySales[r][c];
            
            }
            
            System.out.println("Q" + (c + 1) + " Sales:\t$" + total);
            
        }
        
        System.out.println("");
        
        //Print the average sales of the company per quarter - column major order
        for (int c = 0; c < quarterlySales[0].length; c++)  {
            
            int total = 0;
            double average = 0;
            
            for (int r = 0; r < quarterlySales.length; r++) {
                
                total += quarterlySales[r][c];
                
            }
            
            average = (double) total/6;
            
            System.out.println("Q" + (c + 1) + " Average:\t$" + average);
            
        }
        
        System.out.println("");
        
        //Print the division with the highest sales for each quarter - column major order
        for (int c = 0; c < quarterlySales[0].length; c++)  {
            
            double highestSales = 0;
            int bestDivision = 0;
            
            for (int r = 0; r < quarterlySales.length; r++)   {
                
                if (quarterlySales[r][c] > highestSales)    {
                    
                    highestSales = quarterlySales[r][c];
                    bestDivision = r + 1;
                    
                }
                
            }
            
            System.out.println("Division " + bestDivision + " had the best"
                    + " sales during Quarter " + (c + 1) + ".");
            
        }

    }

}
