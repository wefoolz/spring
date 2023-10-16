package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//    	JdbcTemplate dbs  = context.getBean("jdbcTemplate", JdbcTemplate.class);
//    	
//    	String query = "insert into student(id, name, city) values(?,?,?)";
//    	
//    	int result = dbs.update(query,2,"Pranav","Kolhapur");
//    	System.out.println(result+" inserted");
    	
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	Student student = new Student();
    	student.setId(3);
    	student.setName("Vasundhara");
    	student.setCity("Kolhapur");
    	
    	int result = studentDao.insert(student);
    	System.out.println(result);
    	
    }
}
