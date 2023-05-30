package com.joalvarez.graphqlexample.controller;

import com.joalvarez.baseframework.controller.BaseController;
import com.joalvarez.graphqlexample.data.dao.StudentDAO;
import com.joalvarez.graphqlexample.data.domain.Student;
import com.joalvarez.graphqlexample.data.dto.StudentDTO;
import com.joalvarez.graphqlexample.data.mapper.StudentMapper;
import com.joalvarez.graphqlexample.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("graphql_student")
public class StudentGraphQlController extends BaseController<StudentService, StudentDAO, StudentMapper, StudentDTO, Student, Long> {

	public StudentGraphQlController(StudentService service) {
		super(service);
	}

	@QueryMapping(name = "findStudentById")
	public StudentDTO findById(@Argument(name = "studentId") String id){
		return this.service.get(Long.parseLong(id));
	}

	@QueryMapping(name = "findAllStudents")
	public List<StudentDTO> findAll () {
		return this.service.getAll();
	}

	@MutationMapping(name = "createStudent")
	public String create(@Argument(name = "student") StudentDTO data) {
		StudentDTO dto = this.service.save(data);
		return Objects.nonNull(dto.getId())
			? "Estudiante creado correctamente"
			: "Ocurrio un error";
	}

	@MutationMapping(name = "deleteStudentById")
	public String delete(@Argument String id) {
		this.service.deleteById(Long.parseLong(id));
		return "Se elimino correctamente";
	}
}
