/**
 * EUtilsWebServiceConnection.java
 *
 * 2011.08.04
 *
 * This file is part of the CheMet library
 * 
 * The CheMet library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * CheMet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with CheMet.  If not, see <http://www.gnu.org/licenses/>.
 */
package uk.ac.ebi.metabolomes.webservices;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.log4j.Logger;

/**
 * @name    EUtilsWebServiceConnection
 * @date    2011.08.04
 * @version $Rev$ : Last Changed $Date$
 * @author  pmoreno
 * @author  $Author$ (this version)
 * @brief   Web service to access the E-Utils service from NCBI. Relies on Jersey Client. 
 * WARNING: see NCBI usage policies: 
 *
 */
public class EUtilsWebServiceConnection {
    
    private static final Logger LOGGER = Logger.getLogger(EUtilsWebServiceConnection.class);
    
    private Client client;
    private WebResource webResource;
    
    private final String baseURL = "http://eutils.ncbi.nlm.nih.gov/entrez/eutils/";
    
    
}
