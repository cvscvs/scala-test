package errorhandlers

import scala.concurrent.Future

import javax.inject.Singleton
import play.api.http.HttpErrorHandler
import play.api.mvc.Results.InternalServerError
import play.api.mvc.Results.Status

@Singleton
class ErrorHandler extends HttpErrorHandler {
  //  @Override
  def onClientError(request: play.api.mvc.RequestHeader, statusCode: Int, message: String) = {
    Future.successful(
      Status(statusCode)("A client error occurred: " + message))
  }

  //  @Override
  def onServerError(request: play.api.mvc.RequestHeader, exception: Throwable): scala.concurrent.Future[play.api.mvc.Result] = {
    Future.successful(
      InternalServerError("A server error occurred: " + exception.getMessage))
  }
}

