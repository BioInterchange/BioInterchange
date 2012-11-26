package org.biointerchange;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import org.apache.commons.collections.CollectionUtils;

import org.biointerchange.vocabulary.*;

/**
 * Demo on how to make use of BioInterchange classes.
 *
 * @author Joachim Baran
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource p = GFF3O.gap();
        Resource r = ResourceFactory.createResource("http://www.biointerchange.org/something#res1");

        System.out.println("p URI: " + p.getURI());
        System.out.println("p namespace: " + p.getNameSpace());
        System.out.println("p local name: " + p.getLocalName());

        System.out.println("r URI: " + r.getURI());
    }
}
