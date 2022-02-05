package com.josemtz.arrays;

import java.util.HashMap;

public class CheckIfSentenceIsPanagram {

    public static void main(String[] args) {

        String lazyDog = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Is it Panagram ? : " + checkIfPangram(lazyDog));

        String notPan = "bcenoobckerznmojmltdoemorzthtovybaghmgmenwagvmngqqbpmewsamzstxqmmckfadjewtdbmqazgvakbjfzxvhselxhsswlecwnondolrxsswhwrpayqkpvvpramuntrbstjcbjrqtocllkqqlfgemszuztnlthfjjnxllcokeucnyjccmvcjaalowrpeupntcqxwqzenzdfwbrwwxcpjerlurrkeukpqjrzbrslrvlkwaezgbkgptrbngfltzlqtwuzhjrrabshx";
        System.out.println("Is it Panagram ? : " + checkIfPangram(notPan));

    }

    private static boolean checkIfPangram(String sentence) {
        HashMap<Character, Boolean> alphabet = new HashMap<>();
        alphabet.put('a', false);
        alphabet.put('b', false);
        alphabet.put('c', false);
        alphabet.put('d', false);
        alphabet.put('e', false);
        alphabet.put('f', false);
        alphabet.put('g', false);
        alphabet.put('h', false);
        alphabet.put('i', false);
        alphabet.put('j', false);
        alphabet.put('k', false);
        alphabet.put('l', false);
        alphabet.put('m', false);
        alphabet.put('n', false);
        alphabet.put('o', false);
        alphabet.put('p', false);
        alphabet.put('q', false);
        alphabet.put('r', false);
        alphabet.put('s', false);
        alphabet.put('t', false);
        alphabet.put('u', false);
        alphabet.put('v', false);
        alphabet.put('w', false);
        alphabet.put('y', false);
        alphabet.put('z', false);

        char[] sentenceArr = sentence.toCharArray();

        for(int i = 0; i< sentenceArr.length; i++){
            alphabet.put(sentenceArr[i], true);
        }

        for(boolean charExist : alphabet.values()){
            if(!charExist){
                return false;
            }
        }
        return true;
    }
}
