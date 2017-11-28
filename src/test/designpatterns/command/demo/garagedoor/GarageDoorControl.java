package designpatterns.command.demo.garagedoor;

import designpatterns.command.base.Command;

/**
 * Created by wenzailong on 2017/11/27.
 */
public class GarageDoorControl {
    Command command;
    public GarageDoorControl(){}
    public void setCommand(Command command){
        this.command = command;
    }
    public void openDoor(){
        command.execute();
    }

}
