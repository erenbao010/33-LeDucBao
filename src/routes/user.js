const express = require('express');
const route = express.Router();
function createUser(req,res, next) {
    const {name, age, skills} = req.body;
    res.send({
        name, age, skills
    })
   
}
route.post('/getUser', createUser, (req, res) => {
    res.send("add users");
  });

  module.exports = route;