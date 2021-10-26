package ggc.app.partners;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import ggc.WarehouseManager;
//FIXME import classes

/**
 * Register new partner.
 */
class DoRegisterPartner extends Command<WarehouseManager> {

  DoRegisterPartner(WarehouseManager receiver) {
    super(Label.REGISTER_PARTNER, receiver);
    addStringField("id", Prompts.requestPartnerKey());
    addStringField("name", Prompt.partnerName());
    /** addStringField("address", Prompt.partnerAddress());*/
  }

  @Override
  public void execute() throws CommandException {
    //FIXME implement command
    try {
      String id = stringField("id");
      String name = stringField("name");
      /** address??  */
      _receiver.registerPartner(id, name);
      _display.popup(Messages.clientCreated(id, name));
    } catch (DuplicateClientException e) {
      throw new DuplicateClientIdException(e.getId());
    }
  }

}
