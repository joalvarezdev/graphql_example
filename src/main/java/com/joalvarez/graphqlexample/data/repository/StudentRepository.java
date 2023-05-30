package com.joalvarez.graphqlexample.data.repository;

import com.joalvarez.baseframework.data.repository.GenericRepository;
import com.joalvarez.graphqlexample.data.domain.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends GenericRepository<Student, Long> {
}
