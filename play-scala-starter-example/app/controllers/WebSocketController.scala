package controllers

import akka.actor.ActorSystem
import akka.stream.Materializer
import javax.inject.Inject
import javax.inject.Singleton
import play.api.libs.streams.ActorFlow
import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents
import play.api.mvc.WebSocket
import services.MyWebSocketActor

@Singleton
class WebSocketController @Inject() (cc: ControllerComponents)(implicit system: ActorSystem, materializer: Materializer) extends AbstractController(cc) {

  def socket = WebSocket.accept[String, String] { request =>
    ActorFlow.actorRef { out =>
      MyWebSocketActor.props(out)
    }
  }

}