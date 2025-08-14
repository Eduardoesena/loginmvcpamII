package android.eduardo.loginmvc.controller;

import android.content.Context;
import android.eduardo.loginmvc.datasource.AppDataBase;

import java.util.Collections;
import java.util.List;

public class UsuarioController extends AppDataBase implements iCRUD {
    public UsuarioController(Context context) {
        super(context);
    }

    @Override
    public boolean inserir(Object obj) {
        return false;
    }

    @Override
    public boolean apagar(Object obj) {
        return false;
    }

    @Override
    public List listar() {
        return Collections.emptyList();
    }

    @Override
    public boolean alterar(Object obj) {
        return false;
    }
}
