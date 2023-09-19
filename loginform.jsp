<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
    <style>
    body {
    background-color: cyan;
    }
    </style>
</head>
<body>
   
    <div align="center">
        <h2>Login Form</h2>
        <form action="loginServlet" method="post">
            <label for="Username">User name:</label>
            <input type="text" id="Username" name="Username" required><br><br>

            <label for="mobile">Mobile No:</label>
            <input type="text" id="mobile" name="mobile" required><br><br>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required><br><br>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br><br>

            <input type="submit" value="Login to form">
        </form>
    </div>
</body>
</html>


