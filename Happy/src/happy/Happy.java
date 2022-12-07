/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package happy;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author rodri
 */
public class Happy {

    /**
     * @param args the command line arguments
     */
   
    static void uniqueWords(String str)
    {
        
        
        
      
        HashMap<String, Integer> map
            = new LinkedHashMap<String, Integer>();
 
  
        String[] words = str.split("\\W");
 
        for (String word : words) {
 
     
            if (map.containsKey(word)) {
 
                map.put(word, map.get(word) + 1);
            }
 
          
            else
                map.put(word, 1);
        }
 

        for (Map.Entry<String, Integer> entry :
             map.entrySet()) {
 
            
 
      
                System.out.println(entry.getKey());
        }
    }
    
    
    
    
    
    
    
    
    public static String Happytxt(String fileName)throws Exception
  {
    String song = "";
    song = new String(Files.readAllBytes(Paths.get(fileName)));
    return song;
  
  
  
  
  }
    
    
    
    
    
    
    public static void main(String[] args) throws Exception {
   
        String song = Happytxt("C:\\Users\\rodri\\Downloads\\happy.txt");
    System.out.println(song);
        
        
        String str = song;
 
      
        uniqueWords(str);
    
    
    
        
 
        Map<String, Integer> hashMap = new HashMap<>();
 
        String[] words = str.split(" ");
 
        for (String word : words) {
            
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1);
 
            else
                hashMap.put(word, 1);
        }
 
        System.out.println(hashMap);
        
        System.out.println("Happy is said 57 times");
    }
}
        
    

