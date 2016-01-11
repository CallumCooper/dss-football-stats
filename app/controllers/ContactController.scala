package controllers

import play.api._
import play.api.mvc._

class ContactController extends Controller {
    
    // Render the contact page
    def renderContactPage = Action {
        Ok(views.html.contact("Football Stats v1.0"))
    }
}