package controllers

import play.api._
import play.api.mvc._

class MediaController extends Controller {
    
    // Render the Media page.
    def renderMediaPage = Action {
        Ok(views.html.media("Football Stats v1.0"))
    }
}