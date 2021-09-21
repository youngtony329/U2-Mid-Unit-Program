/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    /* Plan
    1. Get input for the hourly rate, hours worked, the sales commission percent and the total
    sales
    2. Calculate total earnings
    3. Display results
    */

    public static void main(String[] args) {
        double hrlyRate = getInput("Enter Your Hourly Rate: ");
        double hrsWorked = getInput("Enter The Amount Of Hours You Worked: ");
        double commission = getInput("Enter Your Sales Commission: ");
        double totalSales = getInput("Enter The Total Sales: ");

        double totalEarnings = earnings(hrlyRate, hrsWorked, commission, totalSales);

        outputResults(totalEarnings);

        System.exit(0);
    }

    public static double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

    public static double earnings(double hrlyRate, double hrsWorked, double commission, double totalSales){
        return (hrlyRate * hrsWorked) + ((commission/100) * totalSales);
    }

    public static void outputResults(double totalEarnings){
        DecimalFormat round = new DecimalFormat("$#,###.00");

        JOptionPane.showMessageDialog(null, "Total Earnings: " + round.format(totalEarnings));
    }

}
