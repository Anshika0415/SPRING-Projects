<!DOCTYPE html>
<html>
<head>
<link href="style2.css" rel="stylesheet"

</head>
<body>
<div class="takeOrderDiv">

<h2 class="formHeading">We are here to take your order!</h2>

							<form action="handleForm" method="post" modelAttribute="Order">

								<div class="mb-1">
									<label for="cid" class="form-label">Customer ID</label>
									<input type="number" class="form-control" id="cid"
										name="cid" required>
								</div>

								<div class="mb-1">
									<label for="cname" class="form-label">Customer Name</label>
									<input class="form-control" id="cname" name="cname" type="text" required>
								</div>

								<div class="mb-1">
									<label for="coffeetype" class="form-label">Coffee Type</label>
									<input type="text" class="form-control"
										id="coffeetype" name="coffeetype" required>
								</div>
								<div class="mb-1">
                                <label for="price" class="form-label">Coffee Price</label>
                                <input type="number" class="form-control" id="price" name="price" required>
                                </div>
                                <button type="submit" class="btnSubmit">Submit</button>
                                							</form></div>


</body>
</html>