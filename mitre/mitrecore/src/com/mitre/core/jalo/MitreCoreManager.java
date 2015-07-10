/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package com.mitre.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.mitre.core.constants.MitreCoreConstants;
import com.mitre.core.setup.CoreSystemSetup;

import org.apache.log4j.Logger;


/**
 * Don't use. User {@link CoreSystemSetup} instead.
 */
@SuppressWarnings("PMD")
public class MitreCoreManager extends GeneratedMitreCoreManager
{
	@SuppressWarnings("unused")
	private static Logger LOG = Logger.getLogger(MitreCoreManager.class.getName());

	public static final MitreCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MitreCoreManager) em.getExtension(MitreCoreConstants.EXTENSIONNAME);
	}
}
