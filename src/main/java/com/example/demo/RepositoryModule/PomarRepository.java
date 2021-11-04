package com.example.demo.RepositoryModule;

import com.example.demo.DominioModule.Pomar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PomarRepository extends JpaRepository<Pomar,Integer>{
    
}
