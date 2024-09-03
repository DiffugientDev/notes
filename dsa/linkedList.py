class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def display(self):
        if(self.head == None):
            print("List is Empty")
            return
        currentNode = self.head
        while(currentNode != None):
            print(currentNode.data , end = " ")
            currentNode = currentNode.next

    def insertBegin(self, data):
        newNode = Node(data)
        if(self.head == None):
            self.head = newNode
            return
        newNode.next = self.head
        self.head = newNode
    
    def insertEnd(self, data):
        newNode = Node(data)
        if self.head is None: 
            self.head = newNode
            return 
        currentNode = self.head
        while(currentNode.next != None):
            currentNode = currentNode.next
        currentNode.next = newNode

    def insertIndex(self, index, data):
        newNode = Node(data)
        if(self.head == None):
            self.head = newNode
            return
        currentNode = self.head
        for i in range(0,index-1):
            currentNode = currentNode.next
        newNode.next = currentNode.next  
        currentNode.next = newNode

    def insertData(self, dataPrev, dataNew):
        newNode = Node(dataNew)
        if(self.head == None):
            self.head = newNode
        currentNode = self.head
        while(currentNode.data != dataPrev and currentNode != None):
            currentNode = currentNode.next
        newNode.next  = currentNode.next
        currentNode.next = newNode

    def deleteBegin(self):
        if(self.head == None):
            print("List is Empty")
            return
        n = self.head.data
        self.head = self.head.next
        return n

    def deleteEnd(self):
        if(self.head == None):
            print("List is Empty")
            return
        current = self.head
        while(current.next.next != None):
            current = current.next
        current.next = None
    
    def deleteData(self, data):
        if(self.head == None):
            print("List in Empty")
            return
        current = self.head
        prev = current
        while(current.data != data and current != None):
            prev = current
            current = current.next
        x = current.data
        prev.next = current.next
        return(x)

list1 = LinkedList()
list1.insertBegin(4)       
list1.insertBegin(3)       
list1.insertBegin(2)       
list1.insertBegin(1)

list1.insertEnd(5)
list1.insertIndex(2,34)
list1.insertData(3,65)


list1.deleteData(2)
list1.display()


            

