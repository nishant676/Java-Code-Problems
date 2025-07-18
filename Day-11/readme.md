> [!TIP]
> REGEX = Regular Expression

> [!IMPORTANT]
> Need to import this 2 pkgs
 **import java.util.regex.Pattern;**  **import java.util.regex.Matcher;**

> [!NOTE]
> **Pattern.compile():-**
> When to Use:- when you're going to use the same regex multiple times to search in different strings or perform multiple matching operations
> E.g.

>  String regex = "apple"; // Our simple regular expression
>        String text1 = "I love apple pie.";
>        String text2 = "Do you have any apples?";
>  
>          // Compile the regex into a Pattern object
>          **Pattern pattern = Pattern.compile(regex);**
>  
>        // Use the pattern to create Matcher objects for different texts
       
>        **Matcher matcher1 = pattern.matcher(text1);**

>       Matcher matcher2 = pattern.matcher(text2);

       // Check for matches
>    System.out.println("Text 1 matches 'apple': " +**matcher1.find()**); 
>     // Output: true
>    System.out.println("Text 2 matches 'apple': " + matcher2.find()); 
    // Output: true

> [!NOTE]
> **Pattern.CASE_INSENSITIVE:-**
> Use When =When you want your regex to find matches regardless of whether the letters are uppercase or lowercase.
**e.g:-**
>String regex = "apple"; // The regex itself is lowercase
> String text1 = "I love Apple pie."; // Text has uppercase 'A'
> **Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);**
> Matcher matcher1 = pattern.matcher(text1);
>Sysout(**matcher1.find()**);

### MetaCharacters
**\d:-** Matches any digit(0-9)
      => "\\d" in "abc123" matches '1','2','3'
      => Finding num in text

> [!NOTE]
> String str = **"\\d+"**;Here \d match digit, '+'indicate 1 or more time 
> String text = "My number is 23";
>Pattern pattern = Pattern.compile(str);
> Matcher matcher = pattern.matcher(text);
>Sysout(matcher.find());---> o/p=> true

[!IMPORTANT]
**If there are more than 1 num like phn num and you also want to print**

> while(matcher.find()) {
>    **syso(matcher.group());**
}
