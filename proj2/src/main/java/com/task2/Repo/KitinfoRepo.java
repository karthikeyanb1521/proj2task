package com.task2.Repo;


import com.task2.Entity.Kitinfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitinfoRepo extends CrudRepository<Kitinfo,Long> {

}
