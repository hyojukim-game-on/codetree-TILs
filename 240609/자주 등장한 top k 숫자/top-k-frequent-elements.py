from collections import defaultdict

# 입력
n, k = list(map(int, input().split()))
numbers = list(map(int, input().split()))

# 숫자 key , 나온 횟수 value 로 hash 해서 저장
counting = defaultdict(int)
for number in numbers:
    counting[number] += 1

# 가장 많이 등장한 숫자가 나온 횟수 저장
max_value = 1
for count in counting.values():
    if count >= max_value:
        max_value = count


# 가장 많이 등장한 숫자(들)을 배열에 저장
print_this = []
for number in counting.keys():
    if counting[number] == max_value:
        print_this.append(number)

# 숫자(들)을 내림차순 정렬
print_this.sort(reverse=True)

# 가장 많이 나온 숫자(들)을 출력
print(*print_this)