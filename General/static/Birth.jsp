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
        <a class="navbar-brand" href="index.jsp">General</a>
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
    <h2 class="head1"> Birth Certificate application </h2>
</center>

<form action="birth" method="post">

    <div class="mb-3">
        <label  class="form-label">Birth ID</label>
        <input type="text" class="form-control" name="birthId">
    </div>

    <div>
        <label  class="form-label">Hospital Name</label>
        <select name="hospitalName" class="form-select">
            <option>Select Hospital</option>
            <option>AJ</option>
            <option>Manipal hospital</option>
            <option>Cleveland Clinic</option>
            <option>The Johns Hopkins Hospital	</option>
            <option>Aster CMI Hospital</option>
        </select>
    </div>

    <div class="mb-3">
        <label  class="form-label">Father Name</label>
        <input type="text" class="form-control" name="father">
    </div>

    <div class="mb-3">
        <label  class="form-label">Mother Name</label>
        <input type="text" class="form-control" name="mother">
    </div>

    <div class="mb-3">
        <label  class="form-label">Birth ID</label>
        <input type="text" class="form-control" name="date">
    </div>

    <div class="mb-3">
        <label  class="form-label">Doctor name</label>
        <input type="text" class="form-control" name="doctor">
    </div>

    <div class="mb-3">
        <label  class="form-label">Nurse Name</label>
        <input type="text" class="form-control" name="nurse">
    </div>

    <div>
        <label  class="form-label">Hospital Type</label>
        <select name="hospitalType" class="form-select">
            <option>Select type</option>
            <option>general hospitals</option>
            <option>specialty hospitals</option>
            <option>teaching hospitals</option>
            <option>research hospitals</option>
        </select>
    </div>

    <button type="submit" class="btn btn-primary" >Record</button>
</form>

</body>
</html>