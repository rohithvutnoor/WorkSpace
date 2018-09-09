  function validateForm(){
	 
	 var fname = document.forms["admin-login"]["username"].value;
	 var pass = document.forms["admin-login"]["password"].value;
	 
	 if(fname == "admin" && pass == "password"){
			 
			 window.location = '/patientregister.jsp';
			 alert("LoggedIn!");
			 
			 		 
			 
		 }
		 else{
			 
			 alert("Invalid Credentilas!!");
		 }
	 
	 
 } 
 
 
 