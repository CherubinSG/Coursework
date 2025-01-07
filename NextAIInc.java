/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu25.nextaiinc;

/**
 *
 * @author HP
 */
public class NextAIInc {
//Method to calculate total weekly pay
    public void calculatePay(int basePay, int hoursWorked){
    
        final int MAX_REGULAR_HOURS = 48;
        final int MAX_HOURS = 72;
        final int OVERTIME_MULTIPLIER = 2; 
        final int MIN_BASE_PAY = 30000;
//Check for minimum hours worked
        if (basePay < MIN_BASE_PAY){
            System.out.println("Error: Base pay must not fall below UGX"+ MIN_BASE_PAY);
        return;
        }
//Check for maximum hours worked
        else if (hoursWorked > MAX_HOURS){
            System.out.println("Error: Hours Worked must not exceed "+MAX_HOURS+" hours.");
            return;
        }
//Calculate regular and overtime hours
        int regularHours = Math.min(hoursWorked ,MAX_REGULAR_HOURS);
        
        int overtimeHours = Math.max(0, hoursWorked - MAX_REGULAR_HOURS);
//Calculate total pay
        int totalPay = (regularHours * basePay)+(overtimeHours * basePay * OVERTIME_MULTIPLIER);
        
//Print the total pay
        System.out.println("Total pay : UGX"+totalPay);
    }
    
    public static void main(String[] args) {
        NextAIInc contractorPayment = new NextAIInc();
        
//Text case for contractor A
        System.out.println("Contractor A:");
        contractorPayment.calculatePay(30000,51);
//Text case for contract B
        System.out.println("contractor B:");
        contractorPayment.calculatePay(20000, 40);
//Text case for contract C
        System.out.println("contract C:");
        contractorPayment.calculatePay(35000, 96);
    }
}
