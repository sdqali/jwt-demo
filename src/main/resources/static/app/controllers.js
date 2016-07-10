(function(angular) {
  var AppController = function($scope, Login) {
    $scope.profile = {};
    $scope.login = function(username, password) {
      new Login({username: username, password: password})
          .$login(function (profile) {
            $scope.profile = profile;
          }, function (error) {
            console.log(error);
          });
    };
  };

  AppController.$inject = ['$scope', 'Login'];
  angular.module("jwtDemo.controllers").controller("AppController", AppController);
}(angular));