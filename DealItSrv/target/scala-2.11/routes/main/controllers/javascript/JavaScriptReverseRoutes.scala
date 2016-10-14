
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/j-oma/Desktop/DataBase/DealItSrv/conf/routes
// @DATE:Thu Oct 13 23:19:18 BOT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:11
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(path0,file1) {
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-route") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular-route.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular-route.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("main.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-aria") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular-aria.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular-aria.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-material") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular-material.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular-material.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-animate") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular-animate.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular-animate.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-messages") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular-messages.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular-messages.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-material-icons") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular-material-icons.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular-material-icons.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-ui-grid") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("ui-grid.js") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-grid.js"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-material") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular-material.css") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular-material.css"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-ui-grid") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("ui-grid.css") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-grid.css"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-ui-grid") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("ui-grid.woff") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-grid.woff"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("home.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("about.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("login.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("cars.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cars.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("house.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "house.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("technology.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("furniture.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "furniture.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("profile.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("item.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "item.html"})
          }
        
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users"})
        }
      """
    )
  
    // @LINE:36
    def getFurniture: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getFurniture",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/itemsByCat/furniture"})
        }
      """
    )
  
    // @LINE:15
    def loginUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.loginUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/submit"})
        }
      """
    )
  
    // @LINE:26
    def deleteUserByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUserByID",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:24
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users"})
        }
      """
    )
  
    // @LINE:29
    def getItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getItems",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items"})
        }
      """
    )
  
    // @LINE:19
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/signup2"})
        }
      """
    )
  
    // @LINE:34
    def getCars: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getCars",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/itemsByCat/cars"})
        }
      """
    )
  
    // @LINE:33
    def deleteItemByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteItemByID",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:22
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users"})
        }
      """
    )
  
    // @LINE:37
    def getHouses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getHouses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/itemsByCat/houses"})
        }
      """
    )
  
    // @LINE:23
    def getUserByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:18
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.signup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/signup"})
        }
      """
    )
  
    // @LINE:14
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/logout"})
        }
      """
    )
  
    // @LINE:35
    def getTechnologyItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getTechnologyItems",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/itemsByCat/technology"})
        }
      """
    )
  
    // @LINE:30
    def getItemByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getItemByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:32
    def updateItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateItem",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items"})
        }
      """
    )
  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv"})
        }
      """
    )
  
    // @LINE:31
    def addItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items"})
        }
      """
    )
  
  }


}
