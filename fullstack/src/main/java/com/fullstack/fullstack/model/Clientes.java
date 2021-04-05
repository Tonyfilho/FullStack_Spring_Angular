package com.fullstack.fullstack.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data //Gera todos o Gets e Set, construtores e Hash e Equals
@Entity
public class Clientes {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String endereco;
    String telefone;


    // public Clientes(Long id, String nome, String endereco, String telefone) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.endereco = endereco;
    //     this.telefone = telefone;
    // }

    // public Long getId() {
    //     return this.id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getNome() {
    //     return this.nome;
    // }

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    // public String getEndereco() {
    //     return this.endereco;
    // }

    // public void setEndereco(String endereco) {
    //     this.endereco = endereco;
    // }

    // public String getTelefone() {
    //     return this.telefone;
    // }

    // public void setTelefone(String telefone) {
    //     this.telefone = telefone;
    // }


    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof Clientes)) {
    //         return false;
    //     }
    //     Clientes clientes = (Clientes) o;
    //     return Objects.equals(id, clientes.id) && Objects.equals(nome, clientes.nome) && Objects.equals(endereco, clientes.endereco) && Objects.equals(telefone, clientes.telefone);
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(id, nome, endereco, telefone);
    // }

    
}//end class
