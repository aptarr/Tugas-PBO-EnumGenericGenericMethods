/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aptar
 */
public class Akun extends AbsBank{
    private TipeAkun type;
    
    Akun(String name, int num, int amt, TipeAkun type){
        super(name, num, amt);
        this.type = type;
    }
    
    public String toString(){
        return "Tipe Akun : " + this.type;
    }
    
    public void printData(){
        System.out.println("\nAccount Name: " + super.accountName
                            + "\nAccount Number: " + super. accountNum
                            + "\nBalance: " + super.balance);
    }
}
