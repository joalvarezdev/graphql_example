package com.joalvarez.graphqlexample.data.dao;

import com.joalvarez.baseframework.data.dao.BaseJPADAO;
import com.joalvarez.graphqlexample.data.domain.Student;
import com.joalvarez.graphqlexample.data.repository.StudentRepository;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO extends BaseJPADAO<StudentRepository, Student, Long> {

	public StudentDAO(StudentRepository repository) {
		super(repository);
	}

}
