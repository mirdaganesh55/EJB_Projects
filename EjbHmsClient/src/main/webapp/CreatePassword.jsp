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
		<h2 style="text-align: center" class="col-sm-4">Create Password</h2>
		<hr/>
		
		<center>
			
			Enter OTP
			<h:inputText id="otp" value="#{patient.otp}"/>
				<h:commandButton value="Validate" 
                    	action="#{patientImpl.validateOtp(patient)}" />
		</center>
		
	</h:form>
	</html>
</f:view>