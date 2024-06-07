package LR9.example5;

ppublic class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(n:5));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 0:
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n:n - 2)+fact(n:n - 1);

        }
    }
}