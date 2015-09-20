import java.util.*;
import java.io.*;


public class Lab04
{
    static Scanner console = new Scanner(System.in);
    
    
           
    public static void main(String[] args) throws FileNotFoundException
        {
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        double mean = 0, stdDev = 0;
        int count;
        mean = Lab04.computeMean(mean);
        stdDev = Lab04.computeStandardDeviation(stdDev);
        System.out.printf("Input: ");
        for(count = 0; inFile.hasNext(); count++)
                {
                System.out.printf("%.2f ", inFile.nextDouble());
                
                }
        System.out.println();
        System.out.printf("Mean: ");
        System.out.printf("%.2f", mean);
        System.out.println();
        System.out.printf("Standard Deviation: ");
        System.out.printf("%.2f", stdDev);
        
        }
    
    public static double computeMean(double mean) throws FileNotFoundException
        {
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        double num, numberTotal = 0;
        int count;
        for(count = 0; inFile.hasNext(); count++) 
            {
            num = inFile.nextDouble();
            numberTotal = numberTotal + num;
            }
        
        mean = numberTotal / count;
        return mean;
        }
    public static double computeStandardDeviation(double stdDev) throws FileNotFoundException
        {
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        double mean = 0, variance, dev = 0;
        mean = Lab04.computeMean(mean);
        int count;
        for(count = 0; inFile.hasNext(); count++) 
            {
            dev = dev + (Math.pow((inFile.nextDouble() - mean), 2));
           
            }
        variance = dev / count;
        stdDev = Math.sqrt(variance);        
        
        return stdDev;
        }
    
}
