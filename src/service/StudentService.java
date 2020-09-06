package service;

import domain.student;

import java.util.List;

public interface StudentService {
    student getByID(String num);
    void save(student s);

    List<student> getAll();
}
