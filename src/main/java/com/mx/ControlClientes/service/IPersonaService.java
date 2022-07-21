package com.mx.ControlClientes.service;

import com.mx.ControlClientes.domain.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
