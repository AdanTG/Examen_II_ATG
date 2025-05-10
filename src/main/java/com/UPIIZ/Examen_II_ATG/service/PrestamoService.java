package com.UPIIZ.Examen_II_ATG.service;

import com.UPIIZ.Examen_II_ATG.model.Prestamo;
import com.UPIIZ.Examen_II_ATG.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository repository;

    public List<Prestamo> listarTodos() {
        return repository.findAll();
    }

    public void guardar(Prestamo prestamo) {
        repository.save(prestamo);
    }

    public Prestamo obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}