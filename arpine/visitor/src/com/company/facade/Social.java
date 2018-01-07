package com.company.facade;

import java.nio.file.AccessDeniedException;

/**
 * Created by arpine on 1/7/18.
 */
public interface Social {
	boolean hasAccess(String userName) throws AccessDeniedException;
}
