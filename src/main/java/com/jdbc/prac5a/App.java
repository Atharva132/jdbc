package com.jdbc.prac5a;

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
        
        Student stud1 = new Student();
        stud1.setId(02);
        stud1.setName("Akhilesh");
        int result = studentDao.insert(stud1);
        System.out.println(result);
    }
}
