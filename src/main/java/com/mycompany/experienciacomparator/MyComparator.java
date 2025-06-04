/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.experienciacomparator;

import entities.Product;
import java.util.Comparator;

/**
 *
 * @author crist
 */
public class MyComparator implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
       return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    
}
