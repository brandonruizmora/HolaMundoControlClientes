package com.mx.ControlClientes.web;

import com.mx.ControlClientes.domain.Persona;
import com.mx.ControlClientes.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControladorInicio {

    @Autowired
    private IPersonaService iPersonaService;

    @GetMapping("/")
    public String inicio(Model model) {

        List<Persona> personas = iPersonaService.listarPersonas();

        model.addAttribute("personas", personas);

        return "index";
    }

}
