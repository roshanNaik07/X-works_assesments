<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Art Gallery</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Art Gallery</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">

                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="ExhibitionForm.jsp"> Exhibition Form </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="ArtResult.jsp"> Find art </a>
                </li>

            </ul>
        </div>
    </div>
</nav>
<center>

</center>
<center>
    <h2 class="head1"> Exhibition Registration From  </h2>
</center>

<span style="color : red">${errorMessage}</span> <br>
<span style="color : green">${message.artist}</span> <br>
<span style="color : green">${message.artType}</span> <br>
<span style="color : green">${message.price}</span> <br>


<form action="exhibit" method="get">

    <div class="mb-3">
        <label  class="form-label">Enter Id</label>
        <input type="number" class="form-control" name="artistId" >
    </div>

    <button type="submit" class="btn btn-primary" >Find</button>
</form>
</body>
</html>