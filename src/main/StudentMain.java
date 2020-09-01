/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 01-Sep-20
 *  Time: 1:14 PM
 */
package main;

import databean.Student;

public class StudentMain {
    public static void main(String[] args) {
        //creating two objects of Student class
        Student s1 = new Student();
        Student s2 =new Student();
        s1.setRollNo(11);
        s1.setName("vaibhav");
        s2.setRollNo(11);
        s2.setName("vaibhav");
        System.out.println("s1 equal s2 => " + s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1);
        System.out.println(s2);
    }
}
