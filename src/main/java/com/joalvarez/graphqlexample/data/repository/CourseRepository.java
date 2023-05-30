package com.joalvarez.graphqlexample.data.repository;

import com.joalvarez.baseframework.data.repository.GenericRepository;
import com.joalvarez.graphqlexample.data.domain.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends GenericRepository<Course, Long> {
}
