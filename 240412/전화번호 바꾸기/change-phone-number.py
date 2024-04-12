phone_number = list(input().split('-'))
phone_number[1], phone_number[2] = phone_number[2], phone_number[1]
print('-'.join(phone_number))