function board(size) {
    let x = []
    let y = []
    for (let i = 0; i < 3; i++) {
        x[i] = i * size
        y[i] = i * size
    }
    fill(0, 0, 0, 0)
    for (let i = 0; i < 3; i++) {
        line(x[i], 0, x[i], size * 3)
        line(0, y[i], size * 3, y[i])
    }
    line(0, size * 3, size * 3, size * 3)
    rect(0, 0, size * 3, size * 3)
}
function square1(board_array, size) {
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            if (board_array[i][j] == 1) {
                fill(0, 255, 0)
                rect(j * size + 1, i * size + 1, size - 1, size - 1)
            }
            if (board_array[i][j] == 2) {
                fill(0, 0, 255)
                rect(j * size + 1, i * size + 1, size - 1, size - 1)
            }
        }

    }
}
function check(board_array, text1, isstart, current_player) {
    var c=0
    for (var i = 0; i < 3; i++) {
        if (board_array[i][0] == 1 && board_array[i][1] == 1 && board_array[i][2] == 1) {
            text1[0] = "winner green"
            isstart[0] = true
        }
        if (board_array[i][0] == 2 && board_array[i][1] == 2 && board_array[i][2] == 2) {
            text1[0] = "winner blue"
            isstart[0] = true
        }
        if (board_array[0][i] == 1 && board_array[1][i] == 1 && board_array[2][i] == 1) {
            text1[0] = "winner green"
            isstart[0] = true
        }
        if (board_array[0][i] == 2 && board_array[1][i] == 2 && board_array[2][i] == 2) {
            text1[0] = "winner blue"
            isstart[0] = true
        }
    }
    for (let i = 0; i < 9; i++{
        c=c+1;
    }
    if (c==0) {
        text1[0] = "tie"
        isstart[0] = true
    }
    

}
