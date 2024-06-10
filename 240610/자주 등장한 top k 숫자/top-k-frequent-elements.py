# 입력
n, k = list(map(int, input().split()))
numbers = list(map(int, input().split()))

# numbers 배열 돌면서 각 숫자의 등장 횟수 저장하기
cnt_dict = dict()
for number in numbers:
    if cnt_dict.get(number) == None:
        cnt_dict[number] = 1
    else:
        cnt_dict[number] += 1

# cnt_dict 돌면서 (숫자, 등장횟수) 형태로 배열에 저장하기
cnt_lst = list()
for key, val in cnt_dict.items():
    cnt_lst.append((key, val))

# 배열 정렬하기 : 1순위 등장 횟수, 2순위 값이 큰 숫자

cnt_lst = sorted(cnt_lst, key=lambda x: (x[1], x[0]), reverse=True)

# 가장 많이 등장한 숫자부터 k개의 숫자를 공백을 사이에 두고 출력
for i in range(k):
    print(cnt_lst[i][0], end=" ")