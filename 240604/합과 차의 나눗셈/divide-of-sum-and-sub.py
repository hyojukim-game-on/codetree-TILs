numbers = list(map(int, input().split()))
a, b = numbers
sum_v = a + b
diff_v = a - b
result = round(sum_v / diff_v , 2)
print(result)