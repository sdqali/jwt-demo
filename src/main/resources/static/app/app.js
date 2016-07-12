(function(angular) {
  angular.module("jwtDemo.controllers", []);
  angular.module("jwtDemo.services", []);
  angular.module("jwtDemo", ["ngResource", "ngStorage", "jwtDemo.controllers", "jwtDemo.services"]);
}(angular));