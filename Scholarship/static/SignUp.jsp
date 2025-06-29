<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">

</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
        crossorigin="anonymous"></script>

<nav class="navbar bg-body-tertiary p-3 " data-bs-theme="dark">
    <div class="container-fluid">
        <span class="navbar-brand mb-0 h1">Navbar</span>
        <div class="d-flex justify-content-right align-items-center ">

            <div class="p-2 h3"><a class="icon-link align-items-center" href="index.jsp">
                <i class="bi bi-house-door-fill"></i>
            </a>
            </div>

        </div>
    </div>
</nav>

<div class="container-fluid d-flex justify-content-center align-items-center min-vh-100 ">

    <form class="shadow p-3 mb-5 bg-body-tertiary rounded p-5 border border-black border-opacity-50" action="signUp" method="post">
        <div class="m-2">
            <span style="color:green">${saved}</span>
        </div>
        <div class="mb-3">
            <label for="userID1" class="form-label">User ID</label>
            <br>
            <span style="color:red">${resultUsername}</span>
            <input type="text" class="form-control" id="userID1" name="userId" value="${username}">
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" class="form-control" id="exampleInputEmail1" name="email" value="${email}">
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <br>
            <span style="color:red">${resultPassword}</span>
            <input type="password" class="form-control" id="exampleInputPassword1" name="password" value="${password}">
        </div>

        <div class="mb-3">
            <label for="confirmPasswork1" class="form-label">Confirm Password</label>
            <input type="password" class="form-control" id="confirmPasswork1" name="confirmPassword" value="${confirmPassword}">
        </div>

        <div class="d-flex justify-content-center">
            <button type="submit" class="btn btn-outline-primary">Sign Up</button>
        </div>
    </form>

</div>


</body>
</html>