package com.javierherrera.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javierherrera.system.bean.Empleado;
import com.javierherrera.system.repository.EmpleadoRepository;

@Service


public class EmpleadoService implements IEmpleadoService {

    @Autowired

    private EmpleadoRepository empleadoRepositorio;
    


    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleado(Integer id) {
        Empleado empleados = empleadoRepositorio.findById(id).orElse(null);
        return empleados;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepositorio.delete(empleado);
    }
    
}
