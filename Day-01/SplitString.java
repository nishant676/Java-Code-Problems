class SplitString
{
    public static void main(String[] args)
     {
        String word = "RLRRRLLRLL";
        int balance = 0 , count = 0 ;
        char firstChar = word.charAt(0);

        for(int i = 0 ; i< word.length(); i++)
        {
            if(word.charAt(i) == firstChar) balance++;
            else balance--;

            if(balance == 0) count++;
        }

        System.out.println(count);
    }
}