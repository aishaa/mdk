
/**
 * MoleculeRenderer.java
 *
 * 2011.09.08
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
package uk.ac.ebi.visualisation.molecule;


/**
 *          MoleculeRenderer – 2011.09.08 <br>
 *          Class description
 * @version $Rev$ : Last Changed $Date$
 * @author  johnmay
 * @author  $Author$ (this version)
 */
public class MoleculeRenderer {

//    private static final Logger LOGGER = Logger.getLogger(MoleculeRenderer.class);
//    private AtomContainerRenderer renderer;
//    private RendererModel model;
//    private final StructureDiagramGenerator structureGenerator = new StructureDiagramGenerator();
//
//
//    private MoleculeRenderer() {
//        List<IGenerator<IAtomContainer>> generators = new ArrayList<IGenerator<IAtomContainer>>();
//        generators.add(new BasicSceneGenerator());
//        generators.add(new BasicAtomGenerator());
//        generators.add(new BasicBondGenerator());
//        renderer = new AtomContainerRenderer(generators, new AWTFontManager());
//        model = renderer.getRenderer2DModel();
//    }
//
//
//    public static MoleculeRenderer getInstance() {
//        return MoleculeRendererHolder.INSTANCE;
//    }
//
//
//    private static class MoleculeRendererHolder {
//
//        private static final MoleculeRenderer INSTANCE = new MoleculeRenderer();
//    }
//
//
//    public BufferedImage getImage(IAtomContainer molecule, Rectangle bounds) throws CDKException {
//
//
//        BufferedImage img = new BufferedImage(bounds.width, bounds.height,
//                                              BufferedImage.TYPE_4BYTE_ABGR);
//        Graphics2D g2 = (Graphics2D) img.getGraphics();
//        structureGenerator.setMolecule(new Molecule(molecule));
//        structureGenerator.generateCoordinates();
//        IMolecule moleculeWithXYZ = structureGenerator.getMolecule();
//        renderer.paint(moleculeWithXYZ, new AWTDrawVisitor(g2), bounds, true);
//        g2.dispose();
//
//        return img;
//
//    }
//

}
