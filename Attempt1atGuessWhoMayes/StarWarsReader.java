//https://www.candidjava.com/tutorial/program-to-search-word-in-a-file/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class StarWarsReader{
  public static void main(String[] args) throws IOException 
   {
  File f1=new File("StarWarsCharacters.txt"); //Creation of File Descriptor for input file
      String[] words=null;  //Intialize the word Array
      FileReader fr = new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
      String s;     
      String input="Name";   // Input word to be searched
      while((s=br.readLine())!=null)   //Reading Content from the file
      {
         words=s.split(",");  //Split the word using comma
          for (String word : words) 
          {
                 if (word.equals(input))   //Search for the given word
                 {
                 System.out.println(word);
                 }
          }
      }
         fr.close();
      }
    }