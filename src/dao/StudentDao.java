package dao;

import domain.student;
import vo.studentandclassroomVo;

import java.util.List;
import java.util.Map;

public interface StudentDao {



    student getByID(String num);
    void save(student s);

    List<student> getAll();
    List<student> select1(student s2);

    List<student> select2(Map<String, Object> map);

    List<student> select3(String z);

    int select4();

    List<student> select5(student student1);

    List<student> select6(String[] strarry);

    List<Map<String, Object>> select7();

    List<studentandclassroomVo> select8();

}
