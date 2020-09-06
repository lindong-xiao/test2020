package service.Impl;

import dao.StudentDao;
import domain.student;
import service.StudentService;
import util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getsession().getMapper(StudentDao.class);
    @Override
    public student getByID(String num) {
        student s = studentDao.getByID(num);

        return s;
    }

    @Override
    public void save(student s) {
        studentDao.save(s);
    }

    @Override
    public List<student> getAll() {
        List<student> slist = studentDao.getAll();
        return slist;
    }


}
