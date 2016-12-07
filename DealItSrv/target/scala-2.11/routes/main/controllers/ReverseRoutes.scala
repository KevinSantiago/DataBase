
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jariel/Documents/Oficial/DataBase/DealItSrv/conf/routes
// @DATE:Wed Dec 07 08:52:13 PST 2016

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
      
        // @LINE:45
        case (path, file) if path == "/public/html/" && file == "index.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/"), ("file", "index.html")))
          Call("GET", _prefix)
      
        // @LINE:48
        case (path, file) if path == "/public/javascripts/node_modules/angular" && file == "angular.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular"), ("file", "angular.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular.js")
      
        // @LINE:49
        case (path, file) if path == "/public/javascripts/node_modules/angular-route" && file == "angular-route.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-route"), ("file", "angular-route.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-route.js")
      
        // @LINE:50
        case (path, file) if path == "/public/javascripts/" && file == "main.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/"), ("file", "main.js")))
          Call("GET", _prefix + { _defaultPrefix } + "main.js")
      
        // @LINE:51
        case (path, file) if path == "/public/javascripts/node_modules/angular-aria" && file == "angular-aria.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-aria"), ("file", "angular-aria.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-aria.js")
      
        // @LINE:52
        case (path, file) if path == "/public/javascripts/node_modules/angular-material" && file == "angular-material.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material"), ("file", "angular-material.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material.js")
      
        // @LINE:53
        case (path, file) if path == "/public/javascripts/node_modules/angular-animate" && file == "angular-animate.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-animate"), ("file", "angular-animate.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-animate.js")
      
        // @LINE:54
        case (path, file) if path == "/public/javascripts/node_modules/angular-messages" && file == "angular-messages.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-messages"), ("file", "angular-messages.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-messages.js")
      
        // @LINE:55
        case (path, file) if path == "/public/javascripts/node_modules/angular-material-icons" && file == "angular-material-icons.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material-icons"), ("file", "angular-material-icons.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material-icons.js")
      
        // @LINE:56
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.js")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.js")
      
        // @LINE:57
        case (path, file) if path == "/public/javascripts/node_modules/angular-local-storage/src" && file == "angular-local-storage.js" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-local-storage/src"), ("file", "angular-local-storage.js")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-local-storage.js")
      
        // @LINE:60
        case (path, file) if path == "/public/javascripts/node_modules/angular-material" && file == "angular-material.css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-material"), ("file", "angular-material.css")))
          Call("GET", _prefix + { _defaultPrefix } + "angular-material.css")
      
        // @LINE:61
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.css" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.css")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.css")
      
        // @LINE:62
        case (path, file) if path == "/public/javascripts/node_modules/angular-ui-grid" && file == "ui-grid.woff" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts/node_modules/angular-ui-grid"), ("file", "ui-grid.woff")))
          Call("GET", _prefix + { _defaultPrefix } + "ui-grid.woff")
      
        // @LINE:65
        case (path, file) if path == "/public/html/templates" && file == "home.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "home.html")))
          Call("GET", _prefix + { _defaultPrefix } + "home.html")
      
        // @LINE:66
        case (path, file) if path == "/public/html/templates" && file == "about.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "about.html")))
          Call("GET", _prefix + { _defaultPrefix } + "about.html")
      
        // @LINE:67
        case (path, file) if path == "/public/html/templates" && file == "login.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "login.html")))
          Call("GET", _prefix + { _defaultPrefix } + "login.html")
      
        // @LINE:68
        case (path, file) if path == "/public/html/templates" && file == "cars.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "cars.html")))
          Call("GET", _prefix + { _defaultPrefix } + "cars.html")
      
        // @LINE:69
        case (path, file) if path == "/public/html/templates" && file == "house.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "house.html")))
          Call("GET", _prefix + { _defaultPrefix } + "house.html")
      
        // @LINE:70
        case (path, file) if path == "/public/html/templates" && file == "technology.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "technology.html")))
          Call("GET", _prefix + { _defaultPrefix } + "technology.html")
      
        // @LINE:71
        case (path, file) if path == "/public/html/templates" && file == "furniture.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "furniture.html")))
          Call("GET", _prefix + { _defaultPrefix } + "furniture.html")
      
        // @LINE:72
        case (path, file) if path == "/public/html/templates" && file == "profile.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "profile.html")))
          Call("GET", _prefix + { _defaultPrefix } + "profile.html")
      
        // @LINE:73
        case (path, file) if path == "/public/html/templates" && file == "item.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "item.html")))
          Call("GET", _prefix + { _defaultPrefix } + "item.html")
      
        // @LINE:74
        case (path, file) if path == "/public/html/templates" && file == "addPost.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "addPost.html")))
          Call("GET", _prefix + { _defaultPrefix } + "addPost.html")
      
        // @LINE:75
        case (path, file) if path == "/public/html/templates" && file == "cart.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "cart.html")))
          Call("GET", _prefix + { _defaultPrefix } + "cart.html")
      
        // @LINE:76
        case (path, file) if path == "/public/html/templates" && file == "checkout.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/html/templates"), ("file", "checkout.html")))
          Call("GET", _prefix + { _defaultPrefix } + "checkout.html")
      
        // @LINE:77
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

  
    // @LINE:26
    def getPhoneNumbers(uid:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/user/phone/" + implicitly[PathBindable[Integer]].unbind("uid", uid))
    }
  
    // @LINE:19
    def createAccount(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/createAccount")
    }
  
    // @LINE:22
    def createCreditCard(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/createCreditCard")
    }
  
    // @LINE:28
    def getProductsFromUser(aid:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/user/products/" + implicitly[PathBindable[Integer]].unbind("aid", aid))
    }
  
    // @LINE:32
    def getOrderContent(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/order/content")
    }
  
    // @LINE:21
    def createPhone(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/createPhone")
    }
  
    // @LINE:18
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/signup2")
    }
  
    // @LINE:31
    def getOrdersFromAccount(aid:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/order/" + implicitly[PathBindable[Integer]].unbind("aid", aid))
    }
  
    // @LINE:25
    def getUserInfo(aid:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/user/" + implicitly[PathBindable[Integer]].unbind("aid", aid))
    }
  
    // @LINE:41
    def filterResults(filter:String, category:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/filter/" + implicitly[PathBindable[String]].unbind("filter", dynamicString(filter)) + "/" + implicitly[PathBindable[String]].unbind("category", dynamicString(category)))
    }
  
    // @LINE:40
    def getProductInfo(pid:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/product/info/" + implicitly[PathBindable[Integer]].unbind("pid", pid))
    }
  
    // @LINE:14
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "DealItSrv/logout")
    }
  
    // @LINE:20
    def createCred(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/createCred")
    }
  
    // @LINE:15
    def loginUser(password:String, username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login/submit/" + implicitly[PathBindable[String]].unbind("password", dynamicString(password)) + "/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
    // @LINE:38
    def getProductOwnerInfo(pid:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/product/ownerinfo/" + implicitly[PathBindable[Integer]].unbind("pid", pid))
    }
  
    // @LINE:27
    def getCreditCard(aid:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/user/creditcard/" + implicitly[PathBindable[Integer]].unbind("aid", aid))
    }
  
    // @LINE:39
    def getFeedbackFromProduct(pid:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/product/feedback/" + implicitly[PathBindable[Integer]].unbind("pid", pid))
    }
  
    // @LINE:37
    def getItemsPerCategory(category:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/itemsByCat/" + implicitly[PathBindable[String]].unbind("category", dynamicString(category)))
    }
  
    // @LINE:36
    def getItemByID(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv/items/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:8
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "DealItSrv")
    }
  
  }


}
