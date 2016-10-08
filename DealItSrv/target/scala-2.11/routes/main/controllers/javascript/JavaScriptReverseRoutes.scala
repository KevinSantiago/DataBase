
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/ProjectDataBase/DataBase-master/DealItSrv/conf/routes
// @DATE:Sat Oct 08 11:22:36 PDT 2016

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
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/javascripts/node_modules/angular-material") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("angular-material.css") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angular-material.css"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("home.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("about.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about.html"})
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

  
    // @LINE:21
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users"})
        }
      """
    )
  
    // @LINE:22
    def deleteUserByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUserByID",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:20
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users"})
        }
      """
    )
  
    // @LINE:25
    def getItems: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getItems",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items"})
        }
      """
    )
  
    // @LINE:29
    def deleteItemByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteItemByID",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:18
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users"})
        }
      """
    )
  
    // @LINE:19
    def getUserByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/users/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:15
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/logout"})
        }
      """
    )
  
    // @LINE:26
    def getItemByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getItemByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:28
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
  
    // @LINE:27
    def addItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items"})
        }
      """
    )
  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/login"})
        }
      """
    )
  
  }


}
