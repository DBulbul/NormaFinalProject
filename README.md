[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=7849702&assignment_repo_type=AssignmentRepo)
# Norma Spring Boot Final Project
<img width="680" alt="section-1-2x" src="https://user-images.githubusercontent.com/97522259/171113736-b7d79a56-2e18-40e5-b5a8-feb4709e9979.png">

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

## Resolution of the Project

1. Project is designed using following packaging system;

![packaging](https://user-images.githubusercontent.com/97522259/171120033-2f3dcb07-b252-4167-b106-4070267de1c2.jpg)

2. Entities are created like following diagram;

![diagram](https://user-images.githubusercontent.com/97522259/171120346-2d851157-fabb-49a1-bbe2-675179ea084d.png)

### Customer Management Resolution
My entities for the customer managements are; Address,ContactInfo and Customer. Since each customer has one adress and one contact information, one to one relationship is designed while linking these tables. 

Lets look at the endpoints which are created for deleting,updating and creating operations;

![endpoints](https://user-images.githubusercontent.com/97522259/171125646-cb4e5be4-166f-4f57-91b2-30ba959abe71.png)

While creating customer, if all the requirements are enabled(eg: name cannot be null or identity must be in 11 digits), then the message "Customer is created successfully" is given as output like following;
![image](https://user-images.githubusercontent.com/97522259/171125179-b8f3de37-fadc-4895-aaee-cf8415e1774f.png)

Look at the output while listing all customers which are created;

![listcustomer](https://user-images.githubusercontent.com/97522259/171131761-2fa477e5-60d4-42d4-ac66-f16d1d9779c4.png)



