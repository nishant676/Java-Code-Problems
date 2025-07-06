public class CountVowels{
    public static void main(String[]args)
    {
        String str = "Hello world!";
        String check = "aAeEiIoOUu";
        int count = 0 ;

        for(int i =  0; i< str.length(); i++)
        {
            if(check.contains(str.valueOf(str.charAt(i)  ))) count++;
        }
         System.out.println(count);
            
    }

    
}