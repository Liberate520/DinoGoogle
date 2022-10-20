package controllers;

import javafx.event.Event;
import javafx.event.EventDispatchChain;
import javafx.event.EventDispatcher;

public class MyEventHandler implements EventDispatcher {
    @Override
    public Event dispatchEvent(Event event, EventDispatchChain eventDispatchChain) {
        switch (event.getEventType().getName()){
            case "KEY_PRESSED":

        }
        return null;
    }
}
