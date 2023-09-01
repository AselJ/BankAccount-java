import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }

    public class BankAccount {
        // Class variables to track the number of accounts created and total money stored
        private static int numAccounts = 0;
        private static double totalMoney = 0;

        private double checkingBalance;
        private double savingBalance;
        private String accountNumber;

        public BankAccount(double initialCheckingBalance, double initialSavingBalance){
            // In-ze account bal-s
            checkingBalance = initialCheckingBalance;
            savingBalance = initialSavingBalance;

            //Generate a random 10-digit account number
            accountNumber = genAccountNumber();

            //Increment the number of accounts and total money stored
            numAccounts++;
            totalMoney += (initialCheckingBalance + initialSavingBalance);

        }

        private String genAccountNumber() {
            // Generate a random 10-digit account num
            Random rand = new Random();
            long accountNum = rand.nextLong() % 10000000000L;
            return String.format("sam4%", accountNum);

        }
        public double getCheckingBalance() {
            return checkingBalance;
        }
        public double getSavingsBalance() {
            return savingBalance;
        }
        public void deposit(double amount, String accountType) {
            if ("checking" .equals(accountType)) {
                checkingBalance += amount;
            } else if ("savings".equals(accountType)) {
                savingBalance += amount;
            } else {
                System.out.println("Invalid account type. Use 'checking' or 'savings'.");
            }

            // Update total money stored
            totalMoney += amount;
        }

    }

}


