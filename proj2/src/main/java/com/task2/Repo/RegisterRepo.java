package com.task2.Repo;

import com.task2.Entity.Kitinfo;
import com.task2.Entity.Register;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends CrudRepository<Register,String> {

}
