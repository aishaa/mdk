package uk.ac.ebi.mdk.service.query.data;

import org.apache.log4j.Logger;
import org.openscience.cdk.interfaces.IChemObjectBuilder;
import org.openscience.cdk.interfaces.IMolecularFormula;
import org.openscience.cdk.silent.SilentChemObjectBuilder;
import org.openscience.cdk.tools.manipulator.MolecularFormulaManipulator;
import uk.ac.ebi.mdk.domain.identifier.ChEBIIdentifier;
import uk.ac.ebi.mdk.service.index.data.ChEBIDataIndex;
import uk.ac.ebi.mdk.service.loader.writer.DefaultDataIndexWriter;
import uk.ac.ebi.mdk.service.query.AbstractLuceneService;

import java.util.Collection;

/**
 * HMDBChemicalDataService - 27.02.2012 <br/>
 * <p/>
 * Class provides MolecularChargeService and MolecularFormulaService for the
 * Human Metabolome Database
 *
 * @author johnmay
 * @author $Author$ (this version)
 * @version $Rev$
 */
public class ChEBIDataService
        extends AbstractLuceneService<ChEBIIdentifier>
        implements MolecularChargeService<ChEBIIdentifier>,
                   MolecularFormulaService<ChEBIIdentifier> {

    private static final Logger LOGGER = Logger.getLogger(ChEBIDataService.class);

    private static final IChemObjectBuilder BUILDER = SilentChemObjectBuilder.getInstance();

    public ChEBIDataService() {
        super(new ChEBIDataIndex());
    }

    /**
     * @inheritDoc
     */
    @Override
    public IMolecularFormula getIMolecularFormula(ChEBIIdentifier identifier) {
        String formula = getMolecularFormula(identifier);
        if(formula.isEmpty())
            return BUILDER.newInstance(IMolecularFormula.class);
        return MolecularFormulaManipulator.getMolecularFormula(formula,
                                                               BUILDER);
    }
    /**
     * @inheritDoc
     */
    @Override
    public String getMolecularFormula(ChEBIIdentifier identifier) {
        return firstValue(identifier, MOLECULAR_FORMULA);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Collection<ChEBIIdentifier> searchMolecularFormula(IMolecularFormula formula, boolean approximate) {
        return searchMolecularFormula(MolecularFormulaManipulator.getString(formula), approximate);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Collection<ChEBIIdentifier> searchMolecularFormula(String formula, boolean approximate) {
        if(approximate){
            LOGGER.error("Approximate search is not yet implemented");
        }
        return getIdentifiers(construct(formula, MOLECULAR_FORMULA));
    }

    /**
     * @inheritDoc
     */
    @Override
    public Double getCharge(ChEBIIdentifier identifier) {
        String value = firstValue(identifier, MOLECULAR_CHARGE);
        // reuse method for the write that will get a Double.NAN on fail
        return DefaultDataIndexWriter.getChargeValue(value);
    }

    /**
     * @inheritDoc
     */
    @Override
    public ChEBIIdentifier getIdentifier() {
        return new ChEBIIdentifier();
    }


}
