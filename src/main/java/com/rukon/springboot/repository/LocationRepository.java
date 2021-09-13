package com.rukon.springboot.repository;

import com.rukon.springboot.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
