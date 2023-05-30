package com.joalvarez.graphqlexample.service;

import com.joalvarez.baseframework.service.BaseService;
import com.joalvarez.graphqlexample.data.dao.StudentDAO;
import com.joalvarez.graphqlexample.data.domain.Student;
import com.joalvarez.graphqlexample.data.dto.StudentDTO;
import com.joalvarez.graphqlexample.data.mapper.StudentMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends BaseService<StudentDAO, StudentMapper, StudentDTO, Student, Long> {

	public StudentService(StudentDAO dao, StudentMapper mapper) {
		super(dao, mapper);
	}
}
