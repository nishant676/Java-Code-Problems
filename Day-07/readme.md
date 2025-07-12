# Q1.  Count the Number of Vowel Strings in Range

## You are given a 0-indexed array of string words and two integers left and right. A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
 
 **Example 1:**
 Input: words = ["are","amy","u"], left = 0, right = 2
 Output: 2
 Explanation: - "are" is a vowel string because it starts with 'a' and ends with 'e'.- "amy" is not a vowel string because it does not end with a vowel.- "u" is a vowel string because it starts with 'u' and ends with 'u'.
 The number of vowel strings in the mentioned range is 2.

 **Example 2:**
 Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4

 >[!NOTE]
 > To select particular range frm array use **Arrays.copyOfRange(arrayName, inclusive, exclusive)**

 # Q2.Maximum Number of Words You Can Type

 ## There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly. Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

 **Example 1:**
 Input: text = "hello world", brokenLetters = "ad"
 Output: 1
 Explanation: We cannot type "world" because the 'd' key is broken.

**Example 2:**
 Input: text = "leet code", brokenLetters = "e"
 Output: 0