class LinkedList:
    def __init__(self, val):
        self.value = val
        self.next = None


class Solution():
    def isPalindrome(self, head):
        rev = None
        slow = fast = head
        while fast and fast.next:
            fast = fast.next.next
            rev, rev.next, slow = slow, rev, slow.next
        if fast:
            slow = slow.next
        while rev and rev.val == slow.val:
            slow = slow.next
            rev = rev.next
        return not rev


if __name__ == "__main__":

    a = LinkedList(1)
    b = LinkedList(2)
    c = LinkedList(3)
    d = LinkedList(4)
    e = LinkedList(5)
    f = LinkedList(6)
    g = LinkedList(7)
    a.next = b
    b.next = c
    c.next = d
    d.next = e
    e.next = f
    f.next = g
    result = Solution()
    result.isPalindrome(a)
