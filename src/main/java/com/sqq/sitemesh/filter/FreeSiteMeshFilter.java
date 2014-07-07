package com.sqq.sitemesh.filter;

import javax.servlet.Filter;
import javax.servlet.ServletException;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

import com.sqq.sitemesh.FreeSiteMeshTagRuleBundle;

/**
 * 如要使用本组件，请在项目的web.xml配置该filter
 *  @author yuanren.le
 *
 */
public class FreeSiteMeshFilter extends ConfigurableSiteMeshFilter{
	
	private SiteMeshExtendFilter extendFilter;
	
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.setTagRuleBundles(new FreeSiteMeshTagRuleBundle());
		
		extendFilter = new SiteMeshExtendFilter(
				builder.getSelector(), builder.getContentProcessor());
	}

	@Override
	protected Filter setup() throws ServletException {
		super.setup();
		return extendFilter;
	}
}
