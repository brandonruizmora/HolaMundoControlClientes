package com.mx.ControlClientes.web;

import com.mx.ControlClientes.domain.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model) {

        Persona persona = new Persona();
        persona.setNombre("Brandon");
        persona.setApellido("Ruiz");
        persona.setEmail("bruiz@email.com");
        persona.setTelefono("4494068372");

        model.addAttribute("persona", persona);

        return "index";
    }

}
