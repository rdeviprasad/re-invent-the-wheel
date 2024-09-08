# Dynamic Programming

## When do we use DP?
1. Count something, often the number of ways
2. minimize or maximize certain value
3. Yes/No Questions

## Iteration vs Recursion

| Iteration | Recursion |
| --- | --- |
| Speed | Easier to apply |
| Easier complexity | Fewer states |
| Shorter code | Order doesn't matter |
| Harder technique |  |

## Fibonacci
F[0] = 0, F[1] = 1
F[i] = F[i - 1] + F[i - 2]

f(5) -> f(4) + f(3)
f(5) -> f(3) + f(2) + f(2) + f(1)
f(5) -> f(2) + f(1) + f(1) + f(0) + f(1) + f(0) + f(1)
f(5) -> f(1) + f(0) + f(1) + f(1) + f(0) + f(1) + f(0) + f(1)

Lots of duplicate computations.
Repeated sub problems are present.
By storing the sub-problem values, the tree goes from exponential to linear

```Java
f[0] = 0;
f[1] = 1;
for(int i = 2; i <= n; i++) {
    f[i] = f[i - 1] + f[i - 2];
}
return f[n];
```

## Stairs
You are climbing stairs. It takes N steps to reach to the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

When we are at ith step, how we reached till i doesn't matter. So the state can be represented as dp[i].
int dp[i] if we are planning to count ways or finding minimum or maximum ways.
It will be boolean dp[i] if we are answering a yes/no question.

answer = dp[N];

transition -> dp[i] = dp[i - 1] + dp[i - 2];

### What if the problem said to find with at most k jumps

then state will be int dp[i][k];

answer:
```Java
int result = 0;
for(int j = 0; j < k; j++) {
    result += dp[N][j];
}
```

Transition:
```Java
dp[i][j] = dp[i - 1][j - 1] + dp[i - 2][j - 1];
```

## Minimum Path Sum
Given a grid, find a path from top-left to bottom-right corner that minimizes the sum of numbers along the path. You can move only right or down.

state will be int dp[row][col]<br>
transition will be dp[row][col] = min(dp[row - 1][col], dp[row][col - 1]) + grid[row][col];

### What if the problem saide that you cannot take two consecutive moves in the same direction?
Then the state will be dp[row][col][move];
transition will be dp[row][col][move] = min(dp[row - 1][col][flip of the move], dp[row][col - 1][flip of the move]) + grid[row][col];

## Combination Sum
Given the target value N and an array of allowed numbers, count ways to write N as the sum of those numbers.
Here state is int dp[i] where i is the sum.
And transition will be 
```Java
// backward
dp[0] = 1;
for(i in 1..N)
    for(x in nums)
        dp[i] += dp[i - x]

// forward
dp[0] = 1;
for(i in 0..N - 1)
    for( x in nums)
        dp[i + x] += dp[i]

```

## Coin Change (min)
You are given denominations of coins and target N. What is the minimum number of coins used?

```
coins = [1, 2, 5], N = 11, ans = 3

coins = [1, 3, 4], N = 6, ans = 2
```

code:
```
dp[0] = 1;
for(i in 1..N)
    dp[i] = INF
for (i in 1..N)
    for( x in nums)
        dp[i] = min(dp[i], dp[i - x] + 1)
```

## Coin Change (ways)
You are given denominations of coins and target N. What are the number of ways to make up the amount N? Order doesn't matter.

```
coins = [1, 2, 5], N = 5
5
2 + 2 + 1
2 + 1 + 1 + 1
1 + 1 + 1 + 1 + 1
ans = 4
```

Here if we use same pattern as combination sum, we run into double counting. Hence state is dp[s][last] where s is sum and last is the last used denomination

## Classical DP Problems
- 0-1 Knapsack
- Subset Sum
- Longest Increasing Subsequence
- Counting all possible paths in a matrix
- Longest Common Subsequence
- Longest path in a DAG
- Longest Palindromic Subsequence
- Rod Cutting
- Edit Distance
- Text Justification
- Egg dropping problem