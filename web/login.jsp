<!--
To change this template, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
    <head>
        <title>Online Banking Web Application</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap.css" type="text/css">
    </head>
    <body>
        <div class="navbar navbar-fixed-top">
  <div class="navbar-inner">
      <a class="brand" href="#" style="color: #802420"><b>&nbsp **SBI**</b></a>
    <ul class="nav">
      <li class="active"><a href="#" style="color: #0077b3"><b>Login</b></a></li>
      <li><a href="#" style="color: #0077b3">About Us</a></li>
      <li><a href="#" style="color: #0077b3">Contact US</a></li>
      <li><a href="#" style="color: #0077b3">Who developed this !!</a></li>
      <li><a href="http://www.github.com/akashshinde/online-banking" style="color: #0077b3">Check for Source</a></li>
     </ul>
  </div>
</div>
        <div id="row">
            <form style="margin-top: 220px; margin-left: 500px" action="loginServlet" method="post">
            <label><b>Username</b></label>
          
            <input type="text" name="username">
            <label><b>Password</b></lable>
            <br>
            <input type="password" name="userpass">
            <br>
            <button class="btn btn-info">Login</button>
        </form>
            </div>
    </body>
</html>

