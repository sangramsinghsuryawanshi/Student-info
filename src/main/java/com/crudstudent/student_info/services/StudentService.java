package com.crudstudent.student_info.services;

import java.util.List;

import com.crudstudent.student_info.model.StudentDataInfo;

public interface StudentService 
{
	public String isCreate(StudentDataInfo studentDataInfo);
	public List<StudentDataInfo> getAll();
	public StudentDataInfo isGet(Long id);
	public String isDeleted(Long id);
	public String isUpdated(StudentDataInfo studentDataInfo);
	public String isUpdateSingleEntity(StudentDataInfo studentDataInfo,Long id);
}
