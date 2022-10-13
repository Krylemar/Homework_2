import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Account {
    private String accNumber;
    private String currency;
    private String balance;
    private String type;

    public Account(String accNumber, String currency, String balance, String type) {
        this.accNumber = accNumber;
        this.currency = currency;
        this.balance = balance;
        this.type = type;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public String getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Account { " +
                "accNumber = '" + accNumber + '\'' +
                ", currency = '" + currency + '\'' +
                ", balance = '" + balance + '\'' +
                ", type = '" + type + '\'' +
                " } ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return currency.equals(account.currency) && balance.equals(account.balance);
    }

    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        accounts[0] = new Account("9215","BGN","3074.11","Savings");
        accounts[1] = new Account("3729","EUR","17900.59","Salary");
        accounts[2] = new Account("9818","BGN","56675.2","Current");
        accounts[3] = new Account("3446","USD","29612.17","Credit");
        accounts[4] = new Account("6260","EUR","33197.1","Savings");
        accounts[5] = new Account("9448","USD","27685.01","Salary");
        accounts[6] = new Account("5884","CZK","79657.43","Credit");
        accounts[7] = new Account("3830","BGN","30604.59","Salary");
        accounts[8] = new Account("3852","RON","99637.47","Salary");
        accounts[9] = new Account("7408","EUR","37494.32","Current");
        int accBGN=0,accEUR=0,accUSD=0,accCZK=0,accRON=0;
        double sumBGN = 0d,sumEUR = 0d,sumUSD = 0d,sumCZK = 0d,sumRON = 0d;
        for (int i = 0; i < 10; i++) {
            switch (accounts[i].getCurrency()) {
                case "BGN":
                    sumBGN += Double.parseDouble(accounts[i].getBalance());
                    accBGN++;
                    break;
                case "EUR":
                    sumEUR += Double.parseDouble(accounts[i].getBalance());
                    accEUR++;
                    break;
                case "USD":
                    sumUSD += Double.parseDouble(accounts[i].getBalance());
                    accUSD++;
                    break;
                case "CZK":
                    sumCZK += Double.parseDouble(accounts[i].getBalance());
                    accCZK++;
                    break;
                case "RON":
                    sumRON += Double.parseDouble(accounts[i].getBalance());
                    accRON++;
                    break;
            }
        }
        System.out.printf("BGN: %.2f \nEUR: %.2f \nUSD: %.2f \nCZK: %.2f \nRON: %.2f\n",
                            sumBGN/accBGN,sumEUR/accEUR,sumUSD/accUSD,sumCZK/accCZK,sumRON/accRON);
    }
}
