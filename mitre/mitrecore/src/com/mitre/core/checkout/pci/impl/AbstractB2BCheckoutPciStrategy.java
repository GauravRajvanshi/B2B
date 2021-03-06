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
package com.mitre.core.checkout.pci.impl;

import com.mitre.core.checkout.pci.B2BCheckoutPciStrategy;

import org.springframework.beans.factory.annotation.Required;


/**
 *@deprecated use {@link de.hybris.platform.b2bacceleratorservices.order.checkout.pci.impl.AbstractB2BCheckoutPciStrategy}
 */
@Deprecated
public abstract class AbstractB2BCheckoutPciStrategy implements B2BCheckoutPciStrategy
{
    private B2BCheckoutPciStrategy defaultCheckoutPciStrategy;


    protected B2BCheckoutPciStrategy getDefaultCheckoutPciStrategy()
    {
        return this.defaultCheckoutPciStrategy;
    }

    @Required
    public void setDefaultCheckoutPciStrategy(final B2BCheckoutPciStrategy defaultCheckoutPciStrategy)
    {
        this.defaultCheckoutPciStrategy = defaultCheckoutPciStrategy;
    }
}
