/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.controller;

import projetovendas.interfaces.IOperacao;
import projetovendas.model.Estado;

/**
 *
 * @author aluno
 */
public class EstadoController implements IOperacao {

    private Estado estado;

    @Override
    public void cadastrar() {
        estado.cadastrar();
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        estado = null;
        return true;
    }

    @Override
    public void cancelar() {
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}