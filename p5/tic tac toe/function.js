function board(size1) {
    let x = []
    let y = []
    for (let i = 0; i < 3; i++) {
        x[i] = i * size1
        y[i] = i * size1
    }
    fill(0, 0, 0, 0)
    for (let i = 0; i < 3; i++) {
        line(x[i], 0, x[i], size1 * 3)
        line(0, y[i], size1 * 3, y[i])
    }
    line(0, size1 * 3, size1 * 3, size1 * 3)
    rect(0, 0, size1 * 3, size1 * 3)
}
function square1(board_array, size1) {
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            if (board_array[i][j] == 1) {
                fill(0, 255, 0)
                rect(j * size1 + 1, i * size1 + 1, size1 - 1, size1 - 1)
            }
            if (board_array[i][j] == 2) {
                fill(0, 0, 255)
                rect(j * size1 + 1, i * size1 + 1, size1 - 1, size1 - 1)
            }
        }

    }
}
function check(board_array, text1, isstart, current_player,green_win,blue_win) {
    let c = 0;
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            if (board_array[i][j] != 0) {
                c = c + 1
            }
        }
    }
    for (var i = 0; i < 3; i++) {
        if (board_array[i][0] == 1 && board_array[i][1] == 1 && board_array[i][2] == 1) {
            text1[0] = "winner green and click again"
            isstart[0] = true
            green_win[0]=green_win[0]+1
        }
        if (board_array[i][0] == 2 && board_array[i][1] == 2 && board_array[i][2] == 2) {
            text1[0] = "winner blue and click again"
            isstart[0] = true
            blue_win[0]=blue_win[0]+1
        }
        if (board_array[0][i] == 1 && board_array[1][i] == 1 && board_array[2][i] == 1) {
            text1[0] = "winner green and click again"
            isstart[0] = true
            green_win[0]=green_win[0]+1
        }
        if (board_array[0][i] == 2 && board_array[1][i] == 2 && board_array[2][i] == 2) {
            text1[0] = "winner blue and click again"
            isstart[0] = true
            blue_win[0]=blue_win[0]+1
        }
    }
    if (board_array[0][0] == 1 && board_array[1][1] == 1 && board_array[2][2] == 1) {
        text1[0] = "winner green and click again"
        isstart[0] = true
        green_win[0]=green_win[0]+1
    }
    if (board_array[0][0] == 2 && board_array[1][1] == 2 && board_array[2][2] == 2) {
        text1[0] = "winner blue and click again"
        isstart[0] = true
        blue_win[0]=blue_win[0]+1
    }
    if (board_array[0][2] == 2 && board_array[1][1] == 2 && board_array[2][0] == 2) {
        text1[0] = "winner blue and click again"
        isstart[0] = true
        blue_win[0]=blue_win[0]+1
    }
    if (board_array[0][2] == 1 && board_array[1][1] == 1 && board_array[2][0] == 1) {
        text1[0] = "winner green and click again"
        isstart[0] = true
        green_win[0]=green_win[0]+1
    }
    if (c == 9) {
        text1[0] = "tie"
        isstart[0] = true
    }
}
function start(played, isstart, current_player, text1, board_array) {
    if (mouseIsPressed) {
        if (0 < mouseX && mouseX <= size1 * 3 && size1 * 3 < mouseY && mouseY <= mouseY * 4) {
            current_player[0] = random(["green", "blue"])
            text1[0] = "turn: " + current_player[0]
            isstart[0] = false
            for (let i = 0; i < 3; i++) {
                for (let j = 0; j < 3; j++) {
                    board_array[i][j] = 0
                }
            }
            played[0]=played[0]+1
        }
    }
}
function click(board_array, current_player, text1, size1) {
    if (current_player[0] == "green") {
        if (mouseIsPressed) {
            for (let i = 0; i < 3; i++) {
                for (let j = 0; j < 3; j++) {
                    if (j * size1 < mouseX && mouseX <= (j + 1) * size1 && i * size1 < mouseY && mouseY <= (i + 1) * size1) {
                        if (board_array[i][j] == 0) {
                            board_array[i][j] = 1
                            current_player[0] = "blue"
                            text1[0] = "turn: " + "blue"
                        }
                    }
                }
            }
        }

    }
    if (current_player[0] == "blue") {
        if (mouseIsPressed) {
            for (let i = 0; i < 3; i++) {
                for (let j = 0; j < 3; j++) {
                    if (j * size1 < mouseX && mouseX <= (j + 1) * size1 && i * size1 < mouseY && mouseY <= (i + 1) * size1) {
                        if (board_array[i][j] == 0) {
                            board_array[i][j] = 2
                            current_player[0] = "green"
                            text1[0] = "turn: " + "green"
                        }
                    }
                }
            }
        }

    }
}
