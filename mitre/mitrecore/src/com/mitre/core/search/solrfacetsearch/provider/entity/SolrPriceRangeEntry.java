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
package com.mitre.core.search.solrfacetsearch.provider.entity;

import java.math.BigDecimal;


/**
 * Entity to hold one entry in the Solr price range.
 * @deprecated use {@link de.hybris.platform.b2bacceleratorfacades.search.solrfacetsearch.provider.entity.SolrPriceRangeEntry}
 */
@Deprecated
public class SolrPriceRangeEntry
{
	private final BigDecimal value;
	private final String currencyIso;

	public SolrPriceRangeEntry(final String value, final String currencyIso)
	{
		this.value = new BigDecimal(Double.valueOf(value));
		this.currencyIso = currencyIso;
	}

	public BigDecimal getValue()
	{
		return value;
	}

	public String getCurrencyIso()
	{
		return currencyIso;
	}
}
