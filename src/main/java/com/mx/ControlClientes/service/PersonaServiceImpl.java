package com.mx.ControlClientes.service;

import com.mx.ControlClientes.dao.IPersonaDao;
import com.mx.ControlClientes.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao iPersonaDao;

    @Override
    public List<Persona> listarPersonas() {
        return (List<Persona>) iPersonaDao.findAll();
    }

    @Override
    public void guardar(Persona persona) {
        iPersonaDao.save(persona);
    }

    @Override
    public void eliminar(Persona persona) {
        iPersonaDao.delete(persona);
    }

    @Override
    public Persona encontrarPersona(Persona persona) {
        return iPersonaDao.findById(persona.getIdPersona()).orElse(null);
    }
}
