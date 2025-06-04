/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.experienciacomparator;

import entities.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author crist
 */
public class ExperienciaComparator {

    public static void main(String[] args) {
         List<Product> list = new ArrayList<>();
         
         list.add(new Product("TV", 900.00));
         list.add(new Product("Notebook", 1200.00));
         list.add(new Product("Tablet", 450.00));
         
         list.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()));
         
         for(Product p : list){
             System.out.println(p);
             
         }
    }
}
