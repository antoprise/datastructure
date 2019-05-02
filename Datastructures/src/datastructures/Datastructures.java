/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;


import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author INT303
 */
public class Datastructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          List<Student> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(new Student(i+1001, (char) (65+Math.random()*26)+""));
        }
        list.add(4,new Student(1110, "Somchai"));
        for (Student student : list) {
            System.out.println(student);
            
        }
        Student st = new Student(1110,"Somchai");
        
        int pos = list.indexOf(st);
        System.out.println(pos);

    }

    private static class Student implements Comparable<Student>{
        private int id;
        private String name;
        

        public Student(int id,String name) {
            this.id = id;
            this.name = name;
            
        }
        
        

        @Override
        public int hashCode() {
            int hash = 5;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Student other = (Student) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            return true;
        }
        
        

        @Override
        public String toString() {
            return "Studentt{" + "id=" + id + ", name=" + name + '}';
        }

        @Override
        public int compareTo(Student o) {
           return this.name.compareTo(o.name);
        }
        
    }
       
        
    }


