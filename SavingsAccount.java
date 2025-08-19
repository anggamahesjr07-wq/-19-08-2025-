public class SavingsAccount {
    double saldo;
    double bunga = 0.03;
    String name;
    public void cetak(){
        System.out.println("customer name: " + name);
        System.out.println("customer balance: " + saldo);
        System.out.println("customer interest rate: " + bunga);
        System.out.println("interest earned: " + (saldo * bunga));
        System.out.println();
    }
}

