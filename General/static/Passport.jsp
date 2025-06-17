<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Birth</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <link href="index.css" rel="stylesheet">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Passport</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="job.jsp">Job Appliation</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Birth.jsp">Birth Certificate</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Passport.jsp">Passport </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Death.jsp">Death Certificate</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Driving.jsp">Driving License</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Marriage.jsp">Marriage Certificate</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<center>
    <h2 class="head1"> Passport application </h2>
</center>

<form action="passport" method="post">

    <div class="mb-3">
        <label  class="form-label">Applicant Name</label>
        <input type="text" class="form-control" name="applicantName">
    </div>

    <div class="mb-3">
        <label  class="form-label">Adar</label>
        <input type="number" class="form-control" name="adar">
    </div>

    <div class="mb-3">
        <label  class="form-label">Address</label>
        <input type="text" class="form-control" name="address">
    </div>

    <div class="mb-3">
        <label  class="form-label">PanNo</label>
        <input type="number" class="form-control" name="panNo">
    </div>

    <div class="mb-3">
        <label  class="form-label">Country</label>
        <input type="text" class="form-control" name="country">
    </div>

    <div class="mb-3">
        <label  class="form-label">State</label>
        <input type="text" class="form-control" name="state">
    </div>

    <div class="mb-3">
        <label  class="form-label">City</label>
        <input type="text" class="form-control" name="city">
    </div>

    <div>
        <label  class="form-label">Passport Type</label>
        <select name="passportType" class="form-select">
            <option>Select Type</option>
            <option>Ordinary</option>
            <option>Diplomatic Passport</option>
            <option>Official Passport</option>
            <option>Emergency Certificate	</option>
        </select>
    </div>
<br>

    <div class="mb-3">
        <label  class="form-label">Payment Ref Num</label>
        <input type="number" class="form-control" name="refNum">
    </div>

    <button type="submit" class="btn btn-primary" >Record</button>
</form>

</body>
</html>