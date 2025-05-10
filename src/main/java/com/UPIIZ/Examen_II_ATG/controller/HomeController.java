package com.UPIIZ.Examen_II_ATG.controller;

import com.UPIIZ.Examen_II_ATG.model.Prestamo;
import com.UPIIZ.Examen_II_ATG.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/prestamos")
public class HomeController {

    @Autowired
    private PrestamoService servicio;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaPrestamos", servicio.listarTodos());
        return "prestamos/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("prestamo", new Prestamo());
        return "prestamos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Prestamo prestamo) {
        servicio.guardar(prestamo);
        return "redirect:/prestamos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("prestamo", servicio.obtenerPorId(id));
        return "prestamos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
        return "redirect:/prestamos";
    }
}