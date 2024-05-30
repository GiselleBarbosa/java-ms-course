package com.giselle.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giselle.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository <Worker, Long >{

}
