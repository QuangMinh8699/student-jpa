package com.tqm.studentjpa.repo;

import com.tqm.studentjpa.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepo extends JpaRepository<Classroom, Long> {
}
