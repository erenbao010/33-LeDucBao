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
  ABC.push(req.body);
    
  res.json(ABC);
});

const generateBefore = performance.now();
function generate(req, res) {
    res.send({size
        })
    }
    route.post("/getUser", generate, (req, res) => {
        res.send("add users");
    });

const generateAfter = performance.now();
console.log (performance = generateAfter - generateBefore);
module.exports = route;


