package com.example.iset.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.iset.entity.Compte;

public interface compteRepository extends JpaRepository<Compte, Long> {
}


