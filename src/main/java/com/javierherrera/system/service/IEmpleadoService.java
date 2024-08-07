package com.javierherrera.system.service;

import java.util.List;

import com.javierherrera.system.bean.Empleado;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleado(Integer id);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

}
