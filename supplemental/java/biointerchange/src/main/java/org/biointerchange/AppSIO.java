package org.biointerchange;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import java.util.Set;

import org.biointerchange.vocabulary.*;

/**
 * Demo on how to make use of BioInterchange's vocabulary classes.
 *
 * @author Joachim Baran
 */
public class AppSIO
{
    public static void main(String[] args)
    {
        Resource perception = SIO.perception();
        System.out.println("'perception' property:");
        printResource(perception);

        System.out.println("'to_oxidize' properties:");
        Set<Resource> toOxidize = SIO.to_oxidize();
        for (Resource toOxidizeSynonym : toOxidize)
            printResource(toOxidizeSynonym);

        System.out.println("'to_change_materially' properties:");
        Resource toChangeMaterially = SIO.to_change_materially();
        printResource(toChangeMaterially);

        System.out.println("'to_oxidize' property with parent datatype property 'to_change_materially':");
        Set<Resource> toOxodizeUnderToChangeMateriallyProperties = SIO.withParent(toOxidize, toChangeMaterially);
        for (Resource toOxidizeSynonym : toOxodizeUnderToChangeMateriallyProperties)
            printResource(toOxidizeSynonym);
    }

    private static void printResource(Resource resource) {
        System.out.println("    " + resource.toString());
        System.out.println("        Namespace:                            " + resource.getNameSpace());
        System.out.println("        Local name:                           " + resource.getLocalName());
        System.out.println("        Jena Property (rather than Resource): " + (resource instanceof Property));
        System.out.println("        Ontology class:                       " + SIO.isClass(resource));
        System.out.println("        Ontology object property:             " + SIO.isObjectProperty(resource));
        System.out.println("        Ontology datatype property:           " + SIO.isDatatypeProperty(resource));
    }
}
