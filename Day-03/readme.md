# Q1. Determine if String Halves Are Alike.
 
 ## You are given a string s of even length. Split this string into two halves of equallengths, and let a be the first half and b be the second half. Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 Return true if a and b are alike. Otherwise, return false.
 **Example 1:**
 Input: s = "book"
 Output: true
 Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they 
are alike.

**Example 2:**
 Input: s = "textbook"
 Output: false
 Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, 
they are not alike.
 Notice that the vowel o is counted twice


 # Q2.Remove Trailing Zeros From a String

## Given a positive integer num represented as a string, return the integer num withouttrailing zeros as a string.
 
 **Example 1:**
 Input: num = "51230100"
 Output: "512301"
 Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return 
integer "512301".

> !Note
> ### StringBuilder also have
> **sb.charAt()** and **sb.deleteCharAt()**
 