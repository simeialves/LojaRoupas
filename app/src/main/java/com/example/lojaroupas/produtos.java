package com.example.lojaroupas;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class produtos {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "Descricao")
    private String descricao;
    @ColumnInfo(name = "Fornecedor")
    private String fornecedor;
    @ColumnInfo(name = "Marca")
    private String marca;
    @ColumnInfo(name = "Preco")
    private float preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
