
/*
This code simulates an ATM using inheritance in Java.
The ATMOperations class provides a base,
while subclasses handle specific tasks like checking balance, withdrawing, and depositing money.

Este código simula un cajero automático usando herencia en Java.
La clase ATMOperations actúa como base,
mientras que las subclases manejan tareas específicas como consultar saldo, retirar y depositar dinero.
 */

public class ATM {

    public static void main(String[] args) {
        ATMOperations operation = new CheckBalanceOperation(); // Initialize with a default operation
        ATMOperations.setBalance(28534.59); // Set initial balance
        operation.displayMenu(); // Start the ATM menu
    }
}

