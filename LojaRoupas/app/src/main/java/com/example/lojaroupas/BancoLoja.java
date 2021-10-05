package com.example.lojaroupas;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {produtos.class}, version = 1)
public abstract class BancoLoja extends RoomDatabase {
    public abstract DAOprodutos getDAO();
    private static BancoLoja INSTANCIA;

    //Modelo Singleton
    public static BancoLoja getBancodeDados(Context context) {
        if (INSTANCIA == null) {
            synchronized (BancoLoja.class) {
                if (INSTANCIA == null) {
                    INSTANCIA = Room.databaseBuilder(context.getApplicationContext(),
                            BancoLoja.class, "DBProdutos").allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCIA;
    }
}
