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
    <h2 class="head1"> Death Certificate application </h2>
</center>

<form action="death" method="post">

    <div class="mb-3">
        <label  class="form-label">Name</label>
        <input type="text" class="form-control" name="name">
    </div>

    <div class="mb-3">
        <label  class="form-label">Cause</label>
        <input type="text" class="form-control" name="cause">
    </div>

    <div class="mb-3">
        <label  class="form-label">Date</label>
        <input type="text" class="form-control" name="date">
    </div>

    <div class="mb-3">
        <label  class="form-label">Time</label>
        <input type="text" class="form-control" name="time">
    </div>

    <div class="mb-3">
        <label  class="form-label">Age at death</label>
        <input type="number" class="form-control" name="age">
    </div>

    <div class="mb-3">
        <label  class="form-label">Certified By</label>
        <input type="text" class="form-control" name="certifiedBy">
    </div>

    <div class="mb-3">
        <label  class="form-label">Hospital Name</label>
        <input type="text" class="form-control" name="hospitalName">
    </div>

    <div class="mb-3">
        <label  class="form-label">Manner of death</label>
        <input type="text" class="form-control" name="mannerOfDeath">
    </div>

    <div class="mb-3">
        <label  class="form-label">Gender</label>
        <input type="text" class="form-control" name="gender">
    </div>

    <div class="mb-3">
        <label  class="form-label">Marks</label>
        <input type="text" class="form-control" name="marks">
    </div>

    <button type="submit" class="btn btn-primary" >Record</button>
</form>

</body>
</html>