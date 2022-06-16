<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

<suite  name="SIT Suite1">

	
	<groups>
		<run>
			<include name="sit" />
		</run>
	</groups>
	
	<parameter name="test11" value="tim" />
	<parameter name="test2" value="tim" />
	
	<test name="Functional Test">
      <classes>
      	<class name="lesson_02.Test_02"/>
      </classes>
  </test> <!-- Test --> 
  
  <test name="Test Basics 2">    
    <classes>
       <class name="lesson_02.Test_01"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
