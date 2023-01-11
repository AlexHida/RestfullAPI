package com.example.rest.Model;
import jakarta.persistence.*;
@Entity
@Table(schema = "dis")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    public long getId(){return id;}
    public void setId(long id){this.id=id;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getDescripcion(){return descripcion;}
    public void setDescripcion(String descripcion){this.descripcion=descripcion;}
}
