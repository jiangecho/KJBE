/*
    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    version 2 of the license, or (at your option) any later version.
*/

package com.kdgdev.javaedit.editor.detail.constants;


import com.kdgdev.javaedit.editor.BrowserServices;
import com.kdgdev.javaedit.editor.detail.FixedListDetailPane;

import javax.swing.tree.TreePath;

/**
 * Base class for all constant pool entry detail panes.
 *
 * @author <a href="mailto:jclasslib@ej-technologies.com">Ingo Kegel</a>
 * @version $Revision: 1.5 $ $Date: 2006/09/25 16:00:58 $
 */
public abstract class AbstractConstantInfoDetailPane extends FixedListDetailPane {

    /**
     * Message which is diplayed if the constant pool entry is invalid.
     */
    protected static final String MESSAGE_INVALID_CONSTANT_POOL_ENTRY = "invalid constant pool entry";

    /**
     * Constructor.
     *
     * @param services the associated editor services.
     */
    protected AbstractConstantInfoDetailPane(BrowserServices services) {
        super(services);

    }

    /**
     * Get the constant pool index corrensponding to a selection in
     * <tt>BrowserTreePane</tt>.
     *
     * @param treePath the tree path
     * @return the index
     */
    protected int constantPoolIndex(TreePath treePath) {
        return getIndex(treePath);
    }

}


