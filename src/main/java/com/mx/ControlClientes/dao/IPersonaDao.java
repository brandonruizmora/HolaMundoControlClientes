package com.mx.ControlClientes.dao;

import com.mx.ControlClientes.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
}
