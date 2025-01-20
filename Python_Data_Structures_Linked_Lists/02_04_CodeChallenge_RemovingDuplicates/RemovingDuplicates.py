'''
Task: While traversing the linked list
remove any duplicate nodes.

Example 1:
  input: 2 -> 3 -> 4 -> 5 -> 5 -> 5
  output: 2 -> 3 -> 4 -> 5
'''

# Python code​​​​​​‌‌​​​‌​‌‌​‌​‌‌​‌‌​​​‌​​‌​ below

def remove_duplicates(ll):
        # current pointer
        current = ll

        # while current and curren.next not null
        while current and current.next:
            # skip the node 
            if current.val == current.next.val:
                current.next = current.next.next
            else:
                # move to next node
                current = current.next
            
        return current
