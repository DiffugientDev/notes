#merge 2 tuples

a = (1,2,3,4)
b = ('A','D','S','D')

if(len(a) == len(b)):
    merge = dict(zip(a,b))

print(a, end = " ")
print()
print(b, end = " ")
print()
print(merge, end = " ")

