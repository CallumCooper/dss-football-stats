package controllers

import play.api._
import play.api.mvc._

class TrendingController extends Controller {
    
    // Render Trending page
    def renderTrendingPage = Action {
        Ok(views.html.trending("Football Stats v1.0"))
    }
}