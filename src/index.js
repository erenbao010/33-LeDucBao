const express = require('express')
const app = express();
const port = 8000
const userRoute = require('./routes/user');
app.use(express.json());
// app.use(express)
app.use(userRoute);
app.get('/', (req, res) => {
  res.send('Hello World!')
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})