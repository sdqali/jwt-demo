(function(angular) {
  var LoginFactory = function($resource) {
    return $resource('/login', {}, {
      login: {
        method: 'POST'
      }
    });
  };

  LoginFactory.$inject = ['$resource'];
  angular.module('jwtDemo.services').factory('Login', LoginFactory);
}(angular));