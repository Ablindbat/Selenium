###Amazon WebSite Automation Suite Information:-

#####To run the  Amazon Automation project folder
- `Maven test:- Right click on maven project > Run As >Maven test`  
or  
- `TestNG Test:- Right click on maven project > Run As > TestNG Test `   
or    
- ` Right Click on testng xml file > Run As > TestNG Test`

#####TestNG File Description
* testng.xml - Define the test related to all pages.  
   
#####Package Description
- **com.SeleniumAssignment.pages** - Defining all the pages action and the respective object repository.
- **com.SeleniumAssignment.tests** - Defining all the pages test and assertion.
- **com.SeleniumAssignment.Screenshot**- Taking all the failed test cases Screenshot.
  
##### Tests Files Description
+  **BaseTest:-** The main class which defines - @BeforeMethod- to open the browser and lunch the url of the test -@BeforeSuite-Set the extent report path -@AfterMethod- Taking screenshot and close the browser -@AfterSuite- flush extent report and close   
extent report.  
  
+ **CareersTest:-** Includes test - to verify careers page and student job portal.  
+ **HomeTest:-** Includes test - to verify working and not working link on home page and search field.
+ **RegistrationTest:-** Includes test - to verify register when enter Name,email,password and Again password.  
(In my test suite test successfully complete when Email and password have a one field else it failed)      

##### Other File Description
+ HomePage.java: Defines all the function of HomeTest.  
+ RegistraionPage.java: Defines all the function of RegistrationTest.  
+ CareersPage.java: Defines all the function of CareersTest.
+ Screenshot.java: Defines all the function of taking Screenshot.
+ pom.xml: Defines all the dependency files are available.
+ read.properties: Defines all the browsers path, driver and url.


#####Reports and Screenshots
+ Extent Report gets generated after the run under "\Reports\extentReport.html"
+ TestNG Report as "emailable-report.html"  gets generated under "\test-output"
+ Screenshot gets place under "\FailedScreenshots" folder with TestName and dateandtime.