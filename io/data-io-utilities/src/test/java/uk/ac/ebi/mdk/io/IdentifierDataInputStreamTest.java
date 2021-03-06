package uk.ac.ebi.mdk.io;

import org.apache.log4j.Logger;
import org.junit.Test;
import uk.ac.ebi.caf.utility.version.Version;
import uk.ac.ebi.caf.utility.version.VersionMap;
import uk.ac.ebi.caf.utility.version.annotation.CompatibleSince;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

/**
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public class IdentifierDataInputStreamTest {

    private static final Logger LOGGER = Logger.getLogger(IdentifierDataInputStreamTest.class);


    @Test
    public void testVersionTagsExist() throws IOException {
        IdentifierDataInputStream manager = new IdentifierDataInputStream(new DataInputStream(new ByteArrayInputStream(new byte[200])),
                                                               new Version("1.0"));
        for(VersionMap map : manager.getMarshals().values()){
            for(Object o : map.values()){
                assertNotNull(o.getClass().getAnnotation(CompatibleSince.class));
            }
        }

    }

}
