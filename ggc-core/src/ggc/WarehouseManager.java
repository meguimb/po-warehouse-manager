package ggc;

import java.io.IOException;
import java.io.FileNotFoundException;

import ggc.exceptions.BadEntryException;
import ggc.exceptions.ImportFileException;
import ggc.exceptions.MissingFileAssociationException;
import ggc.exceptions.UnavailableFileException;
//FIXME import classes (cannot import from pt.tecnico or ggc.app)

/** Façade for access. */
public class WarehouseManager {

  /** Name of file storing current store. */
  private String _filename = "";

  /** The warehouse itself. */
  private Warehouse _warehouse = new Warehouse();

  //FIXME define other attributes
  private int _date = 0;
  //FIXME define constructor(s)
  //FIXME define other methods

  /**
   * @@throws IOException
   * @@throws FileNotFoundException
   * @@throws MissingFileAssociationException
   */
  public void save() throws IOException, FileNotFoundException, MissingFileAssociationException {
    //FIXME implement serialization method
  }

  /**
   * @@param filename
   * @@throws MissingFileAssociationException
   * @@throws IOException
   * @@throws FileNotFoundException
   */
  public void saveAs(String filename) throws MissingFileAssociationException, FileNotFoundException, IOException {
    _filename = filename;
    save();
  }

  /**
   * @@param filename
   * @@throws UnavailableFileException
   */
  public void load(String filename) throws UnavailableFileException {
    //FIXME implement serialization method
  }

  /**
   * @param textfile
   * @throws ImportFileException
   */
  public void importFile(String textfile) throws ImportFileException {
    try {
	    _warehouse.importFile(textfile);
    } catch (IOException | BadEntryException /* FIXME maybe other exceptions */ e) {
	    throw new ImportFileException(textfile);
    }
  }


  // Getter and setter for the Date
  public int getDate(){
    return _date;
  }

  // catch exception on a higher level (who calls this function)
  public void advanceDate(int days) throws DaysToAdvanceNotValidException {
    if (days <= 0){
      throw new DaysToAdvanceNotValidException(days, _date);
    }
    _date += days;
  }

  public Collection<Partner> get_partners(){
    return _warehouse.get_partners();
  }

  public Collection<Product> get_products(){
    return _warehouse.get_products();
  }

  public void registerPartner(String id, String name){
    _warehouse.registerPartner(id, name);
  }
}
