package edu.miu.cs.cs425.eregistrar.eregistrar.repository;

import edu.miu.cs.cs425.eregistrar.eregistrar.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {




}
