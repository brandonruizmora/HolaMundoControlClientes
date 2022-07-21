package com.mx.ControlClientes.web;

import com.mx.ControlClientes.dao.IPersonaDao;
import com.mx.ControlClientes.domain.Persona;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {

    @Autowired
    private IPersonaDao iPersonaDao;

    @GetMapping("/")
    public String inicio(Model model) {

        var personas = iPersonaDao.findAll();

        model.addAttribute("personas", personas);

        return "index";
    }

}
