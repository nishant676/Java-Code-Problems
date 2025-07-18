# Q1.  Maximum Value of a String in an Array
 
 ## The value of an alphanumeric string can be defined as: The numeric representation of the string in base 10, if it comprises of digits only.
 ## The length of the string, otherwise.
 Given an array strs of alphanumeric strings, return the maximum value of any string 
in strs.
 
 **Example 1:**
 Input: strs = ["alic3","bob","3","4","00000"]
 Output: 5
 Explanation: - "alic3" consists of both letters and digits, so its value is its length, i.e. 5.- "bob" consists only of letters, so its value is also its length, i.e. 3.- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.- "4" also consists only of digits, so its value is 4.- "00000" consists only of digits, so its value is 0.
 Hence, the maximum value is 5, of "alic3".

 # Q2. Shortest Distance to a Character
 
 ## Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to theclosest occurrence of character c in s.The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

 **Example 1:**
 Input: s = "loveleetcode", c = "e"
 Output: [3,2,1,0,1,0,0,1,2,2,1,0]
 Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
 The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 
3.
 The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 
2.
 For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the 
distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
 The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 
2.