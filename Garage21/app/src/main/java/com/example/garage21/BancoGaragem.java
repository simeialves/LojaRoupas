package com.example.garage21;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Carro.class}, version = 1)
public abstract class BancoGaragem extends RoomDatabase {
    public abstract CarroDAO getDAO();
    private static BancoGaragem INSTANCIA;

    //Modelo Singleton
    public static BancoGaragem getBancodeDados(Context context) {
        if (INSTANCIA == null) {
            synchronized (BancoGaragem.class) {
                if (INSTANCIA == null) {
                    INSTANCIA = Room.databaseBuilder(context.getApplicationContext(),
                            BancoGaragem.class, "DBCarros").allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCIA;
    }
}
