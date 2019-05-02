/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.tree;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author INT303
 */
public class TestBST {
    public static void main(String[] args) {
        Set<Student> x = new TreeSet(new StudentComparator());
        x.add(new Student(1,"A"));
        x.add(new Student(1,"B"));
        x.add(new Student(1,"C"));
        x.add(new Student(1,"D"));
        x.add(new Student(1,"E"));
        x.add(new Student(1,"F"));
        System.out.println(x);
        Student st = new Student(3,"C");
        System.out.println(x.contains(st));
    }

    private static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return -s1.getName().compareTo(s2.getName());
        }
    }
    
}
class Student implements Comparable<Student> {
        private int id;
        private String name;
        
        @Override
    public int compareTo(Student student) {
        return this.id = student.id + this.name.compareTo(student.name);
    }
        
        public Student(int id,String name){
            this.id = id;
            this.name = name;
        }
        public int getId(){
            return id;
        }
        public void setId(){
            this.id = id;
        }
        public String getName(){
            return name;
        }
        public void setName(){
            this.name = name;
            
        }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

   
        
    }
