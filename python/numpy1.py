import numpy as np

arr1 = np.array([1, 2, 3, 4, 5])
arr2 = np.array([5, 4, 3, 2, 1])

sum_arr = arr1 + arr2
diff_arr = arr1 - arr2
prod_arr = arr1 * arr2
quot_arr = arr1 / arr2

print("Original Arrays:")
print("arr1:", arr1)
print("arr2:", arr2)

print("\nSum:")
print(sum_arr)

print("\nDifference:")
print(diff_arr)

print("\nProduct:")
print(prod_arr)

print("\nQuotient:")
print(quot_arr)
