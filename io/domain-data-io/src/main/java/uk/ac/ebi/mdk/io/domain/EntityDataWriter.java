package uk.ac.ebi.mdk.io.domain;

import org.apache.log4j.Logger;
import uk.ac.ebi.caf.utility.version.annotation.CompatibleSince;
import uk.ac.ebi.mdk.io.EntityWriter;
import uk.ac.ebi.mdk.io.IdentifierOutput;
import uk.ac.ebi.mdk.domain.entity.Entity;

import java.io.DataOutput;
import java.io.IOException;

/**
 * ProteinProductDataWriter - 12.03.2012 <br/>
 * <p/>
 * Class descriptions.
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
@CompatibleSince("0.9")
public class EntityDataWriter
        implements EntityWriter<Entity> {

    private static final Logger LOGGER = Logger.getLogger(EntityDataWriter.class);

    private DataOutput out;
    private IdentifierOutput identifierOutput;
    
    public EntityDataWriter(DataOutput out, IdentifierOutput identifierOutput){
        this.out = out;
        this.identifierOutput = identifierOutput;
    }

    public void write(Entity entity) throws IOException {

        out.writeUTF(entity.getName());
        out.writeUTF(entity.getAbbreviation());
        identifierOutput.write(entity.getIdentifier());

    }

}
