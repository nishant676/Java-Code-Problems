# Q1. Check if All A's Appears Before All B's

## Given a string s consisting of only the characters 'a' and 'b', return true if every 'a'appears before every 'b' in the string. Otherwise, return false.

 **Example 1:**
 Input: s = "aaabbb"
 Output: true
 Explanation:
 The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
 Hence, every 'a' appears before every 'b' and we return true.

 **Example 2:**
 Input: s = "abab"
 Output: false
 Explanation:
 There is an 'a' at index 2 and a 'b' at index 1.
 Hence, not every 'a' appears before every 'b' and we return false

 # Q2.Count Common Words With One Occurrence

## Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.

**Example 1:**
 Input: words1 = ["leetcode","is","amazing","as","is"], words2 = 
["amazing","leetcode","is"]
 Output: 2
 Explanation:- "leetcode" appears exactly once in each of the two arrays. We count this string.- "amazing" appears exactly once in each of the two arrays. We count this string.- "is" appears in each of the two arrays, but there are 2 occurrences of it in words1. 
We do not count this string.- "as" appears once in words1, but does not appear in words2. We do not count this 
string

>[!NOTE]
> If u wnat only key from one map use **mp.heySet()**