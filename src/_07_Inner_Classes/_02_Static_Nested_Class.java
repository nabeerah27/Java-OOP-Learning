package _07_Inner_Classes;

// Outer class
class Bank {
    private String bankName;

    // Static field to demonstrate access from static nested class
    static String bankNameStatic = "City Bank";

    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Static nested class
    static class Branch {
        private String branchName;

        Branch(String branchName) {
            this.branchName = branchName;
        }

        // Method to show branch details
        void branchDetails() {
            // Can access its own fields and static members of outer class
            System.out.println("Branch: " + branchName + ", Bank: " + Bank.bankNameStatic);
        }
    }
}

public class _02_Static_Nested_Class {
    public static void main(String[] args) {

        // Create static nested class object without outer class instance
        Bank.Branch branch = new Bank.Branch("Nazimabad");
        branch.branchDetails();

        // Outer class object is independent
        Bank bank = new Bank("City Bank Main");
        System.out.println("Bank object created with name (instance field): " + bank.bankNameStatic);

    }
}

// Static nested class is a class defined inside another class with the static keyword.
// It does not need an instance of the outer class to be created.
// It can access only static members of the outer class directly.
// Useful to group classes logically that are related but don’t need an outer object.
