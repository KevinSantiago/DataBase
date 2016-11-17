
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/Oficial/DataBase/DealItSrv/conf/routes
// @DATE:Wed Nov 16 22:00:06 PST 2016

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
      
        // @LINE:40
        case (path, file) if path == "/public/html/" && file == "index.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/"), ("file", "index.html")))
          Call("GET", _prefix)
      
        // @LINE:43
        case (path, file) if path == "/public/javascripts/node_modules/angular" && file == "angular.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular"), ("file", "angular.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular.js")
      
        // @LINE:44
        case (path, file) if path == "/public/javascripts/node_modules/angular-route" && file == "angular-route.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-route"), ("file", "angular-route.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-route.js")
      
        // @LINE:45
        case (path, file) if path == "/public/javascripts/" && file == "main.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/"), ("file", "main.js")))
          Call("GET", _prefix + { _defaultPrefix } + "main.js")
      
        // @LINE:46
        case (path, file) if path == "/public/javascripts/node_modules/angular-aria" && file == "angular-aria.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-aria"), ("file", "angular-aria.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-aria.js")
      
        // @LINE:47
        case (path, file) if path == "/public/javascripts/node_modules/angular-material" && file == "angular-material.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material"), ("file", "angular-material.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material.js")
      
        // @LINE:48
        case (path, file) if path == "/public/javascripts/node_modules/angular-animate" && file == "angular-animate.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-animate"), ("file", "angular-animate.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-animate.js")
      
        // @LINE:49
        case (path, file) if path == "/public/javascripts/node_modules/angular-messages" && file == "angular-messages.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-messages"), ("file", "angular-messages.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-messages.js")
      
        // @LINE:50
        case (path, file) if path == "/public/javascripts/node_modules/angular-material-icons" && file == "angular-material-icons.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material-icons"), ("file", "angular-material-icons.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material-icons.js")
      
        // @LINE:51
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.js")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.js")
      
        // @LINE:54
        case (path, file) if path == "/public/javascripts/node_modules/angular-material" && file == "angular-material.css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material"), ("file", "angular-material.css")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material.css")
      
        // @LINE:55
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.css")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.css")
      
        // @LINE:56
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.woff" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.woff")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.woff")
      
        // @LINE:59
        case (path, file) if path == "/public/html/templates" && file == "home.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "home.html")))
          Call("GET", _prefix + { _defaultPrefix } + "home.html")
      
        // @LINE:60
        case (path, file) if path == "/public/html/templates" && file == "about.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "about.html")))
          Call("GET", _prefix + { _defaultPrefix } + "about.html")
      
        // @LINE:61
        case (path, file) if path == "/public/html/templates" && file == "login.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "login.html")))
          Call("GET", _prefix + { _defaultPrefix } + "login.html")
      
        // @LINE:62
        case (path, file) if path == "/public/html/templates" && file == "cars.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "cars.html")))
          Call("GET", _prefix + { _defaultPrefix } + "cars.html")
      
        // @LINE:63
        case (path, file) if path == "/public/html/templates" && file == "house.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "house.html")))
          Call("GET", _prefix + { _defaultPrefix } + "house.html")
      
        // @LINE:64
        case (path, file) if path == "/public/html/templates" && file == "technology.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "technology.html")))
          Call("GET", _prefix + { _defaultPrefix } + "technology.html")
      
        // @LINE:65
        case (path, file) if path == "/public/html/templates" && file == "furniture.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "furniture.html")))
          Call("GET", _prefix + { _defaultPrefix } + "furniture.html")
      
        // @LINE:66
        case (path, file) if path == "/public/html/templates" && file == "profile.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "profile.html")))
          Call("GET", _prefix + { _defaultPrefix } + "profile.html")
      
        // @LINE:67
        case (path, file) if path == "/public/html/templates" && file == "item.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "item.html")))
          Call("GET", _prefix + { _defaultPrefix } + "item.html")
      
        // @LINE:68
        case (path, file) if path == "/public/html/templates" && file == "addPost.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "addPost.html")))
          Call("GET", _prefix + { _defaultPrefix } + "addPost.html")
      
        // @LINE:69
        case (path, file) if path == "/public/html/templates" && file == "cart.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "cart.html")))
          Call("GET", _prefix + { _defaultPrefix } + "cart.html")
      
        // @LINE:70
        case (path, file) if path == "/public/html/templates" && file == "checkout.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "checkout.html")))
          Call("GET", _prefix + { _defaultPrefix } + "checkout.html")
      
        // @LINE:71
        case (path, file) if path == "/public/html/templates" && file == "order_success.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "order_success.html")))
          Call("GET", _prefix + { _defaultPrefix } + "order_success.html")
      
      }
    
    }
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def loginUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/submit")
    }
  
    // @LINE:29
    def getOrderContent(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/order/content")
    }
  
    // @LINE:19
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/signup2")
    }
  
    // @LINE:24
    def getCreditCard(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/user/creditcard")
    }
  
    // @LINE:22
    def getUserInfo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/user")
    }
  
    // @LINE:36
    def getFeedbackFromProduct(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/product/feedback")
    }
  
    // @LINE:14
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/logout")
    }
  
    // @LINE:35
    def getProductOwnerInfo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/product/ownerinfo")
    }
  
    // @LINE:28
    def getOrdersFromAccount(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/order")
    }
  
    // @LINE:34
    def getItemsPerCategory(category:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/itemsByCat/" + implicitly[PathBindable[String]].unbind("category", dynamicString(category)))
    }
  
    // @LINE:33
    def getItemByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/items/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:37
    def getProductInfo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/product/info")
    }
  
    // @LINE:8
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv")
    }
  
    // @LINE:23
    def getPhoneNumbers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/user/phone")
    }
  
    // @LINE:25
    def getProductsFromUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/user/products")
    }
  
  }


}
