<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>EmployeeFramework</title>
<style>
 .heading {
    font-size: 18px;
    font-weight: bold;
    margin: 0 0 20px;
  }
  .label {
    display: block;
    margin-bottom: 5px;
    font-weight: bold;
  }
  .input {
    width: 100%;
    padding: 5px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #f9f9f9;
  }
  .button {
    padding: 8px 20px;
    background-color: blue;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }
  .choice {
    padding: 5px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #f9f9f9;
    width: 100%;
    margin-bottom: 10px;
  }
</style>
</head>
<body>
<div class="container">
  <div class="heading">Employee Details</div>
  <label class="label">Name</label>
  <input class="input" type="text" id="name">
  <label class="label">Number</label>
  <input class="input" type="text" id="number">
  <label class="label">Job</label>
  <input class="input" type="text" id="job">
  <label class="label">Salary</label>
  <input class="input" type="text" id="salary">
  <select class="choice" id="role">
    <option value="View Mode">View Mode</option>
    <option value="Edit Mode">Edit Mode</option>
  </select>
  <button class="button" id="btnFirst" name="button" value="First"><a href="first">First</a></button>
  <button class="button" id="next" name="button" value="Next">Next</button>
  <button class="button" id="prev" name="button" value="Prev">Prev</button>
  <button class="button" id="last" name="button" value="Last">Last</button><br><br>
  <button class="button" id="add">Add</button>
  <button class="button" id="edit">Edit</button>
  <button class="button" id="del">Del</button>
  <button class="button" id="save">Save</button><br><br>
  <button class="button" id="search">Search</button>
  <button class="button" id="clear">Clear</button>
  <button class="button" id="exit">Exit</button>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
document.addEventListener("DOMContentLoaded", function() {
	var employees = <%= request.getAttribute("employees") %>;

    function fillFields(employee) {
        document.getElementById("name").value = employee.eName;
        document.getElementById("number").value = employee.empNo;
        document.getElementById("job").value = employee.job;
        document.getElementById("salary").value = employee.salary;
        // You can set other fields as well
    }

    document.getElementById("btnFirst").addEventListener("click", function() {
        fillFields(employees[0]); // Assuming employees list is not empty
    });

    
});
</script>
</body>
</html>
