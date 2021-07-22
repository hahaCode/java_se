package com.fan.methodReference;

public class MethodRefDemo_04 {
    public static void main(String[] args) {

        useStudentBuilder((String name, int age) -> {
            return new Student(name, age);
        });

        useStudentBuilder(( name, age) -> new Student(name, age));

        //引用构造器
        useStudentBuilder(Student::new);

        //Lambda表达式被构造器替代的时候, 它的形式参数全部传递给构造器作为参数

    }

    private static void useStudentBuilder(StudentBuilder sb){
        Student student = sb.build("Nick", 12);
        System.out.println(student.getName() + "," + student.getAge());
    }
}