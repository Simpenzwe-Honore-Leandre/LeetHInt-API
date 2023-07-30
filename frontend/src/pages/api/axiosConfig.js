import axios from 'axios';

export default async function handler(req, res) {
  const { leetcodeId } = req.query;

  try {
    const response = await axios.get(`http://localhost:8080/api/v1/Hints/${leetcodeId}`);
    const hint = response.data;
    res.status(200).json(hint);
  } catch (error) {
    console.log(error);
    res.status(500).json({ message: 'Something went wrong' });
  }
}
