/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataexcemption;

import java.util.*;
//import java.util.List;
//import java.util.Arrays;

public class Dataexcemption {

    public static void main(String[] args) {
        
        // TODO code application logic here
        ArrayList<Integer> intList = new ArrayList<Integer> (Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        
        
        ArrayList<Integer> sub_ArrayList= new ArrayList<Integer>(intList.subList(0,3));
        ArrayList<Integer> arr= new ArrayList<Integer>(intList.subList(6,10));
        
        System.out.print(sub_ArrayList);
        System.out.print(arr);
        
    }
}