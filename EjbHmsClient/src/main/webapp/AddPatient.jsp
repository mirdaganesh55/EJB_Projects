<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
	<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		</head>
		<body>
		<h:form>
		<h2 style="text-align: center" class="col-sm-4">Add Your Record</h2>
		<hr/>
		<center>
		Patient ID
		<h:inputText id="pId" value="#{patient.pId}" /> <br/>
		Name
		<h:inputText id="name" value="#{patient.name}" /> <br/>		
		Gender 
	<h:selectOneMenu value="#{patient.gender}">
		<f:selectItem itemValue="MALE" itemLabel="Male" />
    <f:selectItem itemValue="FEMALE" itemLabel="Female" />
</h:selectOneMenu> <br/>
		
		Address
		<h:inputText id="address" value="#{patient.address}" /> <br/>
		PhoneNo
		<h:inputText id="phoneNo" value="#{patient.phoneNo}" /> <br/>
		Disease
		<h:inputText id="disease" value="#{patient.disease}" /> <br/>
		Doctor ID
		<h:inputText id="doctorId" value="#{patient.doctorId}" /> <br/>
		Age
		<h:inputText id="age" value="#{patient.age}" /> <br/>
		Weight
		<h:inputText id="weight" value="#{patient.weight}" /> <br/>
		Email
		<h:inputText id="userName" value="#{patient.userName}" /> <br/>
		
		<h:commandButton value="Send Otp" 
                    	action="#{patientImpl.sendOtp(patient)}" />
		</center>
		</h:form>
		
		
		</body>
		
		
		
		
		
		
		
		
		
		
	</html>
</f:view>