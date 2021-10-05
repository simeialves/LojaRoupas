package com.example.garage21;

import android.widget.Toast;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public abstract class CarroDAO {
    @Insert

    public abstract long insereCarro(Carro c);

}

