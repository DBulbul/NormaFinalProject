[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=7849702&assignment_repo_type=AssignmentRepo)
# Norma Spring Boot Final Project

![money transfer](money_transfer.jpg)

That is the final project which consists of the backend part of the bank application. Requirements and some of technical necessities are handled in detail like following;

## Requirements
* Customer Management
* Account Management
* Card Management
* Transaction Management 

### Customer Management
Thanks to APIs,creating customer, updating customer and deleting customer should be realized. For the customer which has money on the account or which has loan for credit card,deleting should not be possible. 

### Account Management
Customers can create 2 types of account;checking account and deposit account for controlling their investments.Deleting these accounts also should be possible with APIs. Transaction between with these accounts should be provided;however, deposit account cannot make transaction. Accounts can be openned with TL,Euro or Dolar currencies.

### Card Management
The bank provides credit cards and debit cards for their customers. Opening these cards,binding up these cards with customers and collecting money while shopping should be handled with APIs.

Additionally, checking loans, collecting loans, checking bank statements(with JSON format) functions should be added.

### Transaction Management
Necessary APIs should be written for system operations. If a customer wants to transfer money with different currencies, daily interests should be taken from
https://api.exchangeratesapi.io/latest?base=TRY while changing money. 
Transactions operations should be handled only via IBANs.

## Technical Requirements
All the functions that is mentioned above in detail should be implemented with using Java and Spring Boot. While implementing, OOP Principles,clean code, and SOLID Principles should be taken into consideration. Swagger can be used for documenting Rest APIs. Exception handling and responses to the possible errors should be also implemented. Unit Tests should be added.

