# Remove Nth Node From End – Java
## 📌 Overview

This method removes the Nth node from the end of a singly linked list using the list's maintained size variable.

Instead of using the two-pointer approach, this implementation:

Calculates the position from the beginning.

Traverses to that node.

Updates links to remove it.

Returns the deleted node’s data.

## 🔎 Method Explanation
public int getRemove(int n)

Logic Flow:

If n == size, it means the head node must be removed.

Compute position from start:

pos = size - n + 1

Traverse until reaching that position.

Adjust prev.next to skip the target node.

Return the removed node’s data.

## ⚙️ Time & Space Complexity

Time Complexity: O(N)

Space Complexity: O(1)

## ✅ Edge Cases Handled

Removing the head node

Removing the last node

Removing a node from the middle

## 🎯 Learning Outcome

Understanding positional deletion in linked lists

Pointer manipulation (prev, curr)

Relationship between size and index-based deletion
