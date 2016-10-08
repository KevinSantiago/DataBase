
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/ProjectDataBase/DataBase-master/DealItSrv/conf/routes
// @DATE:Sat Oct 08 11:22:36 PDT 2016

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
      
        // @LINE:32
        case (path, file) if path == "/public/html/" && file == "index.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/"), ("file", "index.html")))
          Call("GET", _prefix)
      
        // @LINE:35
        case (path, file) if path == "/public/javascripts/node_modules/angular" && file == "angular.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular"), ("file", "angular.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular.js")
      
        // @LINE:36
        case (path, file) if path == "/public/javascripts/node_modules/angular-route" && file == "angular-route.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-route"), ("file", "angular-route.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-route.js")
      
        // @LINE:37
        case (path, file) if path == "/public/javascripts/" && file == "main.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/"), ("file", "main.js")))
          Call("GET", _prefix + { _defaultPrefix } + "main.js")
      
        // @LINE:38
        case (path, file) if path == "/public/javascripts/node_modules/angular-aria" && file == "angular-aria.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-aria"), ("file", "angular-aria.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-aria.js")
      
        // @LINE:39
        case (path, file) if path == "/public/javascripts/node_modules/angular-material" && file == "angular-material.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material"), ("file", "angular-material.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material.js")
      
        // @LINE:40
        case (path, file) if path == "/public/javascripts/node_modules/angular-animate" && file == "angular-animate.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-animate"), ("file", "angular-animate.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-animate.js")
      
        // @LINE:41
        case (path, file) if path == "/public/javascripts/node_modules/angular-messages" && file == "angular-messages.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-messages"), ("file", "angular-messages.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-messages.js")
      
        // @LINE:42
        case (path, file) if path == "/public/javascripts/node_modules/angular-material-icons" && file == "angular-material-icons.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material-icons"), ("file", "angular-material-icons.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material-icons.js")
      
        // @LINE:45
        case (path, file) if path == "/public/javascripts/node_modules/angular-material" && file == "angular-material.css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material"), ("file", "angular-material.css")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material.css")
      
        // @LINE:50
        case (path, file) if path == "/public/html/templates" && file == "home.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "home.html")))
          Call("GET", _prefix + { _defaultPrefix } + "home.html")
      
        // @LINE:51
        case (path, file) if path == "/public/html/templates" && file == "about.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "about.html")))
          Call("GET", _prefix + { _defaultPrefix } + "about.html")
      
      }
    
    }
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def updateUser(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:22
    def deleteUserByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "DealItSrv/users/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:20
    def addUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:25
    def getItems(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
    // @LINE:29
    def deleteItemByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "DealItSrv/items/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:18
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:19
    def getUserByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/users/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:15
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/logout")
    }
  
    // @LINE:26
    def getItemByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/items/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:28
    def updateItem(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
    // @LINE:8
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv")
    }
  
    // @LINE:27
    def addItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
    // @LINE:14
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/login")
    }
  
  }


}
