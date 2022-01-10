package com.contabanco.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contabanco.domain.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Usuario> listar() {
		
		Usuario user1 = new Usuario(1, "12291231723", "Gustavo", "Guga", "Leticia", "Master");
		Usuario user2 = new Usuario(2, "55565562652", "Leticia", "lele", "030457AL", "Auxiliar");
		
			
		List<Usuario> lista = new ArrayList<>();
		lista.add(user1);
		lista.add(user2);
				
		return lista;
		
	}

}
