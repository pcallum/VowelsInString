package com.sparta.vowelsinstring;

public class VowelsInString{
    public static int countVowels(String str){
        String vowels = "aeiou";
        int count = 0;
        for(char c : str.toCharArray()){
            if(vowels.indexOf(c) >= 0) {
                count++;
            }
        }

        return count;
    }
}
