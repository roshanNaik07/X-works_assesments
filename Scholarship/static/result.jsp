<!doctype html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Index page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">

</head>
<body>

<nav class="navbar bg-body-tertiary p-3 " data-bs-theme="dark">
    <div class="container-fluid">
        <span class="navbar-brand mb-0 h1">Scholarship</span>
        <div class="d-flex justify-content-right align-items-center ">

            <div class="d-flex flex-row ">

                <div class="p-2">
                    <a class="btn btn-outline-light" href="Schemes.jsp" role="button">Check Scheme</a>
                </div>

            </div>

            <div class="p-2">
                <a class="btn btn-outline-light" href="index.jsp" role="button">Log out</a>
            </div>

            </div>
        </div>
    </div>
</nav>


<div class="table-responsive ">
    <table class="table mb-3 table-bordered table-success">
        <thead>
        <tr>
            <th scope="col">SlNo</th>
            <th scope="col">Username</th>
            <th scope="col">Email</th>
            <th scope="col">Secrete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="dto" items="${list}" varStatus="status">
            <tr>
                <th scope="row">${status.count}</th>
                <td>${dto.username}</td>
                <td>${dto.email}</td>
                <td>${dto.password}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>