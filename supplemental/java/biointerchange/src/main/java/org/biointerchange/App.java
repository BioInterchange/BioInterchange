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
public class App 
{
    public static void main( String[] args )
    {
        Resource seqid = GFF3O.seqid();
        System.out.println("'seqid' property:");
        printResource(seqid);

        System.out.println("'start' properties:");
        Set<Resource> start = GFF3O.start();
        for (Resource startSynonym : start)
            printResource(startSynonym);

        System.out.println("'feature_properties' properties:");
        Set<Resource> featureProperties = GFF3O.feature_properties();
        for (Resource featurePropertiesSynonym : featureProperties)
            printResource(featurePropertiesSynonym);

        System.out.println("'feature_properties' properties, which are a datatype property:");
        CollectionUtils.filter(featureProperties, new Predicate() {
            public boolean evaluate(Object o) {
                return GFF3O.isDatatypeProperty((Resource)o);
            }
        });
        for (Resource featurePropertiesSynonym : featureProperties)
            printResource(featurePropertiesSynonym);

        System.out.println("'start' property with parent datatype property 'feature_properties':");
        Set<Resource> startUnderDatatypeFeatureProperties = GFF3O.withParent(start, featureProperties.iterator().next());
        for (Resource startSynonym : startUnderDatatypeFeatureProperties)
            printResource(startSynonym);
    }

    private static void printResource(Resource resource) {
        System.out.println("    " + resource.toString());
        System.out.println("        Namespace:                            " + resource.getNameSpace());
        System.out.println("        Local name:                           " + resource.getLocalName());
        System.out.println("        Jena Property (rather than Resource): " + (resource instanceof Property));
        System.out.println("        Ontology class:                       " + GFF3O.isClass(resource));
        System.out.println("        Ontology object property:             " + GFF3O.isObjectProperty(resource));
        System.out.println("        Ontology datatype property:           " + GFF3O.isDatatypeProperty(resource));
    }
}
