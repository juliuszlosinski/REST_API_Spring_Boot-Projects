import axios from 'axios';

const MONSTERS_REST_API_URL = 'http://localhost:8080/api/monsters';

class MonsterService
{
    getUsers()
    {
        return axios.get(MONSTERS_REST_API_URL);
    }
}

export default new MonsterService();