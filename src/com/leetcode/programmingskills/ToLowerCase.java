package com.leetcode.programmingskills;

public class ToLowerCase {

    public String toLowerCase(String s) {
        // Uppercase letter ASCII between 65 and 90
        // Lowercase letter ASCII between 97 and 122
        // From Lowercase to uppercase , reduce the ASCII code by 32

        char[] ch = s.toCharArray();
        StringBuilder strbuild = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int ascii = (int)ch[i];
            if(ascii >= 65 && ascii <= 90){
                ascii+=32;
                strbuild.append((char) ascii);
            }else{
                strbuild.append((char) ascii);
            }
        }
        return strbuild.toString();
    }
}
