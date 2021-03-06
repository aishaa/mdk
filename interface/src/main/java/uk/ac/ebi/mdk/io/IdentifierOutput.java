/*
 * Copyright (C) 2012  John May and Pablo Moreno
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package uk.ac.ebi.mdk.io;

import uk.ac.ebi.mdk.domain.identifier.Identifier;

import java.io.IOException;

/**
 * IdentifierOutput - 11.03.2012 <br/>
 * <p/>
 * The IdentifierOutput interface describes a class that can write CheMet identifiers
 * to a stream.
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public interface IdentifierOutput {

    /**
     * Write the class of the identifier
     *
     * @param c class to write
     *
     * @throws IOException low-level io error
     */
    public void writeClass(Class<? extends Identifier> c) throws IOException;

    /**
     * Write only the object data for the identifier to the stream. This method
     * is useful when we have collections or repeats of the same identifier type
     *
     * @param identifier data to write
     *
     * @throws IOException low-level io error
     */
    public void writeData(Identifier identifier) throws IOException;

    /**
     * Write the identifier class and data to the stream. Useful when we have a
     * single identifier or we have a mixed collection of different type identifier.
     * @param identifier
     * @throws IOException
     */
    public void write(Identifier identifier) throws IOException;

}
