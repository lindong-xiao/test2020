import dao.StudentDao;
import domain.student;
import service.Impl.StudentServiceImpl;
import service.StudentService;
import util.ServiceFactory;
import util.SqlSessionUtil;
import vo.studentandclassroomVo;

import java.util.*;

public class test01 {
    public static void main(String[] args) {
/*
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String  newstr = str.replaceAll("-", "");
        System.out.println(newstr);

 */

        //StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        /*
        student student = new student();
        student.setNum(Integer.valueOf("1"));
        student.setName("wyf");
        ss.save(student);

 */
        /*
        student s = ss.getByID("2");
        System.out.println(s);
               */
/*
        List<student> slist = ss.getAll();
        for (student s: slist){
            System.out.println(s);
        }
       */


        StudentDao studentDao = SqlSessionUtil.getsession().getMapper(StudentDao.class);
        /*
        student s2 = new student();
        s2.setNum(Integer.valueOf("1"));
        s2.setName("zhansan");
        List<student> list2 = studentDao.select1(s2);
        for (student s: list2){
            System.out.println(s);
        }
 */
        /*
        Map<String , Object> map = new HashMap<String, Object>();
        map.put("name", "zhansan");
        map.put("num", 1);
        List<student> list2 = studentDao.select2(map);
        for (student s: list2){
            System.out.println(s);
        }
                 */
        //使用like模糊查询
        /*
        List<student>list3 = studentDao.select3("i");
        for (student s4: list3){
            System.out.println(s4);
        }
                 */
/*
        int cont = studentDao.select4();
        System.out.println(cont);
         */
//动态sql 使用where标签
        /*
    student student1 = new student();
    student1.setName("i");
    List<student> list4 = studentDao.select5(student1);
    for (student s: list4){
        System.out.println(s);
    }
             */
//动态sql语句 foreach标签
        /*
    String strarry[] = {"1", "2", "3"};
    List<student> list5= studentDao.select6(strarry);
    for (student s: list5){
        System.out.println(s);
    }
             */
//多表联查
        /*
    List<Map<String , Object>> list6= studentDao.select7();
    for (Map<String , Object> map: list6){
        Set<String> set = map.keySet();
        for (String key: set){
            System.out.println("key:  " + key);
            System.out.println("value:  " + map.get(key));
        }
    }
             */
    List<studentandclassroomVo> voList = studentDao.select8();
    for (studentandclassroomVo vo: voList){
        System.out.println(vo);
    }

    }
}

