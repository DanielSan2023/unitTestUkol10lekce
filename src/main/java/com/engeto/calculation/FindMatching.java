package com.engeto.calculation;

import java.util.List;

public class FindMatching {

    public static Double findMathing(List<Double>list,Double lowLimit,Double uppLimit){
        for(Double item : list){
            if(item >= lowLimit && item <=uppLimit){
                return item;
            }
        }return  null;

    }

}
