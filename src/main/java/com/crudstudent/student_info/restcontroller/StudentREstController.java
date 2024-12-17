package com.crudstudent.student_info.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudstudent.student_info.model.StudentDataInfo;
import com.crudstudent.student_info.services.StudentService;

@RestController
@RequestMapping("/std")
public class StudentREstController 
{
	private final StudentService service;

	public StudentREstController(StudentService service) {
		super();
		this.service = service;
	}
	@PostMapping("/create")
	public String isCreate(@RequestBody StudentDataInfo dataInfo)
	{
		return service.isCreate(dataInfo);
	}
	@GetMapping("/getAll")
	public List<StudentDataInfo> isGelAll()
	{
		return service.getAll();
	}
	@GetMapping("/get/{id}")
	public StudentDataInfo isGet(@PathVariable Long id)
	{
		return service.isGet(id);
	}
	@DeleteMapping("/delete/{id}")
	public String isDelete(@PathVariable Long id)
	{
		return service.isDeleted(id);
	}
	@PutMapping("/up")
	public String isUp(@RequestBody StudentDataInfo dataInfo)
	{
		return service.isUpdated(dataInfo);
	}
	@PatchMapping("{id}")
	public String isUpdated(@RequestBody StudentDataInfo dataInfo, @PathVariable Long id)
	{
		return service.isUpdateSingleEntity(dataInfo,id);
	}
}
