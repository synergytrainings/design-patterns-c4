package com.company.facade;

import com.company.facade.util.SocialType;

public class Main {

	public static void main(String[] args) {
		AccountFacade accountFacade = AccountFacade.getInstance();

		accountFacade.createAccount("AA", "BB", SocialType.FACEBOOK);
		accountFacade.createAccount("All", "All_PAss", null);

		accountFacade.share("All", "Hello", null);
		accountFacade.share("All", "Hello FB", SocialType.FACEBOOK);
	}

}
