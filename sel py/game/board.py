import random

import pygame


def board(screen, size):
    x = [i * size for i in range(1, 3)]
    y = [i * size for i in range(1, 3)]
    for i in range(0, 2):
        pygame.draw.line(screen, (0, 0, 0,), (x[i], 0), (x[i], size * 3))
        pygame.draw.line(screen, (0, 0, 0,), (0, y[i]), (size * 3, y[i]))
    pygame.draw.rect(screen, (0, 0, 0), (0, 0, size * 3, size * 4), 1)
    pygame.draw.line(screen, (0, 0, 0,), (0, size * 3), (size * 3, size * 3))


def square(board_array, screen, size):
    for i in range(3):
        for j in range(3):
            if board_array[i][j] == 1:
                pygame.draw.rect(screen, (0, 255, 0), (j * size + 1, i * size + 1, size - 1, size - 1))
            if board_array[i][j] == 2:
                pygame.draw.rect(screen, (0, 0, 255), (j * size + 1, i * size + 1, size - 1, size - 1))


def click(board_array, size, event, current_player, t):
    if current_player[0] == "first":
        if event.type == pygame.MOUSEBUTTONDOWN:
            for i in range(3):
                for j in range(3):
                    if (j * size < pygame.mouse.get_pos()[0] <= (j + 1) * size and i * size < pygame.mouse.get_pos()[
                        1] <= (i + 1) * size):
                        if board_array[i][j] == 0:
                            board_array[i][j] = 1
                            current_player[0] = "second"
                            t[0] = "second"
    if current_player[0] == "second":
        if event.type == pygame.MOUSEBUTTONDOWN:
            for i in range(3):
                for j in range(3):
                    if (j * size < pygame.mouse.get_pos()[0] <= (j + 1) * size and i * size < pygame.mouse.get_pos()[
                        1] <= (i + 1) * size):
                        if board_array[i][j] == 0:
                            board_array[i][j] = 2
                            current_player[0] = "first"
                            t[0] = "first"


def start(isstart, event, board_array, t, current_player):
    temp = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    if (board_array == temp and event.type == pygame.MOUSEBUTTONDOWN):
        cu= random.choice(["first", "second"])
        current_player[0]=cu
        t[0] = cu
        isstart[0] = True


def check(board_array, t, isstart, current_player):
    temp = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    p = ["first", "second", ""]
    p.remove(current_player[0])
    winner = p[0]
    for i in range(3):
        if (board_array[i][0] == board_array[i][1] == board_array[i][2] == 1 or board_array[i][0] == board_array[i][
            1] == board_array[i][2] == 2):
            t[0] = "winner " + winner + "\n" + " click again"
            for j in range(3):
                for k in range(3):
                    board_array[k][j] = 0
            isstart[0] = False
            current_player[0]=""
        if (board_array[0][i] == board_array[1][i] == board_array[2][i] == 1 or board_array[0][i] == board_array[1][
            i] == board_array[2][i] == 2):
            t[0] = "winner " + winner + " click again"
            for j in range(3):
                for k in range(3):
                    board_array[k][j] = 0
            isstart[0] = False
            current_player[0] = ""
    if (board_array[0][0] == board_array[1][1] == board_array[2][2] == 1 or board_array[0][0] == board_array[1][
        1] == board_array[2][2] == 2 or board_array[0][2] == board_array[1][1] == board_array[2][0] == 1 or
            board_array[0][2] == board_array[1][1] == board_array[2][0] == 2):
        t[0] = "winner " + winner + " click again"
        for j in range(3):
            for k in range(3):
                board_array[k][j] = 0
        isstart[0] = False
        current_player[0] = ""
    c = 0
    for j in range(3):
        for k in range(3):
            if board_array[k][j] != 0:
                c = c + 1
    if c == 9:
        t[0] = "tie" + " click again"
        for j in range(3):
            for k in range(3):
                board_array[k][j] = 0
        isstart[0] = False
        current_player[0] = ""
