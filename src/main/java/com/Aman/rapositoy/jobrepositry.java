package com.Aman.rapositoy;

import com.Aman.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface jobrepositry extends JpaRepository<Job,Long> {
}
