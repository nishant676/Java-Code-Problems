# Q1.Reverse Prefix of Word
## Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, 
if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

**Example 1:**
Input: word = "abcdefd", ch = "d" Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd". 

**Example 2:**
Input: word = "xyxzxe", ch = "z" Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe". 

# Q2. Split a String in Balanced Strings 

## Balanced strings are those that have an equal quantity of 'L' and 'R' characters.Given a balanced string s, split it into some number of substrings such that:Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

**Example 1:**
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

**Example 2:**
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.

**Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.**

# Q3.Check If Two String Arrays are Equivalent

## Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.


**Example 1:**
Input: word1 = ["ab", "c"], word2 = ["a", "bc"] Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc" word2 represents string "a" + "bc" -> "abc" The strings are the same, so return true.

**Example 2:**
Input: word1 = ["a", "cb"], word2 = ["ab", "c"] Output: false
word1[i] and word2[i] consist of lowercase letters

