/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joel.garagem99.controllers;

import com.joel.garagem99.DTO.VeiculoDTO;
import com.joel.garagem99.entities.Veiculo;
import com.joel.garagem99.services.GaragemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SantzK
 */
@RestController
@RequestMapping("/garagem")
public class GaragemController {
    @Autowired
    private GaragemService service;

    @GetMapping("/forsale")
    public List<VeiculoDTO> getAll() {
        return service.findAll();
    }

    @GetMapping("/forsale/{id}")
    public Veiculo getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/color/{cor}")
    public List<VeiculoDTO> getByColor(@PathVariable String cor) {
        return service.findByColor(cor);
    }

    @GetMapping("/year/{ano}")
    public List<VeiculoDTO> getByYear(@PathVariable int ano) {
        return service.findByYear(ano);
    }
}
