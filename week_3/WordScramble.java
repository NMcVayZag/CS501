package week_3;
/*************************************
 * WordScramble.java
 * Scrambles a given word
 * @author Tammy Pirmann
 * @version 20210407
 *******************************/
public class WordScramble {
  
    private String solution;
  
    //constructor
    public WordScramble() {
      solution = "NA";
    }
    //Setter
    public void setSolution(String str){
      solution = str.toUpperCase();
    }
    //Scrambles the solution String
    public String scramble(String str){
      setSolution(str);
      String mix = solution;
      int a = mix.indexOf("A");
      if (a >= 0) {
        mix = mix.substring(a).concat(mix.substring(0,a));
      }
      int e = mix.indexOf("E");
      if (e >= 0) {
        mix = mix.substring(e).concat(mix.substring(0,e));
      }
      int i = mix.indexOf("I");
      if (i >= 0) {
        mix = mix.substring(i).concat(mix.substring(0,i));
      }
      int oh = mix.indexOf("O");
      if (oh >= 0) {
        mix = mix.substring(oh).concat(mix.substring(0,oh));
      }
      int u = mix.indexOf("U");
      if (u >= 0) {
        mix = mix.substring(u).concat(mix.substring(0,u));
      }
      //reverse it in case it still looks like the original word
      return reverse(mix);    
    }
  
    //helper method to reverse the scrambled string
    private String reverse(String str){
      //base case
      if (str.isEmpty()){
        return str;
      }
      //Recursive call
      return reverse(str.substring(1)) + str.charAt(0);
    }
  }