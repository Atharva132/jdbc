package com.jdbc.prac5a;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbc/prac5a/config.xml");
        
//        JdbcTemplate tmp = context.getBean("JdbcTemplate", JdbcTemplate.class);
//        
//        String query = "insert into student(id, name) values (?,?)";
//        
//        int result = tmp.update(query,01,"Atharva");
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
//        Student stud1 = new Student();
//        stud1.setId(03);
//        stud1.setName("Rutik");
//        int result = studentDao.insert(stud1);
//        System.out.println(result);
        
//        Student stud2 = new Student();
//        stud2.setId(03);
//        stud2.setName("Suraj");
//        int result = studentDao.change(stud2);
//        System.out.println(result);
        
//          int result = studentDao.delete(02);
//          System.out.println(result);
          
//        Student stud3 = studentDao.getStudent(01);  
//        System.out.println(stud3);
        
        List<Student> allStudents = studentDao.getAllStuds();
        for(Student s : allStudents) {
        	System.out.println(s);
        }
    }
}
