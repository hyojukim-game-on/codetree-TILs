N = int(input())
board = []
# 보드 만들기 (입력받기)
for _ in range(N):
    board.append(list(map(int,input().split())))
# 3*3의 시작점에서 할일 : 가로+2,세로+2 돌면서 this_coin 업데이트 하고 max_value 갱신
# 그 다음 시작점으로 시작점 옮겨주기
# 시작점이 (N-2,N-2)가 되면 그만하기
max_value = 0
directions = [(0,1),(0,2),(1,0),(1,1),(1,2),(2,0),(2,1),(2,2)]
for cr in range(0, N-1):
    this_coin = 0
    for cc in range(0, N-1):
        this_coin = 0
        if board[cr][cc] == 1:
            this_coin += 1
        for d in range(8):
            nr = cr + directions[d][0]
            nc = cc + directions[d][1]
            if 0<=nr<N and 0<=nc<N:
                if board[nr][nc] == 1:
                    this_coin += 1
        if this_coin >= max_value:
            max_value = this_coin
print(max_value)