# 🧩 Two Sum

## 📌 Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to the target.

- Each input has exactly one solution
- You may not use the same element twice
- Return the answer in any order

---

## 🧪 Example

Input:
nums = [2, 7, 11, 15], target = 9

Output:
[0, 1]

Explanation:
nums[0] + nums[1] = 2 + 7 = 9

---

## 🚀 Approach 1: Brute Force

### 💡 Idea
Check all possible pairs and find the pair whose sum equals the target.

### ⏱️ Complexity
- Time Complexity: O(n^2)
- Space Complexity: O(1)

### 💻 Code
See `BruteForce.java`

---

## ⚡ Approach 2: Optimal (HashMap)

### 💡 Idea
Store elements in a HashMap and check if the complement (target - current element) exists.

### ⏱️ Complexity
- Time Complexity: O(n)
- Space Complexity: O(n)

### 💻 Code
See `Optimal.java`

---

## 🧠 Key Learnings
- Hashing helps reduce time complexity
- Trade-off between time and space
- Common interview pattern

---

## 🏁 Conclusion
Brute force works but is slow.  
Optimal solution using HashMap is efficient and preferred in interviews.
