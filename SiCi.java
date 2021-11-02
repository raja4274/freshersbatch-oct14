package basicdatastructuresassignments;

import java.util .*;

public class SiCi {

        public static void main (String argu[ ])
        {
            double amount, rate, t, simpleInterest,compoundInterest;
            Scanner sc=new Scanner (System. in);
            System.out.println("Enter the amount:");
            amount=sc.nextDouble();
            System. out. println("Enter the No.of months:");
            t=sc.nextDouble();
            t=t/12;
            System. out. println("Enter the Rate of  interest");
            rate=sc.nextDouble();
            simpleInterest=(amount * t * rate/100);
            compoundInterest=amount * Math.pow(1.0+rate/100.0,t) - amount;
            System.out.println("Simple Interest="+simpleInterest);
            System.out. println("Compound Interest="+compoundInterest);
        }
    }

