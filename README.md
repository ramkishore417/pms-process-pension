# pms-process-pension-microservice

ProcessPension Microservice is an essential component of the overall pension management system. The main function of this microservice is to process pension for the pensioners. When the microservice is invoked from the web application, it takes in the Aadhaar number of the pensioner and uses it to determine the pension amount and bank service charge. It then verifies the accuracy of the pensioner detail by fetching the data from the PensionerDetail Microservice. If the detail is not valid, a validation message will be displayed on the UI, stating "Invalid pensioner detail provided, please provide valid detail." If the detail is valid, the pension calculation is performed, and the pension detail is returned to the web application for display on the UI. This microservice plays a critical role in ensuring that pensioners receive their pensions accurately and efficiently.

------------


###  Endpoints
This microservice provides a POST endpoint, /ProcessPension, which takes ProcessPensionInput as input and returns PensionDetail as output.

------------


### Features
- The microservice calculates pension amount based on the last salary earned and allowances.
- It determines the bank service charge based on the bank type, either public or private.
- The pension calculation is done through the Aadhaar number by invoking the Pensioner detail microservice.

------------


### Getting Started
- Clone the repository: git clone https://github.com/ramkishore417/pms-authorization-microservice.git
- Build the project: mvn clean install
- Run the application: mvn spring-boot:run
- Access the token generation endpoint at http://localhost:8001/authenticate

------------


### Prerequisites
- Java 8 or later
- Maven
- Built With
- Spring Boot

------------


### Authors
[Ramkishore](https://github.com/ramkishore417 "Ramkishore")


