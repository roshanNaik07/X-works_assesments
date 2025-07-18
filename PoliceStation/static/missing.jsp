<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link href="index.css" rel="stylesheet">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">POLICE</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="theft.jsp">Theft</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="missing.jsp">Missing</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<center>
    <h2 class="head2"> <b>Missing person detail form </b> </h2>
</center>
<form action="missing" method="post">
    <div class="mb-3">
        <label  class="form-label">missing Person Name</label>
        <input type="text" class="form-control" name="name">
    </div>

    <div class="mb-3">
        <label  class="form-label">Complaintee Mobile</label>
        <input type="number" class="form-control" name="mobile">
    </div>
    <div class="mb-3">
        <label  class="form-label">Missing Person age</label>
        <input type="number" class="form-control" name="age">
    </div>
    <div class="mb-3">
        <label  class="form-label">Address</label>
        <input type="text" class="form-control" name="address">
    </div>
    <div class="mb-3">
        <label  class="form-label">Location</label>
        <input type="text" class="form-control" name="location">
    </div>
    <div class="mb-3">
        <label  class="form-label">Marks </label>
        <input type="text" class="form-control" name="marks">
    </div>
    <div class="mb-3">
        <label  class="form-label">Missing Person Gender </label>
        <input type="text" class="form-control" name="gender">
    </div>
    <div class="mb-3">
        <label  class="form-label">Lang Known </label>
        <input type="text" class="form-control" name="lang">
    </div>
    <button type="submit" class="btn btn-primary" >Submit</button>
</form>

</body>
</html>