import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        Account acc = new Account();
        acc.set(n, d1, d2);
        int noOfYears = sc.nextInt();
        sc.close();
        calculateInterest(noOfYears, acc);
    }

    public static void calculateInterest(int years, Account acc) {
        double interest = acc.getInterestRate();
        double value = (interest / 100) * years;
        interest += value;
        if(interest-(int)(interest)==0)
            System.out.println(interest + ".000");
        else
            System.out.println(interest);
    }
}

class Account {
    int id;
    double balance;
    double interestRate;

    void set(int i, double b, double in) {
        id = i;
        balance = b;
        interestRate = in;
    }

    int getId() {
        return id;
    }

    double getBalance() {
        return balance;
    }

    double getInterestRate() {
        return interestRate;
    }
}