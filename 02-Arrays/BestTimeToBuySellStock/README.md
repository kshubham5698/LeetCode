# 📈 Best Time to Buy and Sell Stock

## 📌 Problem Statement
You are given an array `prices` where `prices[i]` is the price of a stock on day `i`.

You want to maximize your profit by choosing:
- One day to buy
- One later day to sell

Return the maximum profit you can achieve.

If no profit is possible, return 0.

---

## 🧪 Example

Input:
prices = [7,1,5,3,6,4]

Output:
5

Explanation:
Buy on day 2 (price = 1) and sell on day 5 (price = 6)
Profit = 6 - 1 = 5

---

## 🚀 Approach 1: Brute Force

### 💡 Idea
Check every possible pair (buy day, sell day) and calculate profit.

### ⏱️ Complexity
- Time Complexity: O(n^2)
- Space Complexity: O(1)

---

## ⚡ Approach 2: Optimal (Single Pass)

### 💡 Idea
- Track minimum price so far
- Calculate profit at each step
- Update max profit

### ⏱️ Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

---

## 🧠 Key Learnings
- Greedy approach
- Track min/max efficiently
- Important interview pattern

---

## 🏁 Conclusion
Brute force is simple but slow.  
Optimal approach gives best performance using one pass.
