<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Musichub</title>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous" />


<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
</head>
<body style="background-color: #EEEEEE">
	<%@include file="Header.jsp"%><br>
	<br>
	<h1>
		<center>Sign Up</center>
	</h1>

	<h3>
		<center>We do not share your personal details with anyone.</center>
	</h3>
	<div style="text-align: center; background-color: #EEEEEE;">
		<div
			style="box-sizing: border-box; display: inline-block; width: auto; max-width: 1500px; background-color: #FFFFFF; border: 2px solid #9999cc; border-radius: 5px; box-shadow: 0px 0px 8px #9999cc; margin: 50px auto auto;">

			<div style="background: #FFFFFF; padding: 10px" id="ap_style">
				<style type="text/css" scoped>
#ap_style td {
	text-align: left;
	font-family: verdana, arial;
	color: #064073;
	font-size: 1.00em;
}

#ap_style input {
	border: 1px solid #CCCCCC;
	border-radius: 5px;
	color: #666666;
	display: inline-block;
	font-size: 1.00em;
	padding: 15px;
}

#ap_style input[type="text"], input[type="password"] {
	width: 100%;
}

#ap_style input[type="button"], #ap_style input[type="reset"], #ap_style input[type="submit"]
	{
	height: auto;
	width: auto;
	cursor: pointer;
	box-shadow: 0px 0px 5px #0361A8;
	float: right;
	text-align: right;
	margin-top: 10px;
	margin-left: 7px;
}

#ap_style table.center {
	margin-left: auto;
	margin-right: auto;
}

#ap_style .error {
	font-family: verdana, arial;
	color: #D41313;
	font-size: 1.00em;
}
</style>
				<script type="text/javascript"
					src="http://www.authpro.com/regformcheck.js"></script>
				<form:form method="post" action="insertUser" commandName="addUser">

					<center>
						<table>
							<tr>
								<td>User Name:</td>
								<td><input type="text" name="username" /></td>
							</tr>
							<tr>
								<td>Password:</td>
								<td><input type="password" name="password" /></td>
							</tr>
							<tr>
								<td>Mobile:</td>
								<td><input type="text" name="mobile" /></td>
							</tr>
							<tr>
								<td>Email:</td>
								<td><input type="text" name="email" /></td>
							</tr>
							<tr>
								<td>Address:</td>
								<td><input type="text" name="address" /></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" value="Register"></td>
							</tr>
						</table>
					</center>
					<p class="change_link">
						Already a Member ? <a href="Login" class="to_register">Log in</a>
					
					</p>
				</form:form>
			</div>
		</div>
	</div>

	<%@include file="footer.jsp"%>

</body>
</html>