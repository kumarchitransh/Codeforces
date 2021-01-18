import java.util.*;
import java.io.*;
public class helpfulmaths
{
    public static void main(String args[]) throws IOException
    {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            CharSequence as="+";
            String a="";
            a=br.readLine();
            if(a.contains(as)==true)
            {
                ArrayList<Integer> brr=new ArrayList<Integer>();
                for(int i=0;i<a.length();i++)
                {
                    if(a.charAt(i)!='+')
                    {
                        brr.add(Integer.parseInt(""+a.charAt(i)));
                    }
                }
                Collections.sort(brr);
                for(int i=0;i<brr.size()-1;i++)
                {
                    System.out.print(brr.get(i)+"+");
                }
                System.out.println(brr.get(brr.size()-1));
            }
            else
            {
                System.out.println(a);
            }
        }
        catch(Exception e){}
    }
}