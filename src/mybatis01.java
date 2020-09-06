import domain.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatis01 {
    public static void main(String[] args) {
        String resource = "mybaits-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //SqlSessionFactory的建造者是SqlSessionFactoryBuilder
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //SqlSessionFactory的唯一作用是为我们创建一个sqlsession 对象
        SqlSession session = sqlSessionFactory.openSession();//未来所有的操作都是通过session 进行的
        student s = session.selectOne("test01.getByID", "1");
        System.out.println(s);
        //session.close();
        //查询表中所有的信息
        List<student> slist = session.selectList("test01.getAll");
        for (student student: slist) {
            System.out.println(student);
        }
        /*
        student student = new student();
        student.setNum(Integer.valueOf("6"));
        student.setName("zel");

        session.insert("test01.setstudent", student);
        session.commit();//mybatis 是手动提交事物

         */
/*
        student student1 = new student();
        student1.setNum(Integer.valueOf("6"));
        student1.setName("uzi");
        session.update("test01.updatestudent", student1);
        session.commit();
             */

        session.delete("test01.deletestudent","6");
        session.commit();
        session.rollback();


    }
}
