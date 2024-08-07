package com.javierherrera.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javierherrera.system.bean.Empleado;

@Service


public class EmpleadoService implements IEmpleadoService {

    @Autowired

    @Override
    public List<Empleado> listarEmpleados() {
        throw new UnsupportedOperationException("Unimplemented method 'listarEmpleados'");
    }

    @Override
    public Empleado buscarEmpleado(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'buscEmpleado'");
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        throw new UnsupportedOperationException("Unimplemented method 'guardarEmpleado'");
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        throw new UnsupportedOperationException("Unimplemented method 'eliminarEmpleado'");
    }
    
}
