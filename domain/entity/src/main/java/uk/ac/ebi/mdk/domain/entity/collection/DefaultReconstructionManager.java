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
package uk.ac.ebi.mdk.domain.entity.collection;

import uk.ac.ebi.caf.utility.preference.type.ListPreference;
import uk.ac.ebi.mdk.domain.DomainPreferences;
import uk.ac.ebi.mdk.domain.entity.Reconstruction;
import uk.ac.ebi.mdk.domain.identifier.Identifier;

import java.io.File;
import java.util.*;

/**
 * ReconstructionManager.java
 * Class to manage the multiple reconstructions and maintain an 'active' reconstruction
 *
 * @author johnmay
 * @date Apr 13, 2011
 */
public class DefaultReconstructionManager implements ReconstructionManager {

    private static final org.apache.log4j.Logger LOGGER =
            org.apache.log4j.Logger.getLogger(
                    DefaultReconstructionManager.class);
    private Identifier activeProjectIdentifier;
    private ArrayList<Reconstruction> projects = new ArrayList<Reconstruction>();
    private LinkedHashMap<Identifier, Integer> projectMap =
            new LinkedHashMap();
    private Properties properties = new Properties();
    private LinkedList<String> recent = new LinkedList<String>();

    private ListPreference RECENT_FILES = DomainPreferences.getInstance().getPreference("RECENT_RECONSTRUCTIONS");

    private DefaultReconstructionManager() {

        // get the recently open files, remove entries that don't exists
        List<String> valid = new ArrayList();
        for (String file : RECENT_FILES.get()) {
            File f = new File(file);
            if (f.exists()) {
                valid.add(f.getAbsolutePath());
            }
        }
        recent.addAll(valid.subList(0, Math.min(valid.size(), 10)));
        RECENT_FILES.put(valid); // having validated put the list back


    }

    private static class ProjectManagerHolder {

        private static DefaultReconstructionManager INSTANCE = new DefaultReconstructionManager();
    }

    /**
     * Access the singleton instance of the manager
     *
     * @return Instance of the manager
     */
    public static DefaultReconstructionManager getInstance() {
        return ProjectManagerHolder.INSTANCE;
    }

    public Collection<Reconstruction> getProjects() {
        return projects;
    }

    /**
     * Access the project bank
     *
     * @param identifier
     *
     * @return The project related to the identifier if none is found null is returned
     */
    private Reconstruction getProject(Identifier identifier) {
        for (Reconstruction project : projects) {
            if (project.getIdentifier().equals(identifier)) {
                return project;
            }
        }
        return null;
    }

    /**
     * Access whether the
     *
     * @return
     */
    public boolean hasProjects() {
        return !projects.isEmpty();
    }

    @Override
    public void addReconstruction(Reconstruction reconstruction) {
        String path = reconstruction.getContainer().getAbsolutePath();
        if (recent.contains(path)) {
            recent.remove(path);
        }
        recent.add(path);
        RECENT_FILES.put(recent);

        for (Reconstruction entry : projects) {
            if (entry.getIdentifier().equals(reconstruction)) {
                setActiveReconstruction(entry.getIdentifier());
                LOGGER.error("found matching project but clashing identifiers stored:"
                                     + entry.getIdentifier()
                                     + " new:"
                                     + reconstruction.getIdentifier());
                return;
            }
        }

        LOGGER.debug(
                "Setting active with a project which can not be found in the current collection. A new entry will be created");

        projectMap.put(reconstruction.getIdentifier(), projects.size());
        projects.add(reconstruction);

    }

    /**
     * Access the active reconstruction
     *
     * @return
     */
    public Reconstruction getActive() {
        return getProject(activeProjectIdentifier);
    }

    /**
     * Removes a project from the manager
     *
     * @param reconstruction The reconstruction to remove
     *
     * @return
     */
    public boolean removeProject(Reconstruction reconstruction) {

        if (reconstruction == null) {
            return false;
        }

        Identifier id = reconstruction.getIdentifier();

        if (activeProjectIdentifier.equals(id)) {
            activeProjectIdentifier = null;
        }
        if (projectMap.containsKey(id)) {
            projectMap.remove(id);
        }
        return projects.remove(reconstruction);

    }

    /**
     * @param activeProjectIdentifier
     */
    public void setActiveReconstruction(Identifier activeProjectIdentifier) {
        this.activeProjectIdentifier = activeProjectIdentifier;
    }

    /**
     * Set the active reconstruction given a reconstruction object
     *
     * @param reconstruction
     */
    public void setActiveReconstruction(Reconstruction reconstruction) {

        String path = reconstruction.getContainer().getAbsolutePath();
        if (recent.contains(path)) {
            recent.remove(path);
        }
        recent.add(path);
        RECENT_FILES.put(recent);

        // is it keyed? then just get the identifier and set it
        if (projectMap.containsKey(reconstruction.getIdentifier())) {
            setActiveReconstruction(reconstruction.getIdentifier());
            return;
        }

        for (Reconstruction entry : projects) {
            if (entry.getIdentifier().equals(reconstruction)) {
                setActiveReconstruction(entry.getIdentifier());
                LOGGER.error("found matching project but clashing identifiers stored:"
                                     + entry.getIdentifier()
                                     + " new:"
                                     + reconstruction.getIdentifier());
                return;
            }
        }

        LOGGER.debug(
                "Setting active with a project which can not be found in the current collection. A new entry will be created");

        projectMap.put(reconstruction.getIdentifier(), projects.size());
        projects.add(reconstruction);

        setActiveReconstruction(reconstruction.getIdentifier());

    }

    /**
     * Access a stored project at the given index
     *
     * @param i
     *
     * @return
     */
    public Reconstruction getProject(int i) {
        return projects.get(i);
    }

    /**
     * Access the number of project currently managed
     */
    public int size() {
        return projects.size();
    }

    /**
     * Returns a list of recently opened reconstructions
     */
    public LinkedList<String> getRecent() {
        return recent;
    }
}
