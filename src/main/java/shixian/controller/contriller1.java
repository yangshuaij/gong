package shixian.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shixian.s;
import shixian.servicres.service1;

@Controller
public class contriller1 {
	@Autowired
	private service1 serviceshixian;

@RequestMapping(value="bnd")
@ResponseBody
public int km(String id){
	if(id.equals("")) {
		return 0;
	}
s k = serviceshixian.k(id);

	System.out.println(k);
	if(k==null) {
		return 1;
	}else {
		return 2;
	}
     
	}

@RequestMapping(value="bndd")
@ResponseBody
public int km1(String id,String password){
	System.out.println(id);
	System.out.println(password);
	if(password.equals("")&&id.equals("")) {
		return 1;
	}
s k = serviceshixian.k(id);
if(k==null) {
	return 2;
}else {

if(k.getPassword().equals(password)) {
	 return 3;
}else {
	 return 4;
}
	
}
	
}
     

}	

	


