public class CountVowelsConsonants
{
    public static void main(String args[])
    {
       String s = "this is java programming";
       int vcount=0,ccount = 0;
       for(int i = 0; i<s.length();i++){
              char ch = s.charAt(i);
              if(ch == 'a' || ch == 'e'||ch == 'i' || ch == 'o' || ch == 'u'){
                   vcount++;
               }
               else
                  ccount++;
       }
       System.out.println("Count of vowels is: "+vcount);
       System.out.println("Count of consonants is: "+ccount);
    }
}