package controllers

import play.api._
import play.api.mvc._

class NewsController extends Controller {
    
    // Render news page
    def renderNewsPage = Action {
        Ok(views.html.news("Football Stats v1.0"))
    }
}