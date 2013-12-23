import java.io.*;
import java.util.*;

public class ReverseInteger
{
  public static void main(String [ ] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine().trim();
    
    int value = Integer.parseInt(line);
    
    String stringValue = Integer.toBinaryString(value);
    
    char [] array = stringValue.toCharArray();
    
    for(int i = 0; i<array.length/2; i++)
    {
      char temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
    
    String string = "";
    
    for(int i = 0; i<array.length; i++)
      string = string + array[i];
    
    System.out.println( Integer.parseInt(string, 2) );
  }
}