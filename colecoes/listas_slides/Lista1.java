/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_slides;

import java.util.*;

public class Lista1{
     public static void main(String args[]){
            List<Integer> lista = new ArrayList<>();
            lista.add(10); 
            lista.add(20); 
            lista.add(30);
            lista.add(20); 
            
            for(Integer obj: lista) {
                    System.out.println(obj);
            }
            
            //retorna o indice de ocorrencia do elemento 20
            System.out.println(lista.indexOf(20));
            
            //como retornar a última ocorrência do elemento 20?
            System.out.println(lista.lastIndexOf(20));
            
            //como converter toda a lista para um vetor?
            Object vetor [] = lista.toArray();
            
               for(Object obj: vetor) {
                        System.out.println(obj);
                }
            
            //como saber o número de elementos da lista?
            System.out.println(lista.size());
            
            //como remover um elemento da lista?
            lista.removeAll(lista);
            System.out.println(lista.size());
     }
     //int - Integer
     //char - Character
     //float - Float
     
}
