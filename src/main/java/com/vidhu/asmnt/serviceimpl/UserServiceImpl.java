package com.vidhu.asmnt.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidhu.asmnt.model.User;
import com.vidhu.asmnt.repo.UserRepo;
import com.vidhu.asmnt.service.UserService;

@Service
public class UserServiceImpl implements UserService {



	@Autowired
	UserRepo urepo;
	
	

	@Override
	public String addUser(User user) {
		urepo.save(user);
		System.out.println("User service");
		return "Success";
		
	}

	@Override
	
	public User getUser(int id) {
		Optional<User> userOptional = urepo.findById(id);
		return userOptional.orElse(null);

	}

	

	@Override
	public List<User> getAllUser() {
		return urepo.findAll();
	}

	
	@Override

	
	public String updateUser(User user) {
		if(user!=null)
		{
			urepo.save(user);
			return "success";
		}
		else {
			return "failure";
		}

	}

	@Override
	public String deleteUser(int bid) {
		urepo.deleteById(bid);
		return "Success";
		
	}


}
