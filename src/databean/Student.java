/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 01-Sep-20
 *  Time: 1:13 PM
 */
package databean;

import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;

    //overriding equals from object class to check equality f two objects
    /*public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else{
            if(obj instanceof Student){
                // then i will cast it to Student type
                // and compare instance variables values for equality
                Student student = (Student) obj;
                if(this.rollNo == student.rollNo && this.name.equals(student.name)){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//same object
        if (!(o instanceof Student)) return false;// checking for instance
        Student student = (Student) o;//cast as is of same type
        return getRollNo() == student.getRollNo() &&
                Objects.equals(getName(), student.getName());//comparing instance field for equality
    }

    public int hashCode(){
        return Objects.hash(rollNo, name);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "[" + rollNo + ", " + name + "]";
    }
}
