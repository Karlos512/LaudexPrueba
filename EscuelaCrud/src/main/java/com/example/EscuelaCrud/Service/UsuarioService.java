package com.example.EscuelaCrud.Service;

import com.example.EscuelaCrud.Controller.dto.UsuarioRegistroDTO;
import com.example.EscuelaCrud.Model.UsuarioModel;

public interface UsuarioService {
    public UsuarioModel guardar(UsuarioRegistroDTO registroDTO);

}
