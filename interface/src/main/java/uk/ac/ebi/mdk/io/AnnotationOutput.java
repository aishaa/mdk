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

import uk.ac.ebi.mdk.domain.annotation.Annotation;

import java.io.IOException;

/**
 * AnnotationOutput - 11.03.2012 <br/>
 * <p/>
 * The AnnotationOutput interfaces describes a class that can write CheMet annotations
 * to a stream.
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public interface AnnotationOutput {

    /**
     * Write the annotation class and the annotation object
     * data to the stream. This would be equivalent to invoking
     * {@see writeClass(Annotation)} and {@see writeData(Annotation)}.
     * The analogous read method  for reading is
     * {@see AnnotationInput#read()}
     *
     * @param annotation the annotation to write
     *
     * @throws IOException low-level io error
     */
    public void write(Annotation annotation) throws IOException;

    /**
     * Write only the annotation object data to the stream. This is useful
     * when writing a collection of annotations (of the same type) as the
     * class data need only been written once.
     * <p/>
     * <pre>{@code
     * AnnotationOutput out = ...;
     *
     * out.writeClass(Synonym.class);
     * out.writeData(new Synonym("atp"));
     * out.writeData(new Synonym("adenosine triphosphate"));
     * out.writeData(new Synonym("adenosine 5'-triphosphate"));
     *
     * }</pre>
     *
     * The analogous read method is {@see AnnotationInput#read(Class)}
     *
     * @param annotation
     *
     * @throws IOException
     */
    public void writeData(Annotation annotation) throws IOException;

    /**
     * Write the annotation class to the stream.
     * The analogous read method is {@see AnnotationInput#readClass()}
     *
     * @param c
     *
     * @throws IOException
     */
    public void writeClass(Class c) throws IOException;

}
