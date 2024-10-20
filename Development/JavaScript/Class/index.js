function validateUserInputs() {
    var userName = document.getElementById("name").value;
    var userNumber = document.getElementById("number").value;
    var userEmail = document.getElementById("mail").value;
    var userPass = document.getElementById("pass").value;
    var userConfirmPass = document.getElementById("cpass").value;
  
    // Validate the name (at least 2 characters)
    if (userName.length <= 2) {
      // alert("Enter a valid name (at least 2 characters).");
      document.getElementById("demo").innerHTML="enter valid name";
      return false;
    }
  
    // Validate the phone number (must be 10 digits)
    if (userNumber.length !== 10 || isNaN(userNumber)) {
      alert("Enter a valid phone number (10 digits only).");
      return false;
    }
  
    // Validate the email (basic check for '@' and '.')
    if (userEmail.indexOf('@') === -1 || userEmail.indexOf('.') === -1) {
      alert("Enter a valid email address.");
      return false;
    }
  
    // Validate the password (at least 8 characters, must include at least one uppercase, one lowercase, one digit, and one special character)
    if (userPass.length < 8) {
      alert("Password must be at least 8 characters long.");
      return false;
    }
  
    var hasUpperCase = false;
    var hasLowerCase = false;
    var hasDigit = false;
    var hasSpecialChar = false;
    
    // Check each character in the password
    for (var i = 0; i < userPass.length; i++) {
      var char = userPass[i];
      if (char >= 'A' && char <= 'Z') {
        hasUpperCase = true;
      } else if (char >= 'a' && char <= 'z') {
        hasLowerCase = true;
      } else if (char >= '0' && char <= '9') {
        hasDigit = true;
      } else if ("!@#$%^&*".includes(char)) {
        hasSpecialChar = true;
      }
    }
    
    // Check if all conditions for the password are met
    if (!hasUpperCase || !hasLowerCase || !hasDigit || !hasSpecialChar) {
      alert("Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
      return false;
    }
  
    // Check if passwords match
    if (userPass !== userConfirmPass) {
      alert("Passwords do not match.");
      return false;
    }
  
    alert("All inputs are valid!");
    return true;
  }
  