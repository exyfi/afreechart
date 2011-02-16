/* ========================================================================
 * AFreeChart : a free chart library for Android(tm) platform.
 *              (based on JFreeChart and JCommon)
 * ========================================================================
 *
 * (C) Copyright 2010, by Icom Systech Co., Ltd.
 * (C) Copyright 2000-2005, by Object Refinery Limited and Contributors.
 * 
 * Project Info:
 *    AFreeChart: http://code.google.com/p/afreechart/
 *    JFreeChart: http://www.jfree.org/jfreechart/index.html
 *    JCommon   : http://www.jfree.org/jcommon/index.html
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * [Android is a trademark of Google Inc.]
 * 
 * ---------------
 * ObjectList.java
 * ---------------
 * 
 * (C) Copyright 2010, by Icom Systech Co., Ltd.
 *
 * Original Author:  shiraki  (for Icom Systech Co., Ltd);
 * Contributor(s):   Sato Yoshiaki ;
 *                   Niwano Masayoshi;
 *
 * Changes (from 19-Nov-2010)
 * --------------------------
 * 19-Nov-2010 : port JCommon 1.0.16 to Android as "AFreeChart"
 * 
 * ------------- JFreeChart ---------------------------------------------
 * (C) Copyright 2003, 2004, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 *
 * Changes
 * -------
 * 17-Jul-2003 : Version 1 (DG);
 * 13-Aug-2003 : Refactored to extend AbstractObjectList (DG);
 * 21-Oct-2004 : removed duplicate interface declarations and empty methods.
 * 22-Oct-2004 : Restored removed methods - see note in code (DG);
 * 
 */

package org.afree.util;

/**
 * A list of objects that can grow as required.
 * <p>
 * When cloning, the objects in the list are NOT cloned, only the references.
 * 
 * @author Thomas Morgner
 */
public class ObjectList extends AbstractObjectList {

    /**
     * 
     */
    private static final long serialVersionUID = 2683811442645658830L;

    /**
     * Default constructor.
     */
    public ObjectList() {
    }

    /**
     * Creates a new list.
     * 
     * @param initialCapacity
     *            the initial capacity.
     */
    public ObjectList(final int initialCapacity) {
        super(initialCapacity);
    }

    // NOTE: the methods below look redundant, but their purpose is to provide
    // public
    // access to the the get(), set() and indexOf() methods defined in the
    // AbstractObjectList class, for this class only. For other classes
    // (e.g. PaintList, ShapeList etc) we don't want the Object versions of
    // these
    // methods to be visible in the public API.

    /**
     * Returns the object at the specified index, if there is one, or
     * <code>null</code>.
     * 
     * @param index
     *            the object index.
     * 
     * @return The object or <code>null</code>.
     */
    public Object get(final int index) {
        return super.get(index);
    }

    /**
     * Sets an object reference (overwriting any existing object).
     * 
     * @param index
     *            the object index.
     * @param object
     *            the object (<code>null</code> permitted).
     */
    public void set(final int index, final Object object) {
        super.set(index, object);
    }

    /**
     * Returns the index of the specified object, or -1 if the object is not in
     * the list.
     * 
     * @param object
     *            the object.
     * 
     * @return The index or -1.
     */
    public int indexOf(final Object object) {
        return super.indexOf(object);
    }

}
