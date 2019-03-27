<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hospital Management System</title>
</head>
<body>
	<h1>Patient Register Form</h1>
	<form action="/PatientControllerServlet" method="post">
		<table style="with: 50%">
			<tr>
				<td>Full Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>Blood Groop</td>
				<td><input type="text" name="blood_group" /></td>
			</tr>
			<tr>
				<td>CheckUp</td>
				<td><select name="checkup">
						<option value="checkup">IP</option>
						<option value="checkup">Emergency</option>

				</select></td>
			</tr>
			<tr>
				<td>Doctor Name</td>
				<td><select name="doctorName">
						<option value="doctorName">lokesh</option>
						<option value="doctorName">Akash</option>
						<option value="doctorName">Amar</option>
						<option value="doctorName">Alok</option>

				</select></td>
			</tr>
			<tr>
				<td>Test Recomended</td>
				<td><input type="text" name="test_recommended" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>