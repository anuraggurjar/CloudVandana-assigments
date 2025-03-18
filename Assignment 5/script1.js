let images = [
    "images1/java.png",
    "images1/python.jpeg",
    "images1/javascript.jpeg"
];

let currentIndex = 0;
let slider = document.getElementById("slider");

function updateImage() {
    slider.src = images[currentIndex];
}

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
}


updateImage();