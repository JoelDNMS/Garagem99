/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joel.garagem99.services;

import com.joel.garagem99.DTO.VeiculoDTO;
import com.joel.garagem99.entities.Veiculo;
import com.joel.garagem99.repositories.GaragemRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SantzK
 */
@Service
public class GaragemService {
    @Autowired
    private GaragemRepository repository;

    public List<VeiculoDTO> findAll() {
        return repository.findAll().stream().map(VeiculoDTO::new).collect(Collectors.toList());
    }

    public Veiculo findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<VeiculoDTO> findByColor(String cor) {
        return repository.findByCorIgnoreCase(cor).stream().map(VeiculoDTO::new).collect(Collectors.toList());
    }

    public List<VeiculoDTO> findByYear(int ano) {
        return repository.findByAno(ano).stream().map(VeiculoDTO::new).collect(Collectors.toList());
    }
}
