package com.company;

public class Main {
    static class Formula {
        public double a;
        public double b;
        public double c;

        public Formula (double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void displayFormula() {
            double t=Math.sqrt(b*b-4*a*c)/2;
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);

        }
    }

    public static void main(String[] args) {
	Formula form=new Formula(6,1,2);
	form.displayFormula();
	form.c=10;
    Formula c=new Formula(5, 9, 7);
        form.displayFormula();
	form.a=3;
	Formula b= new Formula(4,6.5,3);
	form.displayFormula();
	 form.b=4;

    }
}
