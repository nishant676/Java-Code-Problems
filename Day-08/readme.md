# Q1.Substrings of Size Three with Distinct Characters
 
 ## A string is good if there are no repeated characters. Given a string s, return the number of good substrings of length three in s.

 ### Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 A substring is a contiguous sequence of characters in a string.
 
 **Example 1:**
 Input: s = "xyzzaz"
 Output: 1
 Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

# Q2. Split Strings by Separator

## Given an array of strings words and a character separator, split each string in words by separator.Return an array of strings containing the new strings formed after the splits, excluding empty strings.
 
 >[!NOTE]
 >separator is used to determine where the split should occur, but it is not included as part of the resulting strings.
 A split may result in more than two strings.
 The resulting strings must maintain the same order as they were initially given.
 
 **Example 1:**
 Input: words = ["one.two.three","four.five","six"], separator = "."
 Output: ["one","two","three","four","five","six"]
 Explanation: In this example we split as follows:
 "one.two.three" splits into "one", "two", "three"
 "four.five" splits into "four", "five"
 "six" splits into "six" 

 >[!NOTE]
 > in String can not use " . " directly u have to use "\\." then it'll use proper 