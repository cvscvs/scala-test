package controllers

import akka.stream.scaladsl.FileIO
import akka.stream.scaladsl.Source
import akka.util.ByteString
import javax.inject.Inject
import javax.inject.Singleton
import play.api.http.HttpEntity
import play.api.mvc.AbstractController
import play.api.mvc.ControllerComponents
import play.api.mvc.ResponseHeader
import play.api.mvc.Result
import java.io.InputStream
import java.io.FileInputStream
import akka.stream.scaladsl.StreamConverters

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
  private val pdfCombine = "D://combine.pdf"
  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  //chunked response
  def chunkedFromSource = Action {
    val source = Source.apply(List("kiki", "foo", "bar"))
    Ok.chunked(source)
  }
  
  def chunked = Action {
    val data = getDataStream
    val dataContent: Source[ByteString, _] = StreamConverters.fromInputStream(() => data)    
    Ok.chunked(dataContent)
  }
  
  private def getDataStream = {
    val f:InputStream = new FileInputStream(pdfCombine)
    f
  }

  //stream response
  def streaming3 = Action {
    val file = new java.io.File(pdfCombine)
    val path: java.nio.file.Path = file.toPath
    val source: Source[ByteString, _] = FileIO.fromPath(path)

    Result(
      header = ResponseHeader(200, Map.empty),
      body = HttpEntity.Streamed(source, None, Some("application/pdf")))
  }

  def streamedWithContentLength = Action {
    val file = new java.io.File(pdfCombine)
    val path: java.nio.file.Path = file.toPath
    val source: Source[ByteString, _] = FileIO.fromPath(path)

    val contentLength = Some(file.length())

    Result(
      header = ResponseHeader(200, Map.empty),
      body = HttpEntity.Streamed(source, contentLength, Some("application/pdf")))
  }

  

}
