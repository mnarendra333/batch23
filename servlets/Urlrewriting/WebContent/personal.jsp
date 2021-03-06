

<!DOCTYPE html>
<html lang="en">
<head>
<title>Personal Info</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Personal Info</h2>
		<form class="form-horizontal" action=<%=response.encodeUrl("srv1")%>>
			<div class="form-group">
				<label class="control-label col-sm-2">Name</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="name"
						placeholder="Enter name" name="name">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Age</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="age"
						placeholder="Enter Age" name="age">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">PhoneNo</label>
				<div class="col-sm-10">
					<input type="number" class="form-control" id="phno"
						placeholder="Enter Phoneno" name="phno">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Gender</label>
				<div class="col-sm-10">
					<input type="radio"  id="gender" value="male"
						name="gender">Male <input type="radio"
						 id="gender" value="female" name="gender">Female
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">EmailId</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" id="email"
						placeholder="Enter Email Address" name="email">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">next</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>

