package android.eduardo.loginmvc.controller;

import java.util.List;

public interface iCRUD<T> {
    public boolean inserir(T obj);
    public boolean apagar(T obj);
    public List<T> listar();
    public boolean alterar(T obj);
}
