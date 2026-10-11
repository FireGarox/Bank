public class BankAccount{
    private String accountNumber;
    private String ownerName;
    private double balance;


public BankAccount(String accountNumber, String ownerName, double initialBalance){
    if (accountNumber == null || accountNumber.trim().isEmpty()){
        throw new IllegalArgumentException("Gada Nomor");
    }    if (ownerName == null || ownerName.trim().isEmpty()){
        throw new IllegalArgumentException("Gada Nama");
    } if (initialBalance < 0) {
        throw new IllegalArgumentException("Gabisa minus");
    } else {
        this.balance = initialBalance;
    }
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    }

public BankAccount(String accountNumber, String ownerName){
    this(accountNumber, ownerName,0.0);
}
public String getaccountNumber(){
    return this.accountNumber;
}
public String getownerName(){
    return this.ownerName;
}
public double getbalance(){
    return this.balance;
}


public void deposit(double amount){
  if (amount > 0) {
            this.balance += amount;
            System.out.println("Setoran berhasil. Saldo Saat ini: " + this.balance);
        }
        System.out.println("Gagal. Setoran harus lebih besar dari 0.");
    }
public void withdraw(double amount) {
    if (amount <= 0) {
        throw new IllegalArgumentException("Jumlah penarikan harus lebih besar dari 0.");
    }
    if (amount > this.balance) {
        throw new IllegalArgumentException("Saldo tidak mencukupi untuk melakukan penarikan.");
    }
    this.balance -= amount;
    System.out.println("Penarikan sebesar " + amount + " berhasil. Saldo tersisa: " + this.balance);
}





}