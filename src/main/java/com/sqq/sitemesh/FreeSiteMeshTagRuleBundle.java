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

    private static final String DEFAULT_PREFIX = "sm";

    private String prefix = DEFAULT_PREFIX;

    public FreeSiteMeshTagRuleBundle() {
    }

    public FreeSiteMeshTagRuleBundle(String prefix) {
        if (prefix != null) {
            this.prefix = prefix;
        }
    }

    public void install(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
        defaultState.addRule(ruleKey("insert"), new SiteMeshInsertTagRule(siteMeshContext));
        defaultState.addRule(ruleKey("template"),
                new SiteMeshTemplateTagRule(contentProperty.getChild(Constants.TEMPLATE_PATH)));
        defaultState.addRule(ruleKey("component"),
                new SiteMeshComponentTagRule(contentProperty.getChild(Constants.COMPONENTS)));
        defaultState.addRule(ruleKey("attr"), new SiteMeshAttributeTagRule(siteMeshContext));
    }

    public void cleanUp(State defaultState, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
        // No op.
    }

    private String ruleKey(String key) {
        return prefix + ":" + key;
    }
}
