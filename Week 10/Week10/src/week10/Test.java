/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

public class Test {
    public static void main(String[] args) {
        person p = new person("David", 22, 'M');
        p.setName("SITI");
        p.setAge(100);
        
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getGender());
        
        person p2 = new person();
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getGender());
        
        person p3 = new person(p2);
        System.out.println(p3.getName());
        System.out.println(p3.getAge());
        System.out.println(p3.getGender());
        
        String printout = p3.toString();
        System.out.println(printout);
    }
}
