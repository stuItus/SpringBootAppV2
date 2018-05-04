package ua.logos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ua.logos.entity.User;
import ua.logos.mapper.UserMapper;
import ua.logos.repository.UserRepository;

@Service
public class CustomUserDetails  implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findUserByEmail(email);
		if (user == null) throw new UsernameNotFoundException("User not found");
		return UserMapper.toSecurityUser(user);
	}

}
