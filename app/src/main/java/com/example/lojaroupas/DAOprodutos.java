package com.example.lojaroupas;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public abstract class DAOprodutos {
    @Insert
    public abstract long insereProduto(produtos p);
}
