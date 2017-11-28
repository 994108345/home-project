package designpatterns.command.demo.light;

import designpatterns.command.base.Command;

/**
 * Created by wenzailong on 2017/11/27.
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
