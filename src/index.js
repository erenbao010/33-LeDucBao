const express = require('express');
const fs = require('fs');
const app = express();
const port = 8000;
app.use(express.json());


app.post('/api/send-data', (req, res) => {
  const data = req.body;

  // save data 
  fs.writeFile('src/output.json', JSON.stringify(data), (err) => {
    if (err) {
      console.error(err);
      res.status(500).send('Error writing to file');
    } else {
      res.send('Data saved successfully');
    }
  });
});


// get api all data 
app.get('/api/get-all-data', (req, res) => {
  fs.readFile('src/output.json', 'utf8', (err, data) => {
    if (err) {
      console.error(err);
      
      res.status(500).send('Error reading file');
    } else {
      const jsonData = JSON.parse(data);
      res.json(jsonData);
    }
  });
});


// get API data country
app.get('/api/get-data-by-country', (req, res) => {
  const country = req.query.country;

  fs.readFile('src/output.json', 'utf8', (err, data) => {
    if (err) {
      console.error(err);
      res.status(500).send('Error reading file');
    } else {
      const jsonData = JSON.parse(data);
      const filteredData = jsonData.filter((item) => item.country === country);
      res.json(filteredData);
    }
  });
});


app.listen(port, () => {
  console.log(`Server started on port ${port}`);
});