import random
import pygame
from board import *

pygame.init()
size = 100
screen = pygame.display.set_mode((size * 3, size * 4))
pygame.display.set_caption("Ticktacktoe")
done = False
clock = pygame.time.Clock()
board_array = [[0, 0, 0],
               [0, 0, 0],
               [0, 0, 0]]
player = ["first", "second"]
current_player = [""]
t = ["click to play"]
font = pygame.font.SysFont(None, 24)
text = font.render(t[0], True, (255, 255, 255))
isstart=[False]
while not done:
    screen.fill((255, 0, 0))
    board(screen, size)
    square(board_array, screen, size)
    text = font.render(str(t[0]), True, (255, 255, 255))
    screen.blit(text, (0,300))
    check(board_array,t,isstart,current_player)
    for event in pygame.event.get():
        # print(event)
        if event.type == pygame.QUIT:
            done = True
        start(isstart, event, board_array, t, current_player)
        if isstart[0]:
            click(board_array, size, event, current_player, t)
    pygame.display.update()
    clock.tick(10)
    print(current_player,isstart,t)
