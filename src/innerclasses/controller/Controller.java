package innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    // A class from java.util to hold Event objects:
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) { //添加事件对象
        eventList.add(c);
    }
    public void run() {
        while(eventList.size() > 0){ //事件列表大于0
            // Make a copy so you’re not modifying the list while you’re selecting the elements in it:复制一份eventList，这样在选择列表中的元素时不会修改列表
            for(Event e : new ArrayList<Event>(eventList)){
                if(e.ready()) { //当系统时间大于触发时间时，触发事件并从list移除该事件对象
                    System.out.println(e);
                    e.action(); //执行完每个事件，要注意的是当执行到Restart事件时，会把之前所有的事件再次放入eventList里面，导致后面会不断执行，直到添加了GreenhouseControls.Terminate
                    eventList.remove(e);
                }
            }
        }
    }
}
