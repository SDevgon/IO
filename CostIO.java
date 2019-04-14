/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costio;
import java.util.Scanner;
/**
 *
 * @author sanya
 */

public class CostIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // double source,destination,fare;
                 Scanner sc=new Scanner(System.in);
  System.out.println("Enter journey");
                          char status=sc.next().charAt(0);
                   System.out.println("Enter balanace");
                  double total=sc.nextDouble();
                  double total_rem=total;
                   System.out.println("Enter Min balanace");
                            double min=sc.nextDouble();
                     while(status=='y'){

                           System.out.println("enter source station");

                                     
                                      System.out.println("enter cost of journey");
                                     Double fare=sc.nextDouble();
                                    total_rem=total_rem-fare;
                                       if(total_rem<min){
                                             System.out.println("Alert");
                                             break;}
                                     System.out.println("Enter details of another journey 1 for yes/0 for no");
                                     double status2=sc.nextDouble();
                                     if(status2==1)
                                         continue;
                                     else
                                         break;
                                
                                      
                                     
                                      
                                      
                     }}




    }
    


    
