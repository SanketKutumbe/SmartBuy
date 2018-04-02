# SmartBuy 
Jenkins Configuration: 
(Used jenkins.war file)
(command needed to be use to start jenkins at port 8080 using terminal is: java -jar jenkins.war --httpPort=8080)


Configuration Steps:
1) Install "TestNG results", "chromedriver" plugins and restart jenkins (No need of "Selenium", "Xvfb" plugins)
2) Create Maven project--->Config
	---> 1] In SCM, Git--->(Add credentials)
	(Not needed) ---> 2] In Build Triggers, Poll SCM--->schedule--->*****
	(Not needed) ---> 3] In Build Environment, Start Xvfb before build... (check box)
	(Not needed) ---> 4] In Pre-steps, in goal, add "clean verify"
	(Not needed) ---> 5] In Build, under pom.xml, in goals and options, add "clean package" (No need add "clean test")
	(Not needed) ---> 6] In Post-build Actions, add
			"Publish TestNG Results"---> TestNG XML report pattern, add "**/testng-results.xml"

(Not needed) 3] In Selenium Grid (located at left nav bar in jenkins home)
				---> Configurations
					---> 1] Create New Node Configuration---> Add some name to configuration
							---> Chrome ---> Maximum instances, add "5"