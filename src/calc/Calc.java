/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author John jominoh
 */
public class Calc {

    private String name;
    private String regNo;
    
    public String getName(){
        return name;
    }
    public String setName(String jina){
        name=jina;
        return name;
    }
    public String getRegNo(){
        return regNo;
    }
    public String setRegNo(String adm){
        regNo=adm;
        return regNo;
    }
    public static void main(String[] args) {
        Calc f=new Calc ();
        System.out.println("enter your name");
        Scanner h=new Scanner(System.in);
        
       String p= h.nextLine();
        f.setName(p);
        System.out.println("enter your regNo");
        Scanner k=new Scanner (System.in);
        
        String j=k.nextLine();
        
      
        
        
        f.getName();
        
        System.out.println("welcome " +f.getName());
        f.setRegNo(j);
        f.getRegNo();
        System.out.println("your regNo is " +f.getRegNo());
    }
    
    
}
