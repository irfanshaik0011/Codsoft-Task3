# Codsoft-Task3

# ATM INTERFACE

*Overview of the project


1. *Main Class (customer)*:
   - It's the entry point of the program.
   - Prints a welcome message.
   - Creates an instance of the ATM class.
   - Calls the display method of the ATM class.

2. *ATM Class*:
   - Contains methods for various ATM operations: display, balance check, deposit, and withdrawal.
   - The display method presents a menu to the user and prompts for an option selection.
   - It loops for a maximum of 10 iterations, simulating 10 ATM transactions.
   - Uses a switch-case statement to perform the selected operation.
   
3. *Deposit Method*:
   - Asks the user to enter the deposit amount.
   - Adds the deposited amount to the total available balance.
   - Prints the deposited amount and the updated balance.

4. *Withdraw Method*:
   - Prompts the user to enter the withdrawal amount.
   - Checks if the withdrawal amount is less than or equal to the available balance.
   - If sufficient balance is available, deducts the withdrawal amount from the balance and displays a success message. Otherwise, it prints an insufficient funds message.

5. *Balance Method*:
   - Displays the available balance.
   - If the balance is less than 500, it prints a warning message.

6. *User Input Handling*:
   - Uses Scanner class to take user input for menu choices, deposit amount, and withdrawal amount.
   - Ensures proper handling of user input and error messages for incorrect options.

7. *Loop Control*:
   - The program runs for a maximum of 10 iterations, allowing the user to perform multiple transactions.

Overall, this project provides a basic simulation of an ATM interface, allowing users to deposit, withdraw, and check their balance. It demonstrates the use of classes, methods, loops, conditional statements, and user input handling in Java.