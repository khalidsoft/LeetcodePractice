package com.leetcode.programmingskills;

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {

        char[] charWord1 = word1.toCharArray();
        char[] charWord2 = word2.toCharArray();
        int i=0,j=0,k=0;
        int size1= word1.length();
        int size2= word2.length();
        char[] merged = new char[size1+size2];

        boolean bWord1=true;
        boolean bWord2=false;
        while (k<size1+size2 && i<size1 && j<size2 ){
            if(i<size1 && bWord1){
                merged[k]=charWord1[i];
                i++;
                bWord1=false;
                bWord2=true;

            } else if (j<size2 && bWord2) {
                merged[k]=charWord2[j];
                j++;
                bWord1=true;
                bWord2=false;
            }
            k++;
        }

        if(i<size1){
            while (i<size1){
                merged[k]=charWord1[i];
                i++;
                k++;
            }
        } else if (j<size2) {
            while (j<size2){
                merged[k]=charWord2[j];
                j++;
                k++;
            }
        }

        return String.valueOf(merged);
    }

    public String mergeAlternately001(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i=0;

        while(i < word1.length() || i < word2.length()){
            if(i < word1.length()){
                merged.append(word1.charAt(i));
            }
            if(i < word2.length()){
                merged.append(word2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }
}
