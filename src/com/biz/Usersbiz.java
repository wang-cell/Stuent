package com.biz;

import com.bean.Users;

public class Usersbiz implements IUsersBiz {

	
	public boolean chaeck(Users us) {
		if(us.getUname()!=null&&!us.getUname().trim().equals("")){
			return true;
		}
		return false;
	}

}
