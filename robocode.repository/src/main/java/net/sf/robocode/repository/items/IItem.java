/*******************************************************************************
 * Copyright (c) 2001, 2009 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/cpl-v10.html
 *
 * Contributors:
 *     Pavel Savara
 *     - Initial implementation
 *******************************************************************************/
package net.sf.robocode.repository.items;


import net.sf.robocode.repository.root.IRepositoryRoot;

import java.net.URL;
import java.util.List;


/**
 * @author Pavel Savara (original)
 */
public interface IItem extends Comparable<Object> {
	URL getFullUrl();
	List<String> getFriendlyUrls();
	IRepositoryRoot getRoot();
	long getLastModified();

	void update(long lastModified, boolean force);
	boolean isValid();
}
