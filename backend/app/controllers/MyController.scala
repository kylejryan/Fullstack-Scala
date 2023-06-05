package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Json

@Singleton
class MyController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
    def myEndpoint () = Action { implicit req: Request[AnyContent] =>
    Ok(Json.obj("message" -> "Hello from the backend!"))
    }
}