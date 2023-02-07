# Pension Management System ProcessPension Microservice
### Functional Requirements
ProcessPension Microservice should be invoked from the web application. It allows the following operations:
- It takes in Aadhaar number and determines the Pension amount and bank service charge
- Verifies if the pensioner detail is accurate by getting the data from PensionerDetail Microservice or not. If not, validation message “Invalid pensioner detail provided, please provide valid detail.”. If valid, then pension calculation is done and the pension detail is returned to the Web application to be displayed on the UI

------------
### REQ_01 Process Pension module
- This module is a Middle- ware Microservice that performs following operations: · Determines if it’s a self or family pension. Calculate the pension amount and bank service charge post data authentication, and display on the web application user interface 
- This module should receive input from the web application

------------


### Entity 
#### ProcessPensionInput
1. Aadhaar number 

#### PensionDetail 
1. PensionAmount 
2. BankServiceCharge 

------------


### REST End Points Claims Microservice 
POST: /ProcessPension(Input: processPensionInput| Output: PensionDetail)

------------


###### Trigger – Should be invoked from Pension management portal
------------

### Steps and Actions

- This microservice should have 1 REST endpoint
- The POST endpoint should calculate the Pension for the person throught the Aadhaar number. It should invoke the Pensioner detail microservice and get the salary detail.
- Pension amount calculation detail is as follows
*Self pension: 80% of the last salary earned + allowances
Family pension: 50% of the last salary earned + allowances*
- The Pensioner detail microservice has the bank detail. Process pension microservice can
- have pre-defined list of banks and service charge as follows
*Public banks – INR 500
Private banks – INR 550*
- The PensionDetail object is returned to the web portal to display the data.

### Non-Functional Requirement:

Only Authorized requests can access these REST End Points




