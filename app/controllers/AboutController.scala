package controllers

import play.api._
import play.api.mvc._

class AboutController extends Controller {
    
    // Render the about page
    def renderAboutPage = Action {
        Ok(views.html.about("Football Stats v1.0"))
    }
}