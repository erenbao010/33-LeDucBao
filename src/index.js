const express = require('express');
const fs = require('fs');
const app = express();
const port = 8000;
app.use(express.json());

// API to receive data and save it to the server side
app.post('/api/send-data', (req, res) => {
  const data = req.body;

  // Save data to a file named "output.json"
  fs.writeFile('src/output.json', JSON.stringify(data), (err) => {
    if (err) {
      console.error(err);
      res.status(500).send('Error writing to file');
    } else {
      res.send('Data saved successfully');
    }
  });
});

// API to get all data from "output.json"
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

// API to get data based on the "country" filter parameter
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

// Start the server
app.listen(port, () => {
  console.log(`Server started on port ${port}`);
});