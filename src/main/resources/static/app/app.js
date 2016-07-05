(function(angular) {
  angular.module("jwtDemo.controllers", []);
  angular.module("jwtDemo.services", []);
  angular.module("jwtDemo", ["ngResource", "jwtDemo.controllers", "jwtDemo.services"]);
}(angular));