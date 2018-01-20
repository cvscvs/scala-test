package services

import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.Props

object MyWebSocketActor{
  def props(out: ActorRef)= Props(new MyWebSocketActor(out))
}

class MyWebSocketActor(out: ActorRef) extends Actor{
  def receive = {
    case msg: String =>
      out ! ("I received your message: "+ msg)
  }
}