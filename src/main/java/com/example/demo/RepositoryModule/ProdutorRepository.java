package com.example.demo.RepositoryModule;

import com.example.demo.DominioModule.Produtor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutorRepository extends JpaRepository<Produtor,Integer>{
    
}
