/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aptar
 */
public class GenericMethods {
    public <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }
}
