/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao.implementation;

import co.com.poli.appcreditos.dao.IUsuarioDao;
import co.com.poli.appcreditos.data.UsuarioData;
import co.com.poli.appcreditos.model.Usuario;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class UsuarioDaoImpl implements IUsuarioDao{

    @Override
    public List<Usuario> obtenerListaUsuarios() {
        return UsuarioData.getListaUsuarios();
    }

    @Override
    public Usuario obtenerUsuario(String documento) {
        Usuario usuario = null;
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        for (Usuario userLista : listaUsuarios) {
            if(userLista.getDocumento().equals(documento)){
                usuario = userLista;
            }
        }
        return usuario;
    }

    @Override
    public String crearUsuario(Usuario usuario) {
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        listaUsuarios.add(usuario);
        UsuarioData.setListaUsuarios(listaUsuarios);
        return "Usuario Creado";
    }

    @Override
    public String modificarUsuario(Usuario usuario) {
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        listaUsuarios.set(listaUsuarios.indexOf(usuario), usuario);
        UsuarioData.setListaUsuarios(listaUsuarios);
        return "Usuario Modificado";
    }

    @Override
    public String eliminarUsuario(String documento) {
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        listaUsuarios.remove(obtenerUsuario(documento));
        UsuarioData.setListaUsuarios(listaUsuarios);
        return "Usuario Eliminado";
    }
    
    @Override
    public Usuario obtenerUsuario(String email, String clave) {
        Usuario usuario = null;
        List<Usuario> obtenerListaUsuarios = obtenerListaUsuarios();
        for (Usuario user : obtenerListaUsuarios) {
            /*
            if(user.getEmail().equals(email) && 
               user.getClave().equals(clave)){
                usuario = user;
            }*/
        }
        return usuario;
    }    
}
