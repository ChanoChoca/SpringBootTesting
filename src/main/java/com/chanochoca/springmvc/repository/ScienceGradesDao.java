package com.chanochoca.springmvc.repository;

import com.chanochoca.springmvc.models.ScienceGrade;
import org.springframework.data.repository.CrudRepository;

public interface ScienceGradesDao extends CrudRepository<ScienceGrade, Integer> {

    public Iterable<ScienceGrade> findGradeByStudentId(int id);

    public void deleteByStudentId(int id);
}
