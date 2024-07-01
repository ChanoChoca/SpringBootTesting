package com.chanochoca.springmvc.repository;

import com.chanochoca.springmvc.models.HistoryGrade;
import org.springframework.data.repository.CrudRepository;

public interface HistoryGradesDao extends CrudRepository<HistoryGrade, Integer> {

    public Iterable<HistoryGrade> findGradeByStudentId(int id);

    public void deleteByStudentId(int id);
}
