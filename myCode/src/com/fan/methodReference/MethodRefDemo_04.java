package com.fan.methodReference;

public class MethodRefDemo_04 {
    public static void main(String[] args) {

        useStudentBuilder((String name, int age) -> {
            return new Student(name, age);
        });

        useStudentBuilder(( name, age) -> new Student(name, age));

        //引用构造器  函数式接口唯一抽象函数返回类型::new
        useStudentBuilder(Student::new);

        //Lambda表达式被构造器替代的时候, 它的形式参数全部传递给构造器作为参数

    }

    private static void useStudentBuilder(StudentBuilder sb){
        Student student = sb.build("Nick", 12);
        System.out.println(student.getName() + "," + student.getAge());
    }
}

//https://www.bilibili.com/video/BV18J411W7cE?p=372&spm_id_from=pageDriver