package command;

import com.haichao.day6.Command.*;
import com.haichao.day6.Command.GarageDoor.GarageDoor;
import com.haichao.day6.Command.GarageDoor.GarageDoorOpenCommand;
import com.haichao.day6.Command.Light.Light;
import com.haichao.day6.Command.Light.LightOnCommand;

public class RemoteControlTest {
  public static void main(String[] args) {
    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);

    simpleRemoteControl.setCommand(lightOnCommand);
    simpleRemoteControl.btnWasPressed();

    GarageDoor garageDoor = new GarageDoor();
    GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    simpleRemoteControl.setCommand(garageDoorOpenCommand);
    simpleRemoteControl.btnWasPressed();
  }
}
