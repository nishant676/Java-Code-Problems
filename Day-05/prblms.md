> [!IMPORTANT]

># Q1.Increasing Decreasing String
 
 ## You are given a string s. Reorder the string using the following algorithm:
 
 ### Pick the smallest character from s and append it to the result.

### Pick the smallest character from s which is greater than the last appended character to the result and append it.

### Repeat step 2 until you cannot pick more characters.

### Pick the largest character from s and append it to the result.

### Pick the largest character from s which is smaller than the last appended character to the result and append it.
 
### Repeat step 5 until you cannot pick more characters.

### Repeat the steps from 1 to 6 until you pick all characters from s.

### In each step, If the smallest or the largest character appears more than once you can 
### choose any occurrence and append it to the result.
 Return the result string after sorting s with this algorithm.

 **Example 1:**
 Input: s = "aaaabbbbcccc"
 Output: "abccbaabccba"
 Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
 After steps 4, 5 and 6 of the first iteration, result = "abccba"
 First iteration is done. Now s = "aabbcc" and we go back to step 1
 After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"

** Example 2:**
 Input: s = "rat"
 Output: "art"
 Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned 
algorithm

# Q2.  Minimize String Length

## Given a 0-indexed string s, repeatedly perform the following operation any number of times:
## Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if any) and the closest occurrence of c to the right of i (if any).Your task is to minimize the length of s by performing the above operation any 
number of times.
 Return an integer denoting the length of the minimized string.

 **Example 1:**
 Input: s = "aaabc"
 Output: 3
 Explanation: In this example, s is "aaabc". We can start by selecting the character 'a' 
at index 1. We then remove the closest 'a' to the left of index 1, which is at index 0, 
and the closest 'a' to the right of index 1, which is at index 2. After this operation, the 
string becomes "abc". Any further operation we perform on the string will leave it 
unchanged. Therefore, the length of the minimized string is 3.