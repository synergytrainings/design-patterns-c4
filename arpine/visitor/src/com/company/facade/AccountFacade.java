package com.company.facade;

import java.nio.file.AccessDeniedException;

import com.company.facade.model.FacebookManager;
import com.company.facade.model.GoogleManager;
import com.company.facade.model.TwitterManager;
import com.company.facade.util.SocialType;
import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by arpine on 1/7/18.
 */
public class AccountFacade {

	private final FacebookManager facebookManager;
	private final TwitterManager twitterManager;
	private final GoogleManager googleManager;

	private AccountFacade() {
		this.facebookManager = new FacebookManager();
		this.twitterManager = new TwitterManager();
		this.googleManager = new GoogleManager();
	}

	private static final AccountFacade instance = new AccountFacade();

	public static AccountFacade getInstance() {
		return instance;
	}


	public void createAccount(String userName, String password, SocialType socialType) {
		if (socialType == null) {
			createFacebookAccount(userName, password);
			createTwitterAccount(userName, password);
			createGoogleAccount(userName);
		} else {
			switch (socialType) {
				case FACEBOOK:
					createFacebookAccount(userName, password);
					break;
				case TWITTER:
					createTwitterAccount(userName, password);
					break;
				case GOOGLE:
					createGoogleAccount(userName);
					break;

			}

		}
	}

	public void share(String userName, String content, SocialType socialType) {
		if (socialType == null) {
			shareToFacebook(userName, content);
			shareToTwitter(userName, content);
			shareToGoogle(userName, content);

		} else {
			switch (socialType) {
				case FACEBOOK:
					shareToFacebook(userName, content);
					break;
				case TWITTER:
					shareToTwitter(userName, content);
					break;
				case GOOGLE:
					shareToGoogle(userName, content);
					break;

			}

		}
	}

	private void createGoogleAccount(String userName) {
		googleManager.createAccount(userName);
	}

	private void createTwitterAccount(String userName, String password) {
		try {
			twitterManager.addUser(userName);
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
			System.out.println("Invalid  twitter user");

		}
	}

	private void createFacebookAccount(String userName, String password) {

		try {
			facebookManager.register(userName, password);
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
			System.out.println("Invalid  facebook user");

		}
	}


	private void shareToGoogle(String userName, String content) {
		try {
			if (googleManager.hasAccess(userName)) {
				googleManager.share(content);
			}
		} catch (AccessDeniedException e) {
			System.out.println("Invalid  google user");
			e.printStackTrace();

		}
	}

	private void shareToTwitter(String userName, String content) {
		try {
			if (twitterManager.hasAccess(userName)) {
				twitterManager.retweet(content);
			}
		} catch (AccessDeniedException e) {
			e.printStackTrace();
			System.out.println("Invalid twitter user");

		}
	}

	private void shareToFacebook(String userName, String content) {
		try {
			if (facebookManager.hasAccess(userName)) {
				facebookManager.share(content);
			}
		} catch (AccessDeniedException e) {
			e.printStackTrace();
			System.out.println("Invalid facebook user ");

		}
	}
}
