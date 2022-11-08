/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aptar
 */
public class AbsBank { 
    protected String accountName;
    protected int accountNum;
    protected int balance;
    
    public AbsBank(String name, int num, int amt){
        this.accountName = name;
        this.accountNum = num;
        this.balance = amt;
    }
}
