package com.Aman.rapositoy;

import com.Aman.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryrepositry extends JpaRepository<Category,Long> {
}
