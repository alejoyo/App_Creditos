/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.business.IUsuarioBusiness;
import co.com.poli.appcreditos.dao.implementation.UsuarioDaoImpl;
import co.com.poli.appcreditos.model.Usuario;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class UsuarioBusinessImpl implements IUsuarioBusiness {

    private UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();

    @Override
    public List<Usuario> obtenerListaUsuarios() {
        return usuarioDaoImpl.obtenerListaUsuarios();
    }

    @Override
    public Usuario obtenerUsuario(String documento) {
        return usuarioDaoImpl.obtenerUsuario(documento);
    }

    @Override
    public String crearUsuario(Usuario usuario) {
        String respuesta = "Usuario ya existe";
        Usuario user = obtenerUsuario(usuario.getDocumento());
        if (user == null) {
            respuesta = usuarioDaoImpl.crearUsuario(usuario);
        }
        return respuesta;
    }

    @Override
    public String modificarUsuario(Usuario usuario) {
        String respuesta = "Usuario no existe";
        Usuario user = obtenerUsuario(usuario.getDocumento());
        if (user != null) {
            respuesta = usuarioDaoImpl.modificarUsuario(usuario);
        }
        return respuesta;
    }

    @Override
    public String eliminarUsuario(String documento) {
     String respuesta = "Usuario no existe";
        Usuario user = obtenerUsuario(documento);
        if (user != null) {
            respuesta = usuarioDaoImpl.eliminarUsuario(documento);
        }
        return respuesta;
    }

    @Override
    public Usuario obtenerUsuario(String email, String clave) {
       return usuarioDaoImpl.obtenerUsuario(email, clave);
    }
}
