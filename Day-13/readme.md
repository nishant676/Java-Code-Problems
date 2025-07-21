# Q1. Greatest English Letter in Upper and Lower Case

## Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be inuppercase. If no such letter exists, return an empty string. An English letter b is greater than another letter a if b appears after a in the English alphabet.
 
 **Example 1:**
 Input: s = "lEeTcOdE"
 Output: "E"
 Explanation:
 The letter 'E' is the only letter to appear in both lower and upper case.
 
 **Example 2:**
 Input: s = "arRAzFif"
 Output: "R"
 Explanation:
 The letter 'R' is the greatest letter to appear in both lower and upper case.
 Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 
'F' or 'A'.

# Q2.Count Pairs Of Similar Strings

## You are given a 0-indexed string array words. Two strings are similar if they consist of the same characters.

For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 
'c'.
 However, "abacba" and "bcfd" are not similar since they do not consist of the same 
characters.
 Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two 
strings words[i] and words[j] are similar.

**Example 1:**
 Input: words = ["aba","aabb","abcd","bac","aabc"]
 Output: 2
 Explanation: There are 2 pairs that satisfy the conditions:- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. - i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 
'c'. 

**Example 2:**
 Input: words = ["aabb","ab","ba"]
 Output: 3
 Explanation: There are 3 pairs that satisfy the conditions:- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'. - i = 0 and j = 2 : both words[0] and words[2] only consist of characters 'a' and 'b'.- i = 1 and j = 2 : both words[1] and words[2] only consist of characters 'a' and 'b