public class Forum5Bad {
    public static void main(String[] args) {
        //overloading
        System.out.println("Overloading");
        OverloadingEx("Iqbal Fauzan");
        OverloadingEx("Iqbal", "Fauzan");
        //Factorial Number Counting
        System.out.println("Menghitung nilai faktorial 10!");
        System.out.println("10!: "+countFactorial(10));
    }

    static void OverloadingEx(String fullname){
        System.out.println("My name is: "+fullname);
    }

    static void OverloadingEx(String firstname, String lastName){
        System.out.println("My name is: "+firstname+" "+lastName);
    }

    public static long countFactorial(int number){
        if (number <= 1) return 1;
        else return number * countFactorial(number - 1 );
    }
}
