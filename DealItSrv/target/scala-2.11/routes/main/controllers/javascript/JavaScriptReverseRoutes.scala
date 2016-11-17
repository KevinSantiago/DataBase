
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/Oficial/DataBase/DealItSrv/conf/routes
// @DATE:Thu Nov 17 04:33:11 PST 2016

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
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("addPost.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addPost.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("cart.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("checkout.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkout.html"})
          }
        
          if (path0 == """ + implicitly[JavascriptLiteral[String]].to("/public/html/templates") + """ && file1 == """ + implicitly[JavascriptLiteral[String]].to("order_success.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order_success.html"})
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

  
    // @LINE:22
    def getPhoneNumbers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPhoneNumbers",
      """
        function(uid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/user/phone/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("uid", uid0)})
        }
      """
    )
  
    // @LINE:28
    def getOrderContent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getOrderContent",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/order/content"})
        }
      """
    )
  
    // @LINE:18
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/signup2"})
        }
      """
    )
  
    // @LINE:21
    def getUserInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserInfo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/user"})
        }
      """
    )
  
    // @LINE:36
    def getProductInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProductInfo",
      """
        function(pid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/product/info/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pid", pid0)})
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
  
    // @LINE:15
    def loginUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.loginUser",
      """
        function(password0,username1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/submit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("password", encodeURIComponent(password0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username1))})
        }
      """
    )
  
    // @LINE:34
    def getProductOwnerInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProductOwnerInfo",
      """
        function(pid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/product/ownerinfo/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pid", pid0)})
        }
      """
    )
  
    // @LINE:23
    def getCreditCard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getCreditCard",
      """
        function(aid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/user/creditcard/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("aid", aid0)})
        }
      """
    )
  
    // @LINE:27
    def getOrdersFromAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getOrdersFromAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/order"})
        }
      """
    )
  
    // @LINE:35
    def getFeedbackFromProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getFeedbackFromProduct",
      """
        function(pid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/product/feedback/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pid", pid0)})
        }
      """
    )
  
    // @LINE:33
    def getItemsPerCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getItemsPerCategory",
      """
        function(category0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/itemsByCat/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("category", encodeURIComponent(category0))})
        }
      """
    )
  
    // @LINE:32
    def getItemByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getItemByID",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/items/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
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
  
    // @LINE:24
    def getProductsFromUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProductsFromUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "DealItSrv/user/products"})
        }
      """
    )
  
  }


}
