package shixian.servicres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shixian.s;
import shixian.smapper;



@Service
public class serviceshixian implements service1{
@Autowired
private smapper smapper;

	@Override
	public s k(String id) {
		// TODO Auto-generated method stub
		s findk = smapper.findk(id);
		return findk;
	
	}

}
