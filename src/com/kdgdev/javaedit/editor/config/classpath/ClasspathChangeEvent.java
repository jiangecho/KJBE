/*
    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    version 2 of the license, or (at your option) any later version.
*/

package com.kdgdev.javaedit.editor.config.classpath;

import java.util.EventObject;

/**
 * Change event for <tt>ClasspathChangeListener</tt>s.
 *
 * @author <a href="mailto:jclasslib@ej-technologies.com">Ingo Kegel</a>
 * @version $Revision: 1.2 $ $Date: 2006/09/25 16:00:58 $
 */
public class ClasspathChangeEvent extends EventObject {

    private boolean removal;

    /**
     * Constructor.
     *
     * @param source  the source object
     * @param removal if a classpath entry has been removed.
     */
    public ClasspathChangeEvent(Object source, boolean removal) {
        super(source);
        this.removal = removal;
    }

    /**
     * Return whether a classpath entry has been removed.
     *
     * @return the value
     */
    public boolean isRemoval() {
        return removal;
    }
}
