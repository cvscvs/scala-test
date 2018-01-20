package controllers

import javax.inject.Singleton
import javax.inject.Inject
import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents

import akka.stream.scaladsl.Source
import play.api.http.ContentTypes
import play.api.libs.Comet
import play.api.libs.json._
import play.api.mvc._

import akka.actor.ActorSystem
import akka.stream.Materializer

@Singleton
class CometChunkController @Inject() (cc: ControllerComponents)(implicit system: ActorSystem, materializer: Materializer) extends AbstractController(cc) {

  def cometString = Action {
    implicit val m = materializer
    def stringSource: Source[String, _] = Source(List("kiki", "foo", "bar"))
    println(Comet.string("parent.cometMessage"))
    Ok.chunked(stringSource via Comet.string("parent.cometMessage")).as(ContentTypes.HTML)
  }

  def cometJson = Action {
    implicit val m = materializer
    def jsonSource: Source[JsValue, _] = Source(List(JsString("jsonString")))
    Ok.chunked(jsonSource via Comet.json("parent.cometMessage")).as(ContentTypes.JSON)
  }
}