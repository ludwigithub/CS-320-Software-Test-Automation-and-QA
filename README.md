# CS-320-Software-Test-Automation-and-QA
<p>
<b>How can I ensure that my code, program, or software is functional and secure?</b>
  <br>
  We worked to develop and test our code with JUnit testing allowing us to comb throuhg the code and check the code in snippents in isolation. Each expected functional outcome can be analyzed, tested and secured.
  <br><br>
<b>How do I interpret user needs and incorporate them into a program?</b>
  <br>
  I used the software requirements as an outline for testing. All three class components (Contact, Task, and Appointment) of the software requirements included a unique ID for that service.
- Each object required a unique ID String that could not be longer than 10 characters and could not be null or updatable. Achieved by setting object ID to final and setting the conditional checks where (objectID == null || objectID.length() > 10) invoked an error.
- Each object also required various String fields that could not be longer than a set number of characters and could not be null. Achieved by setting the conditional checks where (objectRequirement == null || objectRequirement.length() > xx) invoked an error.
- One requirement unique to the Appointment class was a required appointment Date field that could not be in the past and could not be null. Achieved by importing java.util.Date and use of before(new Date()) for past dates.
All three class components (Contact, Task, and Appointment) of the software requirements included the 
- requested ability to add, delete and update with a unique ID for that service.
Achieved by using UUID and enabling adding, deleting, and updating per ID the variables to an array list.
<br><br>
<b>How do I approach designing software?</b>
  <br>
  I try to get a list and understanding of what the expected product and outcomes are for the project. Then I start to look at what technical requirements are needed to achieve those goals and use them to develop the most logical and simplest design solutions possible.
</p>
