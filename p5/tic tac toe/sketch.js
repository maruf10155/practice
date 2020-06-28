let size = 100
board_array = [[0, 1, 1],
               [2, 2, 1],
               [2, 2, 1]]
let text1 =["welcome"]
let isstart=[false]
let player=["green","blue"]
let current_player=[""]
function setup() {
  createCanvas(size*3,size*4)
}
text="welcome"
function draw() {
  background(255,0,0)
  fill(255)
  textSize(32);
  text(text1[0], 00, 325);
  board(size)
  square1(board_array,size)
  check(board_array,text1,isstart,current_player)
}
