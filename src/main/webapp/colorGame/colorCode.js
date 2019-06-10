var backgroundColor = "#232323";
var headingColor = "steelblue"

var colors =[
	"rgb(255, 0, 0)",
	"rgb(255, 255, 0)",
	"rgb(255, 0, 255)",
	"rgb(0, 0, 255)",
	"rgb(0, 255, 0)",
	"rgb(0, 0, 0)"
	];


var squares = document.querySelectorAll(".square");
var pickedColor = pickColor();
var colorDisplay = document.querySelector("#colorDisplay");
var messageDisplay = document.querySelector("#message");
var h1 = document.querySelector("h1");
var resetButton = document.querySelector("#reset");
var mode = 6;
var modeButtons = document.querySelectorAll(".mode");

init();

function init(){
	for (i = 0; i < modeButtons.length ; i ++){
		modeButtons[i].addEventListener("click", function(){
			for (i=0; i < modeButtons.length ; i ++){
				modeButtons[i].classList.remove("selected");
			}
			this.classList.add("selected");
			if(this.textContent === "easy"){
				mode = 3;
			}
			else {
				mode = 6;
			}
			reset();
		})
	}
	resetButton.addEventListener("click", function(){
		reset();
	});

	for (var i = 0; i < squares.length; i++){
		squares[i].addEventListener("click", function(){
			var clickedColor = this.style.backgroundColor;
			if (clickedColor === pickedColor){
				changeColors(clickedColor);
				h1.style.backgroundColor = clickedColor;
				messageDisplay.textContent = "Correct!";
				resetButton.textContent = "Play again?";
			}
			else{
				messageDisplay.textContent = "Try again";
				this.style.backgroundColor = backgroundColor;
			}
		});
	}
	reset();
}

function reset(){
	colors = generateRandomColors(mode);
	pickedColor = pickColor();
	colorDisplay.textContent = pickedColor;
	for(var i = 0; i < squares.length; i++){
		if(colors[i]){
		squares[i].style.backgroundColor = colors[i];
		squares[i].style.display = "block";
		}
		else{
			squares[i].style.display = "none";
		}
	}
	resetButton.textContent = "New colors";
	messageDisplay.textContent = "";
	h1.style.backgroundColor = headingColor;
}

function changeColors(color){

	for (var i = 0; i < squares.length; i++){
		squares[i].style.backgroundColor = color;
	}

}
function pickColor(){
	var random = Math.floor(Math.random() * colors.length);
	return colors[random];
}

function randomColor(){
	var r = Math.floor(Math.random()*256);
	var g = Math.floor(Math.random()*256);
	var b = Math.floor(Math.random()*256);
	return "rgb(" + r + ", " + g + ", " + b + ")";
}

function generateRandomColors(num){
	var arr = []
	for (i = 0; i < num; i++){
		arr.push(randomColor());
	}
	return arr;
}