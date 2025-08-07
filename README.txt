GitHub information

1.	Repository Name : JavaAutomation
2.	Repository URL : https://github.com/vyasrushin/JavaAutomation.git
3.	Folders and files under the JavaAutomation project are 
		.setting
		src/main/java/ <-- Not required.
		src/main/test/java
		src/main/test/resource
		.gitignore <-file
		pom.xml <-file maven dependency file
		testing. <-file configuration file which has browser and url configuration
4.	Java installed in a system with latest java version "24.0.2"
5.	Maven installed in a system "C:\Program Files\apache-maven-3.9.11"
6.	JAVA_HOME and MAVEN_HOME variable should configure in system > environment variable
7.	Download the JavaAutomation project from GitHub, Clone > Download Zip and extract the zip file.
8.	Open Eclipse and import JavaAutomation project
9.	Clean and Build the project from Project > Clean & Project > Build Project
10.	After that right click on testing.xml file and Run in TestNG Suite --> Run as > TestNG Suite
11.	Now it will execute the all test cases in Firefox browser. 
12.	Generate the report in test-output > index.html
13.	Generate the screenshot of all test case (set for all test case) in /screenshot folder.
14.	We can change the browser from firefox to chrome in testing.xml file as browser parameter.
15.	We can change the url (for different environments) in testing.xml file as appUrl parameter.

How to run through commond line.
1.	Go to commond prompt
2.	Go to the new project folder
3.	Run mvn -v <- it will shows the installed maven version
4.	Run mvn clean compile
5.	Run mvn clean test <- This commond execute the all the test cases for the selected project.
6.	It will generate the report and screenshot same as above.

Let me know if anything is missing from my end.