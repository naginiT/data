set projectpath=F:\sai88\testng
cd %projectpath%
set classpath=%projectpath%\bin:%projectpath%libs\*
java org.testng.TestNG %projectpath%\parametertestng.xml