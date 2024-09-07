# Dynamic Programming
General, powerful algorithm design technique  
Specially good for optimization problem  
DP - Careful brute force  
DP = subproblems + reuse  
DP = recursion + memoization
## How to compute Fibonacci number
F<sub>1</sub> = F<sub>2</sub> = 1  
F<sub>n</sub> = F<sub>n - 1</sub> + F<sub>n - 2</sub>  
Goal : Compute F<sub>n</sub> (That fits in a word)  
### Naive recursive algorithm
```python
#exponential time
fib(n):
    if n <= 2: f = 1
    else: f = fib(n - 1) + fib(n - 2)
    return f
```

### Memoized DP algorithm
```python
memo = {}
fib(n):
    if n in memo return memo[n]
    if n <= 2: f = 1
    else: f = fib(n - 1) + fib(n - 2)
    memo[n] = f
    return f
```
### Bottom-up DP algorithm
```python
fib = {}
fib(n):
    for k in range(1, n + 1):
        if k <= 2: f = 1
        else: f = fib[k - 1] + fib[k - 2]
        fib[k] = f
    return fib[n]
```
## 5 Step Process
1. Define subproblems
2. Guess (part of solution)
3. Relate subproblem solution (recurrence)
4. recurse & memoize (or build DP table bottom-up)
5. Solve original problem

## Text Justification
Split a given text into "good" lines.  
"good" = 
text = list of words  
badness(i, j): use words[i:j] as a line
```python
badness(i, j):
    if page_width < word_width: return inf
    else: return (page_width - word_width)**3
```

### subproblems
