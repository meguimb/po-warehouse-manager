package ggc.app.main;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import ggc.WarehouseManager;
//FIXME import classes

/**
 * Advance current date.
 */
class DoAdvanceDate extends Command<WarehouseManager> {

  DoAdvanceDate(WarehouseManager receiver) {
    super(Label.ADVANCE_DATE, receiver);
    addIntegerField("days", Prompt.daysToAdvance());
  }

  @Override
  public final void execute() throws CommandException {
    //FIXME implement command
    // do a try catch with WarehouseManager.advanceDate
    try {
      _receiver.advanceDate((integerField("days"));
    } catch (DaysToAdvanceNotValidException e) {
      // é preciso mandar exceção para a UI??
      // bank sketch
      // throw new InvalidRemovalUIException(e.getAccount(), e.getAmount());
    }
  }
}
