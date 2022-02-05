package com.josemtz.arrays;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingNums {

    public static void main(String[] args) {
        int matches = 0;
        List<List<String>> items = new ArrayList<>();
        String ruleKey = "type";
        String ruleValue = "phone";


        for(List<String> item: items){
            if(ruleKey.equalsIgnoreCase("type")){
                if(ruleValue.equalsIgnoreCase(item.get(0))){
                    matches +=1;
                    continue;
                }
            }
            if(ruleKey.equalsIgnoreCase("color")){
                if(ruleValue.equalsIgnoreCase(item.get(1))){
                    matches +=1;
                    continue;
                }
            }
            if(ruleKey.equalsIgnoreCase("name")){
                if(ruleValue.equalsIgnoreCase(item.get(2))){
                    matches +=1;
                    continue;
                }
            }
        }

    }
}
