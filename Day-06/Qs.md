# Q1. Check if Word Equals Summation of Two Words

## The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).
 
### The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.

 For example, if s = "acb", we concatenate each letter's letter value, resulting in 
"021". After converting it, we get 21.
 You are given three strings firstWord, secondWord, and targetWord, each consisting of 
lowercase English letters 'a' through 'j' inclusive.
 Return true if the summation of the numerical values of firstWord and secondWord 
equals the numerical value of targetWord, or false otherwise.
 
**Example 1:**
 Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
 Output: true
 Explanation:
 The numerical value of firstWord is "acb" -> "021" -> 21.
 The numerical value of secondWord is "cba" -> "210" -> 210.
 The numerical value of targetWord is "cdb" -> "231" -> 231.
 We return true because 21 + 210 == 231.

 > [!NOTE]
 > **To Convert String to int ---> Integer.parseInt()**

 # Q2. Percentage of Letter in String

 ## Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.

 **Example 1:**
 Input: s = "foobar", letter = "o"
 Output: 33
 Explanation:
 The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% 
when rounded down, so we return 33

>[!NOTE]
> ** Multiply before int divide to avoid problems**