package com.akka.experiments;

import akka.actor.typed.ActorSystem;

public class Main {

    public static void main(String[] args) {
        System.out.println(" [>] Track and Field Event");
        ActorSystem<RaceController.Command> controller = ActorSystem.create(RaceController.create(), "track-and-field");
        controller.tell(new RaceController.StartCommand());
    }
}
