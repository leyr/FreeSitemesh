package com.sqq.sitemesh;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.tagprocessor.State;

import com.sqq.sitemesh.rule.SiteMeshAttributeTagRule;
import com.sqq.sitemesh.rule.SiteMeshComponentTagRule;
import com.sqq.sitemesh.rule.SiteMeshInsertTagRule;
import com.sqq.sitemesh.rule.SiteMeshTemplateTagRule;

public class FreeSiteMeshTagRuleBundle implements TagRuleBundle {

    public void install(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
        defaultState.addRule("sm:insert", new SiteMeshInsertTagRule(siteMeshContext));
        defaultState.addRule("sm:template",
                new SiteMeshTemplateTagRule(contentProperty.getChild(Constants.TEMPLATE_PATH)));
        defaultState.addRule("sm:component",
                new SiteMeshComponentTagRule(contentProperty.getChild(Constants.COMPONENTS)));
        defaultState.addRule("sm:attr", new SiteMeshAttributeTagRule(siteMeshContext));
    }

    public void cleanUp(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
        // No op.
    }
}
