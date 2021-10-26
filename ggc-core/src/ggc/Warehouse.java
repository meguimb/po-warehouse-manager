package ggc;

import java.io.IOException;
import java.io.Serializable;

import ggc.exceptions.BadEntryException;
// FIXME import classes (cannot import from pt.tecnico or ggc.app)

/**
 * Class Warehouse implements a warehouse.
 */
public class Warehouse implements Serializable {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 202109192006L;

  // FIXME define attributes
  /** List of all Partners of Warehouse */
  private Map<String, Partner> _partners = new HashMap<>();

  /** List of all Transactions */
  private Map<int, Transaction> _transactions = new HashMap<>();

  /** List of all Products */
  private Map<String, Product> _products = new Product<>();

  // FIXME define contructor(s)
  // FIXME define methods


  public Collection<Partner> get_partners(){
    return Collections.unmodifiableCollection(_partners.values());
  }

  public Collection<Product> get_products(){
    return Collections.unmodifiableCollection(_products.values());
  }

  public void registerPartner(String id, String name) throws DuplicatePartnerException {
    if (_partners.containsKey(id))
      throw new DuplicatePartnerException(id, name);
    Partner p = new Partner(id, name);
    _partners.put(id, p);
  }

  /**
   * @param txtfile filename to be loaded.
   * @throws IOException
   * @throws BadEntryException
   */
  void importFile(String txtfile) throws IOException, BadEntryException /* FIXME maybe other exceptions */ {
    //FIXME implement method
  }
}
