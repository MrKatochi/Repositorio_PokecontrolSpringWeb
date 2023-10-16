package com.pokecontrol.security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pokecontrol.models.Entrenador;
import com.pokecontrol.repositories.Entrenador_Repository;

/*
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    Entrenador_Repository repositorio_entrenador;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	Entrenador usuario = repositorio_entrenador.findFirstByEmail(username);

        if (usuario != null) {
            return User.builder()
                    .username(username)
                    .password(usuario.getPassword())
                    .authorities("ROLE_USER")
                    .build();
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
    }
}
*/


@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	Entrenador_Repository repositorio_entrenador;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	    Entrenador usuario = repositorio_entrenador.findFirstByEmail(email);

	    UserBuilder builder = null;

	    if (usuario != null) {
	        builder = User.withUsername(usuario.getName());
	        builder.disabled(false);
	        builder.password(usuario.getPassword());
	        builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
	    } else {
	        throw new UsernameNotFoundException("Usuario no encontrado");
	    }
	    return builder.build();
	}
}




