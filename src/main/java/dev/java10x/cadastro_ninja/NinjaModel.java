package dev.java10x.cadastro_ninja;

import jakarta.persistence.*;

@Entity
@Table(name = "ninja")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String name, String email, int idade) {
        this.name = name;
        this.email = email;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
