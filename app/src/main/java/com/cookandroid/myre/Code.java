package com.cookandroid.myre;

import java.util.Random;

public class Code {
    public char[] RandomTeamCode(){
        char[] code = new char[8];
        Random rd = new Random();
        for(int i=0; i<8; i++){
            char c= ' ';
            int num =rd.nextInt(16);
            if(num >= 10){
                c = (char)((int)'A'+(num-(int)'A'));
            }else{
                c = (char)((int)'0'+(num-(int)'0'));
            }
            code[i]=c;
        }
        return code;
    }
    public char[] RandomUserCode(){
        char[] code = new char[10];
        Random rd = new Random();
        for(int i=0; i<10; i++){
            char c= ' ';
            int num =rd.nextInt(16);
            if(num >= 10){
                c = (char)((int)'A'+(num-(int)'A'));
            }else{
                c = (char)((int)'0'+(num-(int)'0'));
            }
            code[i]=c;
        }
        return code;
    }
}
