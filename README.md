# american-eagle-test-project
american-eagle-test-project UI work flow

**Pre-requisite**:
Java1.8, testNG, Maven , Eclipse / Intellij 

**Description** 
      Aim of the project is to launch the site (ae.com) for functional test using UI navigation and successfully complete a transaction. 
      
**Steps** 

Clone the repo from here -> git@github.com:maheshprabu/american-eagle-test-project.git 
Import the project using Eclipse / Intellij 
File->Import->Maven->Existing Maven Projects and locate the pom.xml file present in americaneagle-automation/0.0.1 
Import is successful

**How to run the project**

Go to src/test/java 
right click on the file UiLaunchTest.java and run as TestNG 

**Config properties** 

if you want to change these properties , due to the following 
      >Browser
      >baseURL
      >Page timeout 
      
click on config.properties and change it to the respective following 
      >Browser: Chrome / Firefox 
      >baseURL: any 
      >Page timeout: upto 100ms 
      
**Verifying Results** 

After the run is complete please refresh the project and the output of the project is present in test-output/emailable-report.html

Sample output:
Test	# Passed	# Skipped	# Failed	Time (ms)	Included Groups	Excluded Groups
Default suite
Default test	2	0	0	37		

**Challenges**

Site frequently throws 400 error, retry the execution 
Page objects changes frequently, 
Page load time is slow and doesn't find the objects 
Chrome laster version of the application doesn't support 


