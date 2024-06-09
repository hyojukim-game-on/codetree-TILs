N = int(input())
hash = dict()
for line in range(N):
    directives = list(input().split())
    cmd = directives[0]
    if cmd == 'add':
        add_key = directives[1]
        add_value = directives[2]
        # hash.setdefault(directives[1], directives[2])
        hash[add_key] = add_value
    elif cmd == 'remove':
        remove_key = directives[1]
        hash.pop(remove_key)
    elif cmd == 'find':
        find_key = directives[1]
        find_value = hash.get(find_key)
        if find_value != None:
            print(find_value)
        else:
            print(None)