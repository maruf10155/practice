n = 5
var arrtemp = []
var t = []
let x = [];
let y = []
var arr = [
  [0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0],
  [0, 1, 1, 1, 0],
  [0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0]
];
function setup() {
  createCanvas(400, 400)
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      t.push(0)
    }
    arrtemp[i] = t.slice(i, i + n)
  }
  s = width / n;
  for (let i = 0; i < n; i++) {
    x.push(i * s);
    y.push(i * s);
  }

}

function draw() {
  background(0);
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      if (arr[i][j] == 1) {
        fill(255, 0, 255);
        rect(x[j], y[i], s, s);
      }
    }
  }
  for (let i = 1; i < n-1; i++) {
    for (let j = 1; j < n-1; j++) {
      // count(i, j)
      // console.log(c)
      c = 0
      for (let k = -1; k <= 1; k++) {
        for (let l = -1; l <= 1; l++) {
          if (arr[i + k][j + l] == 1 || arr[i + k][j + l] == 0) {
            c = c + arr[i + k][j + l];
          }
        }
      }
      c = c - arr[i][j]
      if (arr[i][j] == 1) {
        if (c == 2 || c == 3) {
          arrtemp[i][j] = 1;
        } else {
          arrtemp[i][j] = 0;
        }
      } else {
        if (c == 3) {
          arrtemp[i][j] = 1;
        }
      }
    }
  }
  arr = arrtemp;
  frameRate(1);
}
function count(i, j) {
  c = 0
  for (let k = -1; k <= 1; k++) {
    for (let l = -1; l <= 1; l++) {
      if (arr[i + k][j + l] == 1 || arr[i + k][j + l] == 0) {
        c = c + arr[i + k][j + l];
      }
    }
  }
  c = c - arr[i][j]
  return c
}