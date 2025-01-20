'''
Task: write a function get_midpoint, that
returns the data at the midpoint of a linked
list, while only traversing it once.

Example 1:
  input: [3,1,4,1,5]
  output: 4

Example 2:
  input: [2,7,1,8,2,8,4]
  output: 8
'''

# Python code​​​​​​‌‌​​​‌​‌​‌​​‌​​‌​​‌‌​‌​​​ below


def get_midpoint(numbers):
    # Your code goes here

    # if there isn´t any node
    if not numbers.head:
        return 0

    # two pointers fast and slow
    slow = numbers
    fast = numbers

    # move slow onde step and fast
    # two steps each time until fast
    # and fast.next is not null
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

    return slow.data
