<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">INTERNSHIP</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="RegisterForm.jsp">Register Here</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="StudentDetails.jsp">Student Details</a>
                </li>

            </ul>
        </div>
    </div>
</nav>

<br>



<div class="container text-center">
    <div class="row">
        <div class="col">

        </div>
        <div class="col">


            <form action="register" method="post">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Name</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" name="name">
                </div>

                <div class="mb-3">
                    <label class="form-label">Course</label>
                    <select class="form-select" name="course" >
                        <option selected disabled>Open this select menu</option>
                        <option>Java Full Stack</option>
                        <option>Data Analyst</option>
                        <option>Devops</option>
                        <option>UI / UX</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label  class="form-label">Fees Paid</label>
                    <input type="number" class="form-control" name="fees" >
                </div>

                <div class="mb-3">
                    <label  class="form-label">Mode</label>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="radioDefault" id="radioDefault1" checked value="Offline">
                        <label class="form-check-label" for="radioDefault1">
                            Offline
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="radioDefault" id="radioDefault2" value="Online" >
                        <label class="form-check-label" for="radioDefault2">
                            Online
                        </label>
                    </div>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>


        </div>
        <div class="col">

        </div>
    </div>
</div>


</body>
</html>