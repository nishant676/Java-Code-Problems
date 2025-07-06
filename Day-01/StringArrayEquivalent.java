class StringArrayEquivalent
{
    public static void main(String[]args)
    {
        String [] word1 = {"ab","c"};
        String [] word2 = {"a","bc"};

        StringBuilder sb1 = new StringBuilder();
        for(String word: word1) sb1.append(word);

         StringBuilder sb2 = new StringBuilder();
        for(String word: word2) sb2.append(word);

        boolean check = sb1.toString().equals(sb2.toString());
        System.out.println(check);
    }
}