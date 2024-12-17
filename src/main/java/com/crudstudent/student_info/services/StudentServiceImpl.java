package com.crudstudent.student_info.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudstudent.student_info.exceptionhandler.ExceptionHelper;
import com.crudstudent.student_info.model.StudentDataInfo;
import com.crudstudent.student_info.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService 
{
	private final StudentRepo studentRepo;
	
	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public String isCreate(StudentDataInfo studentDataInfo) 
	{
		if(studentRepo!=null)
		{
			studentRepo.save(studentDataInfo);
			return "Data inserted successfully...";
		}
		else
		{
			throw new ExceptionHelper("please enter valid data.!");
		}
	}

	@Override
	public List<StudentDataInfo> getAll() {
		
		return studentRepo.findAll();
	}

	@Override
	public StudentDataInfo isGet(Long id) {
		StudentDataInfo dataInfo = studentRepo.findById(id).orElseThrow(()-> new ExceptionHelper("Student id not found.."));
		
		return dataInfo;
	}

	@Override
	public String isDeleted(Long id) {
		if(studentRepo.existsById(id))
		{
			studentRepo.deleteById(id);
			return "Student data deleted successfully..";
		}
		else
		{
			throw new ExceptionHelper("Id not found..");
		}
	}

	@Override
	public String isUpdated(StudentDataInfo studentDataInfo) {
		studentRepo.save(studentDataInfo);
		return "Data updated successfully..";
	}

	@Override
	public String isUpdateSingleEntity(StudentDataInfo studentDataInfo, Long id) {
		
		StudentDataInfo dataInfo = studentRepo.findById(id).orElseThrow(()-> new ExceptionHelper("Id not found"));
		dataInfo.setName(studentDataInfo.getName()==null ? dataInfo.getName() : studentDataInfo.getName());
		dataInfo.setNumber(studentDataInfo.getNumber()==null ? dataInfo.getNumber() : studentDataInfo.getNumber());
		dataInfo.setAddress(studentDataInfo.getAddress()==null ? dataInfo.getAddress() : studentDataInfo.getAddress());
		studentRepo.save(dataInfo);
		return "Data updated successfully..";
	}
	
}
