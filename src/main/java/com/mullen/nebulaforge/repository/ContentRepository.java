package com.mullen.nebulaforge.repository;

import com.mullen.nebulaforge.domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, String> {}
