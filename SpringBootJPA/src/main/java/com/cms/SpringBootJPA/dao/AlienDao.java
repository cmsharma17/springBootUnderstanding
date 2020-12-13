package com.cms.SpringBootJPA.dao;

import org.springframework.data.repository.CrudRepository;

import com.cms.SpringBootJPA.model.Alien;

public interface AlienDao extends CrudRepository<Alien, Integer> {

}
