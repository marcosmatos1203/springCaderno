package com.example.demo.RepositoryModule;

import com.example.demo.DominioModule.RespTecnico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespTecnicoRepository extends JpaRepository<RespTecnico,Integer> {
    
}
