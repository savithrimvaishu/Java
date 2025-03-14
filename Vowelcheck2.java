public class Vowelcheck2 {
    public static void main(String[] args)
    {
        String str="Mango";
        if(!str.isEmpty())
        {
            char firstchar=Character.toLowerCase(str.charAt(0));
            if("aeiou".indexOf(firstchar)!=-1)
            {
                System.out.println("Starts with a vowel");
            }
            else
            {
                System.out.println("Does not start with a vowel");
            }
        }
        else{
            System.out.println("Invalid input!");
        }
    }
}
        