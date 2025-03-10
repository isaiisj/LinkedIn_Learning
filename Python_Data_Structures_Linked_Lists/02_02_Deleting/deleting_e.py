class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LL:
    def __init__(self):
        self.head = None 

    def append(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        
        current = self.head 
        while current.next:
            current = current.next
        current.next = new_node 

    def search(self, data):
        current = self.head 
        while current:
            if current.data == data:
                return True
            current = current.next
        return False

    def delete(self, data):
        if not self.head:
            return 

        if self.head.data == data:
            self.head = self.head.next
            return

        current = self.head 
        while current.next:
            if current.next.data == data:
                current.next = current.next.next
                return
            current = current.next

    def print(self):
        output = []
        current = self.head
        while current:
            output.append(str(current.data))
            current = current.next 
        print('->'.join(output))

elements = [0,1,2,3,4,5,6,7,8,9]

ll = LL()
for e in elements:
    ll.append(e)

ll.print()

ll.delete(0)
ll.delete(5)
ll.delete(9)

ll.print()
