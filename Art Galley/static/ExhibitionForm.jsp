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


<span style="color : green">${message}</span>
<span style="color : red">${errorMessage}</span>


<form action="exhibit" method="post">

    <div class="mb-3">
        <label  class="form-label">Artist Name</label>
        <input type="text" class="form-control" name="artist" value="${dto.artist}">
    </div>

    <div class="mb-3">
        <label  class="form-label">Art Title</label>
        <input type="text" class="form-control" name="title" value="${dto.title}">
    </div>

    <div>
        <label  class="form-label">Art Type</label>
        <select name="artType" class="form-select">
            <option selected disabled>artType</option>
            <option>Abstract art</option>
            <option>Portrait</option>
            <option>Mandala</option>
            <option>Still life</option>
            <option>Acrylic</option>
            <option>Oil painting</option>
            <option>Watercolor</option>
            <option>Others</option>
        </select>
    </div>
    <br>
    <div class="mb-3">
        <label  class="form-label">Price</label>
        <input type="number" class="form-control" name="price" value="${dto.price}">
    </div>

    <div class="mb-3">
        <label  class="form-label"> Size </label>
        <input type="text" class="form-control" name="size" value="${dto.size}">
    </div>

    <div class="mb-3">
        <label  class="form-label">Material Used </label>
        <input type="text" class="form-control" name="medium" value="${dto.medium}">
    </div>

    <div class="mb-3">
        <label  class="form-label">Contact Email</label>
        <input type="email" class="form-control" name="email" value="${dto.email}">
    </div>

    <label class="form-label">Select Exhibition Type : </label>
    <div class="btn-group" role="group" aria-label="Basic radio toggle button group" >

        <input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" checked value="Online">
        <label class="btn btn-outline-primary" for="btnradio1">Online</label>

        <input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off" value="Offline">
        <label class="btn btn-outline-primary" for="btnradio2">Offline</label>
    </div>
    <button type="submit" class="btn btn-primary" >Record</button>
</form>
</body>
</html>