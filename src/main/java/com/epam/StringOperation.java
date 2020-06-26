package com.epam;

public class StringOperation {
    public String removeAFromString(String str){
        StringBuilder stringBuilder=new StringBuilder();

        for(int i=0;i<2;i++){
            if(str.charAt(i) != 'A'){
                stringBuilder.append(str.charAt(i));
            }
        }
        stringBuilder.append(str.substring(2));

        return stringBuilder.toString();
    }
}



