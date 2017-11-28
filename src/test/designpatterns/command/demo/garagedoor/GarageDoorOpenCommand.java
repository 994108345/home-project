package designpatterns.command.demo.garagedoor;

import designpatterns.command.base.Command;

/**
 * Created by wenzailong on 2017/11/27.
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorOpenCommand (GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }
}
