<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.dahsing</groupId>
	<artifactId>weblogic-demo-app</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<name>weblogic-demo-app</name>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<defaultSuiteFiles>
			testngSIT.xml
		</defaultSuiteFiles>
		<suiteFile>${defaultSuiteFiles}</suiteFile>
	</properties>

	<dependencies>
		<dependency>
			<groupId>com.sun.mail</groupId>
			<artifactId>javax.mail</artifactId>
			<version>1.4.7</version>
		</dependency>

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>
		
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.9.10</version>
			<scope>test</scope>
		</dependency>
		<!-- 依赖velocity -->
		<dependency>
			<groupId>velocity</groupId>
			<artifactId>velocity-dep</artifactId>
			<version>1.4</version>
		</dependency>

		<!-- 依赖Guice -->
		<dependency>
			<groupId>com.google.inject</groupId>
			<artifactId>guice</artifactId>
			<version>3.0</version>
			<scope>test</scope>
		</dependency>

		<!-- 依赖reportNg 关联testNg -->
		<dependency>
			<groupId>org.uncommons</groupId>
			<artifactId>reportng</artifactId>
			<version>1.1.4</version>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.testng</groupId>
					<artifactId>testng</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.1.2</version>

		</dependency>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-remote-driver</artifactId>
			<version>4.1.2</version>
		</dependency>
		
		
	</dependencies>

	<build>
		<pluginManagement>
			<plugins>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>3.1</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-deploy-plugin</artifactId>
					<version>2.7</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-jar-plugin</artifactId>
					<version>2.3.2</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-surefire-plugin</artifactId>
					<version>2.17</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-source-plugin</artifactId>
					<version>2.2.1</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-eclipse-plugin</artifactId>
					<version>2.9</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-war-plugin</artifactId>
					<version>2.6</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-shade-plugin</artifactId>
					<version>2.0</version>
				</plugin>
			</plugins>
		</pluginManagement>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<encoding>UTF-8</encoding>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<configuration>
					<testFailureIgnore>true</testFailureIgnore>
					<forkMode>once</forkMode>
					<argLine>-Dfile.encoding=UTF-8</argLine>
					<suiteXmlFiles>
						<suiteXmlFile>${suiteFile}</suiteXmlFile>
					</suiteXmlFiles>
					<properties>
						<property>
							<name>usedefaultlisteners</name>
							<value>false</value>
						</property>
						<property>
							<name>listener</name>
							<value>org.uncommons.reportng.HTMLReporter,org.uncommons.reportng.JUnitXMLReporter</value>
						</property>
					</properties>
					<workingDirectory>target</workingDirectory>
				</configuration>
			</plugin>




		</plugins>



	</build>



</project>
