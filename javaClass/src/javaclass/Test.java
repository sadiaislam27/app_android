/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String args[])
            {
                Person p1= new Person("Disha",22,"Dhaka");
                p1.setName("Sadia");
                System.out.println(p1.getName());
                p1.setAge(22);
                System.out.println(p1.getAge());
                p1.setAddr("Natore");
                System.out.println(p1.getAddr());
            }
    
}
