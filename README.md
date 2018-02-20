## NewEgg Web Testing using Selenium JAVA

Create an automation framework and necessary automation scripts using Selenium-Framework that would do the following:

### Functionalities to Implement:

1) Login to newegg using the username ctschallenge18@gmail.com and password Challenge18, search and add to cart items listed in the attached xls and validate that the item was added correctly.

2) Edit the cart to remove one of the items and test to make sure that the total cost is adjusted accordingly

3) Click on secure check out and then click on 'Continue To Billing', the fields First Name, Last Name, Address, Zip Code and Phone number should get highlighted in red with a message This field is required.

4) Logout of the account.

5) Automate the testing for password reset flow on newegg.com - use the user ID - ctschallenge18@gmail.com as user ID on newegg.com and click on forgot password. Enter the email as ctschallenge18@gmail.com.

6) You will receive an email to the above given email ID. the automation script should login into this email and do the steps to reset the password 
(password for the email ID is : 2018@Challenge

7) Complete the password reset process

### Approach Taken:

Selenium Page Object Model is used to implement this testing method. Five different classes-packages are created:
    a) LoginPage
    b) searchAdd
    c) cartModify
    d) gmailPasswordReset
    e) passwordForget
 All these functionalities are tested in the "Validate" module
