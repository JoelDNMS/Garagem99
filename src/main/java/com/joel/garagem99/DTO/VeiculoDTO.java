/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joel.garagem99.DTO;

/**
 *
 * @author SantzK
 */
import com.joel.garagem99.entities.Veiculo;

public class VeiculoDTO {
    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private int km;
    private String linkImagem;

    public VeiculoDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.ano = veiculo.getAno();
        this.km = veiculo.getKm();
        this.linkImagem = veiculo.getLinkImagem();
    }
    
}
