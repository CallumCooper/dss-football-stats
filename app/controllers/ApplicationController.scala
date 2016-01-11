package controllers

import play.api._
import play.api.mvc._

class ApplicationController extends Controller {

    // Render the index page
  def renderIndexPage = Action {
    Ok(views.html.index("Football Stats v1.0"))
  }
}
