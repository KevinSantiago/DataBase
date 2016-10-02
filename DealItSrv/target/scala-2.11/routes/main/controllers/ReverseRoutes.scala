
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/deadmanpr/Documents/Git/DataBase/DealItSrv/conf/routes
// @DATE:Sun Oct 02 13:40:27 AST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def updateUser(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:20
    def deleteUserByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "DealItSrv/users/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:18
    def addUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:23
    def getItems(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
    // @LINE:27
    def deleteItemByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "DealItSrv/items/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:16
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/users")
    }
  
    // @LINE:17
    def getUserByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/users/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:13
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/logout")
    }
  
    // @LINE:24
    def getItemByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/items/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:26
    def updateItem(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv")
    }
  
    // @LINE:25
    def addItem(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/items")
    }
  
    // @LINE:12
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/login")
    }
  
  }


}
