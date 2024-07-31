package com.Aman.rapositoy;

import com.Aman.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jobApplicationrepository extends JpaRepository<JobApplication,Long> {
}
