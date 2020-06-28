import pygame

pygame.init()
size = 300
screen = pygame.display.set_mode((size, size + 100))
pygame.display.set_caption("Ticktacktoe")
done = False
player = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
clock = pygame.time.Clock()
x = [100, 200]
y = [100, 200]
xpos = [1, 101, 201]
ypos = [1, 101, 201]
xcond = [0, 100, 200, 300]
ycond = [0, 100, 200, 300]
while not done:
    screen.fill((255, 0, 0))
    # draw line
    for i in range(2):
        pygame.draw.line(screen, (0, 0, 0,), (x[i], 0), (x[i], size))
        pygame.draw.line(screen, (0, 0, 0,), (0, y[i]), (size, y[i]))
        pygame.draw.rect(screen, (255, 255, 255), (0, size, size, 100), 1)
        pygame.draw.rect(screen, (0, 0, 0), (0, 0, size, size), 1)
    for i in range(3):
        for j in range(3):
            if player[i][j] == 1:
                pygame.draw.rect(screen, (0, 255, 0), (xpos[i], ypos[j], 99, 99))
            if player[i][j] == 2:
                pygame.draw.rect(screen, (0, 0, 255), (xpos[i], ypos[j], 99, 99))
    for event in pygame.event.get():
        print(event)
        if event.type == pygame.QUIT:
            done = True
        if (event.type == pygame.MOUSEBUTTONUP):

    pygame.display.update()
    clock.tick(10)
