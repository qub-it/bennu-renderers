/**
 * Copyright © 2008 Instituto Superior Técnico
 *
 * This file is part of Bennu Renderers Framework.
 *
 * Bennu Renderers Framework is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bennu Renderers Framework is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Bennu Renderers Framework.  If not, see <http://www.gnu.org/licenses/>.
 */
package pt.ist.fenixWebFramework.renderers.taglib;

import javax.servlet.jsp.JspException;

import pt.ist.fenixWebFramework.renderers.components.Constants;
import pt.ist.fenixWebFramework.renderers.model.MetaObject;

public class TemplateEditObjectTag extends EditObjectTag {

    public TemplateEditObjectTag() {
        super();
    }

    @Override
    public String getName() {
        if (super.getName() == null) {
            return Constants.TEMPLATE_OBJECT_NAME;
        } else {
            return super.getName();
        }
    }

    @Override
    protected Object getTargetObjectByName() throws JspException {
        MetaObject metaObject = (MetaObject) super.getTargetObjectByName();

        return metaObject.getObject();
    }

    @Override
    public String getScope() {
        if (super.getName() == null && super.getScope() == null) {
            return "request";
        } else {
            return super.getScope();
        }
    }
}
