package com.joalvarez.graphqlexample.data.mapper;

import com.joalvarez.baseframework.data.mapper.BaseMapper;
import com.joalvarez.graphqlexample.data.domain.Student;
import com.joalvarez.graphqlexample.data.dto.StudentDTO;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper extends BaseMapper<StudentDTO, Student> {
}
