package com.everis.alicante.courses.beca.java.friendsnet.controller;


import java.io.Serializable;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * EN DESARROLLO
 */
public abstract class RESTController<T, ID extends Serializable> {

	@Autowired
    private CrudRepository<T, ID> repo;


    public RESTController(CrudRepository<T, ID> repo) {
        this.repo = repo;
    }

    
    
    @GetMapping
    public @ResponseBody List<T> getAll() {
        return (List<T>) this.repo.findAll();
    }
    
    @GetMapping("/{id}")
    public @ResponseBody T getById(@PathVariable("id") ID id) {
        return this.repo.findById(id).get();
    }

    @PostMapping
    public @ResponseBody T create(@RequestBody T t) {
        return repo.save(t);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody void delete(@PathVariable ID id) {
        this.repo.deleteById(id);
    }
}