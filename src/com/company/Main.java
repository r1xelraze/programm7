package com.company;

public class Main {
    public static class FactorialExeption extends Exception{
        public FactorialExeption(Throwable e){
            initCause(e);
            System.out.println("Введите положительное число");
        }

    }

    static class formula2{
        int n;
        double x;
        public formula2(int n, double x){
            this.n = n;
            this.x = x;
        }

        public void displayFormula() throws FactorialExeption {
            double num1 = Math.pow(x, x);
            int num2 = 1;
            try {
                if (n >= 0) {
                    for (int i = 1; i <= n; i++) {
                        num2 = num2 * i;
                    }
                    double y = (num1 / num2);
                    System.out.print(y);
                }
            }
            catch (IllegalArgumentException e){
                throw new FactorialExeption(e);

            }





        }

    }

    public static void main(String[] args) throws FactorialExeption {
        formula2 formm = new formula2(2,5);
        System.out.println("Результат formm: ");
        formm.displayFormula();
        formula2 formm2 = new formula2(-5,3);
        System.out.println();
        System.out.println("Результат formm2: ");
        formm2.displayFormula();

    }

}
