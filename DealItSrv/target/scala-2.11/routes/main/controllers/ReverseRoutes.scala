
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Public/DataBase/DealItSrv/conf/routes
// @DATE:Thu Oct 13 09:33:27 AST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:8
package controllers {

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at(path:String, file:String): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:11
        case (path, file) if path == "/public" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
          Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
      
        // @LINE:36
        case (path, file) if path == "/public/html/" && file == "index.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/"), ("file", "index.html")))
          Call("GET", _prefix)
      
        // @LINE:39
        case (path, file) if path == "/public/javascripts/node_modules/angular" && file == "angular.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular"), ("file", "angular.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular.js")
      
        // @LINE:40
        case (path, file) if path == "/public/javascripts/node_modules/angular-route" && file == "angular-route.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-route"), ("file", "angular-route.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-route.js")
      
        // @LINE:41
        case (path, file) if path == "/public/javascripts/" && file == "main.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/"), ("file", "main.js")))
          Call("GET", _prefix + { _defaultPrefix } + "main.js")
      
        // @LINE:42
        case (path, file) if path == "/public/javascripts/node_modules/angular-aria" && file == "angular-aria.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-aria"), ("file", "angular-aria.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-aria.js")
      
        // @LINE:43
        case (path, file) if path == "/public/javascripts/node_modules/angular-material" && file == "angular-material.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material"), ("file", "angular-material.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material.js")
      
        // @LINE:44
        case (path, file) if path == "/public/javascripts/node_modules/angular-animate" && file == "angular-animate.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-animate"), ("file", "angular-animate.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-animate.js")
      
        // @LINE:45
        case (path, file) if path == "/public/javascripts/node_modules/angular-messages" && file == "angular-messages.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-messages"), ("file", "angular-messages.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-messages.js")
      
        // @LINE:46
        case (path, file) if path == "/public/javascripts/node_modules/angular-material-icons" && file == "angular-material-icons.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material-icons"), ("file", "angular-material-icons.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material-icons.js")
      
        // @LINE:47
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.js")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.js")
      
        // @LINE:50
        case (path, file) if path == "/public/javascripts/node_modules/angular-material" && file == "angular-material.css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material"), ("file", "angular-material.css")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material.css")
      
        // @LINE:51
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.css")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.css")
      
        // @LINE:52
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.woff" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.woff")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.woff")
      
        // @LINE:55
        case (path, file) if path == "/public/html/templates" && file == "home.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "home.html")))
          Call("GET", _prefix + { _defaultPrefix } + "home.html")
      
        // @LINE:56
        case (path, file) if path == "/public/html/templates" && file == "about.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "about.html")))
          Call("GET", _prefix + { _defaultPrefix } + "about.html")
      
        // @LINE:57
        case (path, file) if path == "/public/html/templates" && file == "login.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "login.html")))
          Call("GET", _prefix + { _defaultPrefix } + "login.html")
      
        // @LINE:58
        case (path, file) if path == "/public/html/templates" && file == "cars.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "cars.html")))
          Call("GET", _prefix + { _defaultPrefix } + "cars.html")
      
        // @LINE:59
        case (path, file) if path == "/public/html/templates" && file == "house.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "house.html")))
          Call("GET", _prefix + { _defaultPrefix } + "house.html")
      
        // @LINE:60
        case (path, file) if path == "/public/html/templates" && file == "technology.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "technology.html")))
          Call("GET", _prefix + { _defaultPrefix } + "technology.html")
      
        // @LINE:61
        case (path, file) if path == "/public/html/templates" && file == "furniture.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "furniture.html")))
          Call("GET", _prefix + { _defaultPrefix } + "furniture.html")
      
      }
    
    }
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def updateUser(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:15
    def loginUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/submit")
    }
  
    // @LINE:26
    def deleteUserByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "DealItSrv/users/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:24
    def addUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:29
    def getItems(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
    // @LINE:19
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/signup2")
    }
  
    // @LINE:33
    def deleteItemByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "DealItSrv/items/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:22
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:23
    def getUserByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/users/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:18
    def signup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/signup")
    }
  
    // @LINE:14
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/logout")
    }
  
    // @LINE:30
    def getItemByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/items/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:32
    def updateItem(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
    // @LINE:8
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv")
    }
  
    // @LINE:31
    def addItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
  }


}
