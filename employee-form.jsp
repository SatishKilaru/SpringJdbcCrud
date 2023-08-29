<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
</head>
<body>
    <h1>Employee Form</h1>
    <form action="addEmployee" method="post">
        <label for="empNo">Employee Number:</label>
        <input type="text" id="empNo" name="empNo"><br>
        
        <label for="eName">Employee Name:</label>
        <input type="text" id="eName" name="eName"><br>
        
        <label for="job">Job:</label>
        <input type="text" id="job" name="job"><br>
        
        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary"><br>
        
        <input type="submit" value="Add Employee">
    </form>
</body>
</html>
