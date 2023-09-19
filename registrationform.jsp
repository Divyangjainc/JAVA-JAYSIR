<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css">
    <meta charset="ISO-8859-1">
    
    <style>
    body {
    font-family: Arial, Helvetica, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 0;
}

.container {
    max-width: 600px;
    margin: 0 auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0px 0px 10px 0px #888888;
    border-radius: 5px;
}

form {
    display: flex;
    flex-direction: column;
}

label {
    margin-bottom: 8px;
}

input,
textarea {
    padding: 10px;
    margin-bottom: 15px;
    border: 1px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
}

input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    border: none;
    cursor: pointer;
    padding: 10px 20px;
    border-radius: 4px;
    font-size: 16px;
}

/* Media Query for responsiveness */
@media screen and (max-width: 600px) {
    .container {
        max-width: 100%;
    }
}
        
    </style>
</head>
<body>
    <div class="container">
        <h2>Registration Form</h2>
        <form action="RegisterServlet" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="address">Address:</label>
            <textarea id="address" name="address" required></textarea>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <label for="loginId">Login ID:</label>
            <input type="text" id="loginId" name="loginId" required>

            <label for="confirmPassword">Confirm Password:</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required>

            <label for="mobile">Mobile Number:</label>
            <input type="tel" id="mobile" name="mobile" required>

            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>  
