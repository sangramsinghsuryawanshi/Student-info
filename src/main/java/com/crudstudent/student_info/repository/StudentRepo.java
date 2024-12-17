package com.crudstudent.student_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudstudent.student_info.model.StudentDataInfo;

@Repository
public interface StudentRepo extends JpaRepository<StudentDataInfo, Long>
{
	
}
