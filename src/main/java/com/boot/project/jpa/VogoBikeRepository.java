package com.boot.project.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.project.bike.VogoBike;

public interface VogoBikeRepository extends JpaRepository<VogoBike, Integer> {

}
