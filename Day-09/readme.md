# Q1.Kth Distinct String in an Array

## A distinct string is a string that is present only once in an array. Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

 Note that the strings are considered in the 
 order in which they appear in the array.
 
 **Example 1:**
 Input: arr = ["d","b","c","b","c","a"], k = 2
 Output: "a"
 Explanation:
 The only distinct strings in arr are "d" and "a".
 "d" appears 1st, so it is the 1st distinct string.
 "a" appears 2nd, so it is the 2nd distinct string.
 Since k == 2, "a" is returned.

 # Q2.  Count Prefixes of a Given String

 ## You are given a string array words and a string s, where words[i] and s comprise onlyof lowercase English letters. Return the number of strings in words that are a prefix of s.

 ### A prefix of a string is a substring that occurs at the beginning of the string. A 
substring is a contiguous sequence of characters within a string.
 
 **Example 1:**
 Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
 Output: 3
 Explanation:
 The strings in words which are a prefix of s = "abc" are:
 "a", "ab", and "abc".
Thus the number of strings in words which are a prefix of s is 3.

 **Example 2:**
 Input: words = ["a","a"], s = "aa o/p-> 2

 >[!NOTE]
 > TO check Prefix use String method **s.startsWith(word)** 