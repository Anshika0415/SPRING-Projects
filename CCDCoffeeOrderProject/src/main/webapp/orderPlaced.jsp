<%@ page import="com.example.CCDCoffeeOrderProject.model.CustomerModel" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Add Bootstrap CSS link -->
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
        crossorigin="anonymous">
 <style>

        .card {
            border: 2px solid red;
            background-color: pink;
            height:500px;
            width:450px;
            margin:100px 200px 200px 520px;

        }

    </style>
<link href="style2.css" rel="stylesheet">
</head>
<body>
<h2 >Order Placed!</h2>
<div class="container mt-5">

    <div>
        <div class="orderHead">
            <div class="card">

                    <h4>${Order.cname}</h4>
                    <p class="cardtext">
                        <strong>Customer ID:</strong>
                        ${Order.cid}</p>

                    <p class="cardtext">
                        <strong>Coffee Type:</strong>
                       ${Order.coffeetype}</p>

                    <p class="cardtext">
                        <strong>Price:</strong> ${Order.price} Rs.</p>

            </div>
        </div>
    </div>
</div>
<script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
    crossorigin="anonymous"></script>
</body>
</html>