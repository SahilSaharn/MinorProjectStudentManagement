<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../Styles/IndexStyles.css">
    <link rel="stylesheet" href="../Styles/loginStyles.css">
</head>
<body>
    <div class="main-cont app-font">
        <div>
            <h2>LogIn > </h2>
            <form action="/timtam" class="login-form" method="post" >

                <!-- our Name field -->
                <!-- <div class="input-fields">
                    <label for="uname"> Name > </label>
                    <input type="text" id="uname" name="userName"  >
                </div> -->
                
                <!-- our Email field  -->
                <div class="input-fields">
                    <label for="uemail"> Email > </label>
                    <input type="text" id="uemail" name="userEmail" spellcheck="false" >
                </div>

                <!-- our Phone Number  -->
                <!-- <div class="input-fields">
                    <label for="uphonenum"> Phone Number > </label>
                    <input type="text" id="uphonenum" name="userPhoneNumber" >
                </div> -->

                <div class="input-fields">
                    <label for="upass"> Password > </label>
                    <input type="password" id="upass" name="userPass" spellcheck="false" >
                </div>

                <div >
                    <button class="btn-design app-font" >LogIn!</button>
                </div>

                <p class="register-p" >Not a User ?  <a href="./signup.jsp">Register!</a> </p>
                
            </form>
        </div>
    </div>
</body>
</html>