package top.bearcad.java.basic.control;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: java-basic
 * @description:
 * @author: bearcad
 * @create: 2021-10-01 21:30
 **/
@Slf4j
public class BreakAndContinue {
    public static void main (String[] args){
        List<String> fruit = new ArrayList<>(Arrays.asList("apple","banana","orange","pear"));
        for(int i = 0; i < fruit.size(); i++){
            switch (fruit.get(i)){
                case "orange":
                    //continue;
                    break;
            }
            log.info("we have {}", fruit.get(i));
        }

    }
}
