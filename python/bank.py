import os

class Bank:
    def __init__(self, aNum, balance):
        self.acc_num = aNum
        self.__bal = balance

    def showDetails(self):
        print("Account number: ",self.acc_num)
        print("Balance ",self.__bal)

    def debit(self):
        num = int(input("Enter amt:  "))
        if(self.__bal - num >= 0):
            self.__bal -= num
        else:
            print("Balance is low")
        self.showDetails()

    def credit(self):
        num = int(input("Enter amt:  "))
        self.__bal += num
        self.showDetails()

    def checkNum(self, accNo):
        if(self.acc_num == accNo):
            return True
        else:
            return False




#main
os.system("cls")

customer = []

for i in range(1,3):
    print("\nCustomer ",i)
    acc_num = int(input("Enter acc num: "))
    bal = int(input("Enter bank balance:  "))
    cust1 = Bank(acc_num, bal)
    customer.append(cust1)

def validateAcc(acNum):
    for i in range(len(customer)):
        if customer[i].checkNum(acNum):
            return i
    return -1

while(True):
    print("""\nOperations: 
      1. Credit
      2. Debit
      3. Show Details
      4. Exit""")
    
    choice = int(input("Enter a choice: "))
    if(choice > 4):
        print("Enter valid number")
        continue

    no = int(input("Enter account number:  "))
    i = validateAcc(no)

    if(i != -1):
        match choice:
            case 1:
                customer[i].credit()
            case 2:
                customer[i].debit()
            case 3:
                customer[i].showDetails()
            case 4:
                break
    else:
        print("Enter valid account number")
