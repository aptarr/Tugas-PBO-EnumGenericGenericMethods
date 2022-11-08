/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aptar
 */
public class Main {
    public static void main(String[] args) {
        Akun a1 = new Akun("Reza Marabinga", 10100, 300, TipeAkun.CREDIT);
        Akun a2 = new Akun("Iqbal Ramadhan", 12300, 100, TipeAkun.SAVING);
        Akun a3 = new Akun("Victor", 13020, 500, TipeAkun.SAVING);
        
        a1.printData();
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        Generic<Integer> integerGen = new Generic<Integer>();
        Generic<String> stringGen = new Generic<String>();
        
        integerGen.setValue(1);
        stringGen.setValue("one");
        
        System.out.println("Integer Value : " + integerGen.getValue());
        System.out.println("String Value : " + stringGen.getValue());
        
        GenericMethods gm = new GenericMethods();
        
        Integer[] integerArray = {1,2,3};
        String[] stringArray = {"Feels", "Good", "Like", "Me"};
        
        gm.printArray(integerArray);
        gm.printArray(stringArray);
    }
}
