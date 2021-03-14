package com.admindb.proyecto.servicios;

import java.util.List;

import com.admindb.proyecto.modelo.jobs.Job;
import com.admindb.proyecto.modelo.jobs.RepositorioJob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jobs")
public class ServicioJob {

    @Autowired
    private RepositorioJob repositorioJob;

    @GetMapping(produces = "application/json")
    public List<Job> findAll() {
        return repositorioJob.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Job findById( @PathVariable("id") String id) {
        return repositorioJob.findById(id).get();
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable("id") String id, @RequestBody Job job)
    {
        Job jActualizar = findById(id);
        if(jActualizar != null)
        {
            jActualizar.setHabilitado(job.getHabilitado());
            repositorioJob.save(jActualizar);
        }
    }

}
