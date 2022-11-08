/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aptar
 */
public class Generic <T>{
    private T data;
    
    public void setValue(T Gendata){
        data = Gendata;
    }
    
    public T getValue(){
        return data;
    }
}
