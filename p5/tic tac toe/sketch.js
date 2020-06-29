let size1 = 100
let board_array = [[0, 0, 0],
[0, 0, 0],
[0, 0, 0]]
let text1 = ["welcome click to play"]
let isstart = [true]
let player = ["green", "blue"]
let current_player = [""]
let played = [0]
let green_win = [0]
let blue_win = [0]
function setup() {
  createCanvas(size1 * 3, size1 * 4)
}
function draw() {
  background(255, 255, 255)
  fill(0)
  textSize(24);
  text(text1[0], 00, 320);
  text("green won: " + green_win[0], 00, 340);
  text("blue won: " + blue_win[0], 00, 360);
  text("total played: " + (played[0] - 1), 0, 380)
  board(size1)
  square1(board_array, size1)
  if (isstart[0]) {
    start(played, isstart, current_player, text1, board_array);
  }
  if (!isstart[0]) {
    click(board_array, current_player, text1, size1)
    check(board_array, text1, isstart, current_player, green_win, blue_win)
  }

  // console.log(isstart)
  frameRate(10)
}