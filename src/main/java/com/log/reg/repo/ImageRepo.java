package com.log.reg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.log.reg.model.ImageStore;

@Repository
public interface ImageRepo extends JpaRepository<ImageStore, Long> {

	ImageStore findById(int id);
}
