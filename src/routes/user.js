const express = require("express");
const route = express.Router();
function createUser(req, res, next) {
  // const objects = req.body;
  const {} = req.body;
  // { name: '', age: 1,  }
  // []
  // res.send([{
  //   name: objects.name,
  //   age: objects.age,
  //   skills: objects.skills
  // }]);
  
    res.send([{
    }]);
}


route.post("/getUser", createUser, (req, res) => {

});


module.exports = route;


