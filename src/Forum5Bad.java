public class Forum5Bad {
    public static void main(String[] args) {
        //overloading
        System.out.println("Overloading");
        OverloadingEx("Iqbal Fauzan");
        OverloadingEx("Iqbal", "Fauzan");
        //Factorial Number Counting
        System.out.println("Menghitung nilai faktorial 10!");
        System.out.println("10!: "+countFactorial(10)+"\n");

        //Enum & Switch & for each loop
        System.out.println("Enum & Switch & for each loop:");
        Switch(Shoes.air_max);

        //Enum with variable arguments with overloading
        System.out.println("Enum with variable arguments with overloading");
        var_args("Iqbal", 5, 7, 9);
        var_args("Fauzan");
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

    enum Shoes {
        air_jordan(2000), air_max(1000), yezzy(1500);
        private final int price;

        Shoes(int p) {
            price = p;
        }

        int getPrice() {
            return price;
        }
    }

    private static void Switch(Shoes shoes){
        for (Shoes c: Shoes.values()){
            System.out.println("sepatu "+c+" harganya "+c.getPrice()+"$");
        }

        switch (shoes){
            case yezzy:
                System.out.println("Anda Memilih sepatu yezzy dengan harga:"+shoes.getPrice()+"$");
                break;
            case air_max:
                System.out.println("Anda Memilih sepatu Air Max dengan harga:"+shoes.getPrice()+"$");
                break;
            case air_jordan:
                System.out.println("Anda Memilih sepatu Air Jordan dengan harga:"+shoes.getPrice()+"$");
                break;
            default:
                System.out.println("Anda tidak memilih sepatu yang disediakan");
                break;
        }
    }

    static void var_args(String texts, int ...ints) {
        System.out.println("String text: "+texts);
        System.out.println("Jumlah argument: "+ints.length);
        for (int number: ints){
            System.out.print(number+" ");
        }
        System.out.println();
    }
}
