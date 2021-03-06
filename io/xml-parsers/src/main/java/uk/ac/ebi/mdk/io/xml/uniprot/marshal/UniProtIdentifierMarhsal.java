package uk.ac.ebi.mdk.io.xml.uniprot.marshal;

import org.apache.log4j.Logger;
import org.codehaus.stax2.XMLStreamReader2;
import uk.ac.ebi.mdk.domain.identifier.SwissProtIdentifier;
import uk.ac.ebi.mdk.domain.entity.ProteinProduct;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

/**
 * Adds an identifier to the protein product
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public class UniProtIdentifierMarhsal implements UniProtXMLMarshal {

    private static final Logger LOGGER = Logger.getLogger(UniProtIdentifierMarhsal.class);

    @Override
    public String getStartTag() {
        return "accession";
    }

    @Override
    public void marshal(XMLStreamReader2 reader, ProteinProduct product) throws XMLStreamException {
        if( reader.next() == XMLEvent.CHARACTERS){
            product.setIdentifier(new SwissProtIdentifier(reader.getText()));
        }
    }
}
