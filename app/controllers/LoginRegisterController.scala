package controllers

import play.api._
import play.api.mvc._

class LoginRegisterController extends Controller {
    
    // Render the register page
    def renderLoginRegisterPage() = Action {
        Ok(views.html.loginRegister("Football Stats v1.0"))
    }
    
}