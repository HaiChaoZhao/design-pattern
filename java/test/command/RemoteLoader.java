package command;

import com.haichao.day6.Command.Fan.CeillingFan;
import com.haichao.day6.Command.Fan.CeillingFanOffCommand;
import com.haichao.day6.Command.Fan.CeillingFanOnCommand;
import com.haichao.day6.Command.GarageDoor.GarageDoor;
import com.haichao.day6.Command.GarageDoor.GarageDoorDownCommand;
import com.haichao.day6.Command.GarageDoor.GarageDoorOpenCommand;
import com.haichao.day6.Command.Light.Light;
import com.haichao.day6.Command.Light.LightOffCommand;
import com.haichao.day6.Command.Light.LightOnCommand;
import com.haichao.day6.Command.RemoteControl;
import com.haichao.day6.Command.SimpleRemoteControl;
import com.haichao.day6.Command.Stereo.Stereo;
import com.haichao.day6.Command.Stereo.StereoOffCommand;
import com.haichao.day6.Command.Stereo.StereoOnWithCDCommand;

public class RemoteLoader
{
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light();
    Light kitchenLight = new Light();
    CeillingFan ceillingFan = new CeillingFan();
    GarageDoor garageDoor = new GarageDoor();
    Stereo stereo = new Stereo();

    LightOnCommand livingLightOnCommand = new LightOnCommand(livingRoomLight);
    LightOffCommand livingLightOffCommand = new LightOffCommand(livingRoomLight);

    LightOnCommand kitchLightOnCommand = new LightOnCommand(kitchenLight);
    LightOffCommand kitchLightOffCommand = new LightOffCommand(kitchenLight);

    CeillingFanOnCommand ceillingFanOnCommand = new CeillingFanOnCommand(ceillingFan);
    CeillingFanOffCommand ceillingFanOffCommand = new CeillingFanOffCommand(ceillingFan);

    GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

    remoteControl.setCommands(0, livingLightOnCommand, livingLightOffCommand);
    remoteControl.setCommands(1, kitchLightOnCommand, kitchLightOffCommand);
    remoteControl.setCommands(2, ceillingFanOnCommand, ceillingFanOffCommand);
    remoteControl.setCommands(3, stereoOnWithCDCommand, stereoOffCommand);

    System.out.println(remoteControl);

    remoteControl.onBtnWasPressed(0);
    remoteControl.offBtnWasPressed(0);

    remoteControl.onBtnWasPressed(1);
    remoteControl.offBtnWasPressed(1);

    remoteControl.onBtnWasPressed(2);
    remoteControl.offBtnWasPressed(2);

    remoteControl.onBtnWasPressed(3);
    remoteControl.offBtnWasPressed(3);
  }
}
