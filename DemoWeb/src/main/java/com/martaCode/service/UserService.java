package com.martaCode.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.martaCode.model.Usuario;
import com.martaCode.repo.IUsuarioRepo;

@Service
public class UserService implements UserDetailsService{
	@Autowired 
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = repo.findByNombre(username);
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("admin"));

		UserDetails userDetail = new User(user.getNombre(), user.getClave(), roles);
		return userDetail;
	}

}
