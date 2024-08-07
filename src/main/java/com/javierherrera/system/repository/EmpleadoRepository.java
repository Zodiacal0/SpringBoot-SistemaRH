package com.javierherrera.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javierherrera.system.bean.Empleado;

public interface EmpleadoRepository extends JpaRepository <Empleado,Integer>{
    
}
