<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

<suite  name="SIT TestSuite1">
	<groups>
		<run>
			<include name="sit" />
      <include name="must" />
		</run>
	</groups>
	<test name="Functional Test">
      <classes>
      	<class name="DSB_tests.functional_test"/>
      </classes>
  </test> <!-- Test --> 
  <test name="Admin Test">
    <classes>
      <class name="DSB_tests.admin_test"/>
    </classes>
</test> <!-- Test --> 
  
</suite> <!-- Suite -->
