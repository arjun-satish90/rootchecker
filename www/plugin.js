
var exec = require('cordova/exec');

var PLUGIN_NAME = 'RootChecker';

var MyCordovaPlugin = {
   isRooted: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'isRooted', []);
  }
};

module.exports = MyCordovaPlugin;
