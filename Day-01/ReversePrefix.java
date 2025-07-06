class ReversePrefix
{
    public static void main(String[] args)
    {
        String word = "xyxzxe";
        String target = "z";
        StringBuilder sb = new StringBuilder();

        int index = word.indexOf(target);

        if(index == -1)
        {
            System.out.println(word);
            return;
        }

        sb.append(word.substring(0,index+1));
        sb.reverse();
        sb.append(word.substring(index+1));

        System.out.println(sb.toString());
    }
}