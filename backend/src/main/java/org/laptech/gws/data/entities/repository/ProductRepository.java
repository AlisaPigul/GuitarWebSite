package org.laptech.gws.data.entities.repository;

import org.laptech.gws.data.entities.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 * @author rlapin
 */
public interface ProductRepository extends SolrCrudRepository<Product,String>{
}
