/*
 *     This file is part of Metabolic Network Builder
 *
 *     Metabolic Network Builder is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Foobar is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
package uk.ac.ebi.metabolomes.identifier;

import org.apache.log4j.Logger;
import uk.ac.ebi.metabolomes.identifier.GenericIdentifier;

/**
 * MIRIAMEntry.java – MetabolicDevelopmentKit – Jun 25, 2011
 *
 * @author johnmay <johnmay@ebi.ac.uk, john.wilkinsonmay@gmail.com>
 */
public class MIRIAMEntry {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger( MIRIAMEntry.class );

    private String id;
    private String pattern;
    private String resouceName;
    private String definition;
    private String urn;
    private Class identifierClass = GenericIdentifier.class;

    public  MIRIAMEntry( String id , String pattern , String resouceName , String definition , String urn ) {
        this.id = id;
        this.pattern = pattern;
        this.resouceName = resouceName;
        this.definition = definition;
        this.urn = urn;
    }

    public String getDefinition() {
        return definition;
    }

    public String getId() {
        return id;
    }

    public static Logger getLogger() {
        return logger;
    }

    public String getPattern() {
        return pattern;
    }

    public String getResourceName() {
        return resouceName;
    }

    public String getUrn() {
        return urn;
    }

    /**
     * Allows the entry class to be set by the MIRIAMResouce enumeration for common encoded types
     * @param identifierClass
     */
    public  void setIdentifierClass( Class identifierClass ) {
        this.identifierClass = identifierClass;
    }

}
