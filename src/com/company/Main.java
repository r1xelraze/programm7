package com.company;

public class Main {
    static class formula2{
        int n;
        double x;
        public formula2(int n, double x){
            this.n = n;
            this.x = x;
        }

        public void displayFormula() {
            double num1 = Math.pow(x, x);
            int num2 = 1;
            if (n >= 0) {
                for (int i = 1; i <= n; i++) {
                    num2 = num2 * i;
                }
                double y = (num1 / num2);
                System.out.print(y);
            }
            else
            {
                System.out.println("Введи число большее или равное нулю");
            }
        }

    }

    public static void main(String[] args) {
        formula2 formm = new formula2(2,5);
        System.out.println("Результат formm: ");
        formm.displayFormula();
        formula2 formm2 = new formula2(-5,3);
        System.out.println();
        System.out.println("Результат formm2: ");
        formm2.displayFormula();

    }

}
