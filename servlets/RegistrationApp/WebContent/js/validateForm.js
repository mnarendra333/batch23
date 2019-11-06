			function validateGender()
			{
				var formValid = false;
				var genderList = document.getElementsByName("gender");
				 var i = 0;
				 while (!formValid && i < genderList.length) {
					if (genderList[i].checked) 
						formValid = true;
					i++;        
				 }
			
				return formValid;
			}
		
			function validateForm()
			{
			
				
				var fname = regform.fname.value;
				var lname = regform.lname.value;

				var gender = regform.gender.value;

				var email = regform.email.value;
				var phno = regform.phno.value;
				
				var dob = regform.dob.value;
				var city = regform.city.value;
				var hobbies = regform.hobbies.value;
				var addr = regform.addr.value;
				console.log("fname is "+fname);
				if(fname == ""){
					regform.fname.focus();
					return false;
				}
				if(lname == ""){
					regform.lname.focus();
					return false;
				}
				
				var isValid = validateGender();
				console.log("gender validation "+isValid);
				if(!isValid){
					alert("select Gender");
					return false;
				}
				if(email == ""){
					regform.email.focus();
					return false;
				}
				if(phno == ""){
					regform.phno.focus();
					return false;
				}
				if(dob == ""){
					regform.dob.focus();
					return false;
				}
				if(city == ""){
					regform.city.focus();
					return false;
				}
				/*if(hobbies == ""){
					regform.hobbies.focus();
					return false;
				}*/
				if(addr == ""){
					regform.addr.focus();
					return false;
				}
			
				
			}