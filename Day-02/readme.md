# Q1. Truncate Sentence

## A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

**For example**, "Hello World", "HELLO", and "hello world hello world" are all sentences.

 **Example 1:**
 Input: s = "Hello how are you Contestant", k = 4
 Output: "Hello how are you"
 Explanation:
 The words in s are ["Hello", "how" "are", "you", "Contestant"].
 The first 4 words are ["Hello", "how", "are", "you"].
 Hence, you should return "Hello, how are you?"

 # IMP Method and Use Cases

> [!TIP]
>## String.join():-
> => U have a bunch of things and u want to add a separator between them
> => String separator = ", " // This is what you want between your pieces

>**e.g:-**
>String[] words = {"apple", "banana", "cherry"}; // Your pieces of text
>String result = String.join(separator, words);
>// result will be: "apple, banana, cherry"

> [!TIP]  
> ## Arrays.copyOf():-
If you have a list of things and want a full list or the first few items, then use it.
> => It take 2 params [1st is original array , 2nd is last index u wnat]
> **e.g:-**
>int[] originalArray = {10, 20, 30, 40, 50};

>// Scenario A: Copy the first N elements

>int[] copy1 = Arrays.copyOf(originalArray, 3); // Copy first 3 elements
>// copy1 will be: {10, 20, 30}

> [!TIP]  
> ## Arrays.copyOfRange():-
> =>You have a long list of items. You only need the items from position 3 to position 7 (but not including 7).
> => It take 2 params [original array, inclusive ,exclusive]

> **e.g:-**
>int[] originalArray = {10, 20, 30, 40, 50, 60, 70};
>// Indices:             0   1   2   3   4   5   6

>// Copy elements from index 2 (inclusive) up to index 5 (exclusive)
>// This means elements at indices 2, 3, 4 will be copied.
>int[] subArray1 = Arrays.copyOfRange(originalArray, 2, 5);
>// subArray1 will be: {30, 40, 50}

# Q2.  Shuffle String
 
## You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 Return the shuffled string.

 4 5 6 7 0 2 1 3
 c o d e l e e t

 After shuffled :
 0 1 2 3 4 5 6 7
 l e e t c o d e

 **Example 1:**
 Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 Output: "leetcode"
 Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
