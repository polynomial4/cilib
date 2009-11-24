/**
 * Copyright (C) 2003 - 2009
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.cilib.type.parser;

import net.sourceforge.cilib.type.types.Bounds;
import net.sourceforge.cilib.type.types.Type;

/**
 * Interface defining the manner in which <tt>Type</tt> object is to be created
 * in a standard fashion.
 *
 * The creation of the Type can be done using specified bounds or with no bounds.
 *
 * @author Gary Pampara
 */
interface TypeCreator {

    /**
     * Create the type in a standard fashion. If the type has the concept of bounds,
     * the maximum and minimum values for the bounds are used to bound the created
     * object.
     *
     * @return The newly created <tt>Type</tt>
     */
    Type create();

    /**
     * Create the type with the specified value.
     * @param value The value for the {@code Type}.
     * @return The created {@code Type} with the provided value.
     */
    Type create(double value);


    /**
     * Create the type using the bounds <tt>lower</tt> and <tt>upper</tt>.
     *
     * @param bounds The {@code Bounds} for the type.
     * @return The newly created <tt>Type</tt> object using the specified bounds
     */
    Type create(Bounds bounds);

}