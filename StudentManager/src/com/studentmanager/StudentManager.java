package com.studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            printHint();
            Scanner scanner = new Scanner(System.in);
            int code = scanner.nextInt();
            if (code == 1) {
                addStudent(students);
            } else if (code == 2) {
                findAllStudent(students);
            } else if (code == 3) {
                deleteStudent(students);
            } else if (code == 4) {
                updateStudent(students);
            } else {
                System.out.println("Thanks, Bye!");
                System.exit(0); //JVM退出
            }

        }

    }

    public static void printHint() {
        System.out.println("--------Welcome to student management system---------");
        System.out.println("1.Add a student");
        System.out.println("2.Show student list");
        System.out.println("3.Delete a student");
        System.out.println("4.Update student info");
        System.out.println("5.Exit the system");
        System.out.println("Please enter the code for operation:");
    }

    public static boolean idIsUsed (String id, ArrayList<Student> array) {
        for(int i = 0; i < array.size(); i++){
            Student student = array.get(i);
            if(student.getSid().equals(id)){
                return true;
            }
        }
        return  false;
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        String id;
        System.out.println("Please enter the student ID:");
        while (idIsUsed(id = scanner.nextLine(), array)){
            System.out.println("This ID has already used, please enter a new one:");
        }
        student.setSid(id);
        System.out.println("Please enter the student Name:");
        student.setName(scanner.nextLine());
        System.out.println("Please enter the student Age:");
        student.setAge(scanner.nextLine());
        System.out.println("Please enter the student Address:");
        student.setAddress(scanner.nextLine());
        array.add(student);
        System.out.println("Add successfully!");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("No Students Now! Please add the students firstly!");
            return;
        }

        System.out.println("SID\t\tName\tAge\t\tAddress");
        System.out.println("-------------------------------------");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t\t" + s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("Please enter the ID to delete the student");
        Scanner scanner = new Scanner(System.in);
        String sid = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.remove(student);
                System.out.println("Delete successfully!");
                return;
            }
        }

        System.out.println("Can not delete this item!");

    }

    public static void updateStudent(ArrayList<Student> array) {
        System.out.println("Please enter the ID to update the student info");
        Scanner scanner = new Scanner(System.in);
        String sid = scanner.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if(student.getSid().equals(sid)) {
                System.out.println("Please input the new name:");
                student.setName(scanner.nextLine());

                System.out.println("Please input the new age:");
                student.setAge(scanner.nextLine());

                System.out.println("Please input the new address:");
                student.setAddress(scanner.nextLine());

                System.out.println("Update Successfully!");
                return;
            }
        }

        System.out.println("Can not find this student ID!");
    }
}
//https://www.bilibili.com/video/BV1Ei4y137HJ?p=150&spm_id_from=pageDriver