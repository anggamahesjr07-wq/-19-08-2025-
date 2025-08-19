public class AccountTest {
    //Data Pengguna Bank
    public static void main(String[] args) {
        SavingsAccount nasabah1 = new SavingsAccount();
        nasabah1.name = "Budi";
        nasabah1.saldo = 1000.0;
        nasabah1.bunga = 0.05; 
        nasabah1.cetak();

        SavingsAccount nasabah2 = new SavingsAccount();
        nasabah2.name = "Siti";
        nasabah2.saldo = 2000.0;
        nasabah2.bunga = 0.04;
        nasabah2.cetak();
    }
}