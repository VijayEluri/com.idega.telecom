package com.idega.telecom.presentation;

import javax.faces.context.FacesContext;

import com.idega.telecom.services.bean.User;

public class UserInformation extends TelecomBlock {

	@Override
	public void present(FacesContext context) {
		User user = getTelecomServices().getUserByNumber("");
	}

}