package com.admindb.proyecto.modelo.jobs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioJob extends JpaRepository<Job,String> {
    List<Job> findByPropietario(String propietario);
}
